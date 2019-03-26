// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.microsoft.azure.keyvault.authentication;

import java.net.URL;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import okhttp3.HttpUrl;

/**
 * Handles caching of the challenge.
 */
class ChallengeCache {

    private final HashMap<String, Map<String, String>> cachedChallenges = new HashMap<String, Map<String, String>>();

    /**
     * Uses authority to retrieve the cached values.
     * 
     * @param url
     *            the url that is used as a cache key.
     * @return cached value or null if value is not available.
     */
    public Map<String, String> getCachedChallenge(URL url) {
        if (url == null) {
            return null;
        }
        String authority = getAuthority(url);
        authority = authority.toLowerCase(Locale.ENGLISH);
        return cachedChallenges.get(authority);
    }

    /**
     * Uses authority to cache challenge.
     * 
     * @param url
     *            the url that is used as a cache key.
     * @param challenge
     *            the challenge to cache.
     */
    public void addCachedChallenge(URL url, Map<String, String> challenge) {
        if (url == null || challenge == null) {
            return;
        }
        String authority = getAuthority(url);
        authority = authority.toLowerCase(Locale.ENGLISH);
        cachedChallenges.put(authority, challenge);
    }

    /**
     * Gets authority of a url.
     * 
     * @param url
     *            the url to get the authority for.
     * @return the authority.
     */
    public String getAuthority(URL url) {
        String protocol = url.getProtocol();
        String host = url.getHost();
        int port = url.getPort();
        StringBuilder builder = new StringBuilder();
        if (protocol != null) {
            builder.append(protocol).append("://");
        }
        builder.append(host);
        if (port >= 0) {
            builder.append(':').append(port);
        }
        return builder.toString();
    }
}
