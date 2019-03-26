package com.microsoft.azure.keyvault.test;

import com.azure.common.http.HttpClient;
import com.azure.common.http.HttpPipeline;
import com.azure.common.http.HttpPipelineCallContext;
import com.azure.common.http.HttpPipelineNextPolicy;
import com.azure.common.http.HttpRequest;
import com.azure.common.http.HttpResponse;
import com.azure.common.http.policy.HttpPipelinePolicy;
import com.microsoft.azure.credentials.ApplicationTokenCredentials;
import com.microsoft.azure.keyvault.KeyVaultClientBase;
import com.microsoft.azure.keyvault.implementation.KeyVaultClientBaseImpl;
import com.microsoft.azure.management.keyvault.Secret;
import org.junit.Assert;
import org.junit.Test;
import reactor.core.publisher.Mono;

import java.io.File;
import java.io.IOException;

public class SecretTests {
    @Test
    public void canCreateSecret() {
        KeyVaultClientBase keyVaultClientBase = new KeyVaultClientBaseImpl(new HttpPipeline(new HttpPipelinePolicy() {
            @Override
            public Mono<HttpResponse> process(HttpPipelineCallContext context, HttpPipelineNextPolicy next) {
                HttpRequest request = context.httpRequest().withBody(context.httpRequest().body().map(b -> b.retain()));
                return next.clone().process().flatMap(r -> {
                    String authorization = r.headerValue("WWW-Authenticate");
                    authorization = authorization.replace("Bearer", "").trim();
                    String[] splitAuthorization = authorization.split(",");
                    String authorizationValue = "";
                    String resourceValue = "";
                    for (String component : splitAuthorization) {
                        component = component.trim();
                        if (component.startsWith("authorization")) {
                            authorizationValue = component.split("=")[1].replace("\"", "");
                        }
                        if (component.startsWith("resource")) {
                            resourceValue = component.split("=")[1].replace("\"", "");
                        }
                    }
                    r.close();
                    try {
                        ApplicationTokenCredentials applicationTokenCredentials = ApplicationTokenCredentials.fromFile(new File("F:\\authfiles\\my2.azureauth"));
                        String authorizationHeader = applicationTokenCredentials.getToken(resourceValue);
                        request.withHeader("Authorization", "Bearer " + authorizationHeader);
                        return next.process();
                    } catch(IOException e) {
                        throw new RuntimeException(e);
                    }
                });
            }
        }));
        keyVaultClientBase.withApiVersion("7.0");
        keyVaultClientBase.setSecretAsync("https://todo20181105025332.vault.azure.net/", "nihao", "ma").block();

    }
}
