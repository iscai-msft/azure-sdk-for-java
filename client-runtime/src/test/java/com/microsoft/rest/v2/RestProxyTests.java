package com.microsoft.rest.v2;

import com.microsoft.rest.RestException;
import com.microsoft.rest.protocol.SerializerAdapter;
import com.microsoft.rest.serializer.JacksonAdapter;
import com.microsoft.rest.v2.annotations.BodyParam;
import com.microsoft.rest.v2.annotations.DELETE;
import com.microsoft.rest.v2.annotations.ExpectedResponse;
import com.microsoft.rest.v2.annotations.GET;
import com.microsoft.rest.v2.annotations.HEAD;
import com.microsoft.rest.v2.annotations.HeaderParam;
import com.microsoft.rest.v2.annotations.Headers;
import com.microsoft.rest.v2.annotations.Host;
import com.microsoft.rest.v2.annotations.HostParam;
import com.microsoft.rest.v2.annotations.PATCH;
import com.microsoft.rest.v2.annotations.POST;
import com.microsoft.rest.v2.annotations.PUT;
import com.microsoft.rest.v2.annotations.PathParam;
import com.microsoft.rest.v2.annotations.QueryParam;
import com.microsoft.rest.v2.annotations.UnexpectedResponseExceptionType;
import com.microsoft.rest.v2.http.HttpClient;
import com.microsoft.rest.v2.http.HttpHeaders;
import org.junit.Test;
import retrofit2.http.Path;
import rx.Completable;
import rx.Single;

import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedHashMap;

import static org.junit.Assert.*;

public abstract class RestProxyTests {

    /**
     * Get the HTTP client that will be used for each test. This will be called once per test.
     * @return The HTTP client to use for each test.
     */
    protected abstract HttpClient createHttpClient();

    @Host("http://httpbin.org")
    private interface Service1 {
        @GET("bytes/100")
        @ExpectedResponse({200})
        byte[] getByteArray();

        @GET("bytes/100")
        @ExpectedResponse({200})
        Single<byte[]> getByteArrayAsync();
    }

    @Test
    public void SyncRequestWithByteArrayReturnType() {
        final byte[] result = createService(Service1.class)
                .getByteArray();
        assertNotNull(result);
        assertEquals(result.length, 100);
    }

    @Test
    public void AsyncRequestWithByteArrayReturnType() {
        final byte[] result = createService(Service1.class)
                .getByteArrayAsync()
                .toBlocking().value();
        assertNotNull(result);
        assertEquals(result.length, 100);
    }

    @Host("http://{hostName}.org")
    private interface Service2 {
        @GET("bytes/{numberOfBytes}")
        @ExpectedResponse({200})
        byte[] getByteArray(@HostParam("hostName") String host, @PathParam("numberOfBytes") int numberOfBytes);

        @GET("bytes/{numberOfBytes}")
        @ExpectedResponse({200})
        Single<byte[]> getByteArrayAsync(@HostParam("hostName") String host, @PathParam("numberOfBytes") int numberOfBytes);
    }

    @Test
    public void SyncRequestWithByteArrayReturnTypeAndParameterizedHostAndPath() {
        final byte[] result = createService(Service2.class)
                .getByteArray("httpbin", 50);
        assertNotNull(result);
        assertEquals(result.length, 50);
    }

    @Test
    public void AsyncRequestWithByteArrayReturnTypeAndParameterizedHostAndPath() {
        final byte[] result = createService(Service2.class)
                .getByteArrayAsync("httpbin", 50)
                .toBlocking().value();
        assertNotNull(result);
        assertEquals(result.length, 50);
    }

    @Host("http://httpbin.org")
    private interface Service3 {
        @GET("bytes/2")
        @ExpectedResponse({200})
        void getNothing();

        @GET("bytes/2")
        @ExpectedResponse({200})
        Completable getNothingAsync();
    }

    @Test
    public void SyncGetRequestWithNoReturn() {
        createService(Service3.class).getNothing();
    }

    @Test
    public void AsyncGetRequestWithNoReturn() {
        createService(Service3.class)
                .getNothingAsync()
                .await();
    }

    @Host("http://httpbin.org")
    private interface Service4 {
        @GET("bytes/2")
        @ExpectedResponse({200})
        InputStream getByteStream();

        @GET("bytes/2")
        @ExpectedResponse({200})
        Single<InputStream> getByteStreamAsync();
    }

    @Test
    public void SyncGetRequestWithInputStreamReturn() throws IOException {
        final InputStream byteStream = createService(Service4.class)
                .getByteStream();
        final byte[] buffer = new byte[10];
        assertEquals(2, byteStream.read(buffer));
        assertEquals(-1, byteStream.read(buffer));
    }

    @Test
    public void AsyncGetRequestWithInputStreamReturn() throws IOException {
        final InputStream byteStream = createService(Service4.class)
                .getByteStreamAsync()
                .toBlocking().value();
        final byte[] buffer = new byte[10];
        assertEquals(2, byteStream.read(buffer));
        assertEquals(-1, byteStream.read(buffer));
    }

    @Host("http://httpbin.org")
    private interface Service5 {
        @GET("anything")
        @ExpectedResponse({200})
        HttpBinJSON getAnything();

        @GET("anything/with+plus")
        @ExpectedResponse({200})
        HttpBinJSON getAnythingWithPlus();

        @GET("anything/{path}")
        @ExpectedResponse({200})
        HttpBinJSON getAnythingWithPathParam(@PathParam("path") String pathParam);

        @GET("anything/{path}")
        @ExpectedResponse({200})
        HttpBinJSON getAnythingWithEncodedPathParam(@PathParam(value="path", encoded=true) String pathParam);

        @GET("anything")
        @ExpectedResponse({200})
        Single<HttpBinJSON> getAnythingAsync();
    }

    @Test
    public void SyncGetRequestWithAnything() {
        final HttpBinJSON json = createService(Service5.class)
                .getAnything();
        assertNotNull(json);
        assertEquals("http://httpbin.org/anything", json.url);
    }

    @Test
    public void SyncGetRequestWithAnythingWithPlus() {
        final HttpBinJSON json = createService(Service5.class)
                .getAnythingWithPlus();
        assertNotNull(json);
        assertEquals("http://httpbin.org/anything/with+plus", json.url);
    }

    @Test
    public void SyncGetRequestWithAnythingWithPathParam() {
        final HttpBinJSON json = createService(Service5.class)
                .getAnythingWithPathParam("withpathparam");
        assertNotNull(json);
        assertEquals("http://httpbin.org/anything/withpathparam", json.url);
    }

    @Test
    public void SyncGetRequestWithAnythingWithPathParamWithSpace() {
        final HttpBinJSON json = createService(Service5.class)
                .getAnythingWithPathParam("with path param");
        assertNotNull(json);
        assertEquals("http://httpbin.org/anything/with path param", json.url);
    }

    @Test
    public void SyncGetRequestWithAnythingWithPathParamWithPlus() {
        final HttpBinJSON json = createService(Service5.class)
                .getAnythingWithPathParam("with+path+param");
        assertNotNull(json);
        assertEquals("http://httpbin.org/anything/with+path+param", json.url);
    }

    @Test
    public void SyncGetRequestWithAnythingWithEncodedPathParam() {
        final HttpBinJSON json = createService(Service5.class)
                .getAnythingWithEncodedPathParam("withpathparam");
        assertNotNull(json);
        assertEquals("http://httpbin.org/anything/withpathparam", json.url);
    }

    @Test
    public void SyncGetRequestWithAnythingWithEncodedPathParamWithPercent20() {
        final HttpBinJSON json = createService(Service5.class)
                .getAnythingWithEncodedPathParam("with%20path%20param");
        assertNotNull(json);
        assertEquals("http://httpbin.org/anything/with path param", json.url);
    }

    @Test
    public void SyncGetRequestWithAnythingWithEncodedPathParamWithPlus() {
        final HttpBinJSON json = createService(Service5.class)
                .getAnythingWithEncodedPathParam("with+path+param");
        assertNotNull(json);
        assertEquals("http://httpbin.org/anything/with+path+param", json.url);
    }

    @Test
    public void AsyncGetRequestWithAnything() {
        final HttpBinJSON json = createService(Service5.class)
                .getAnythingAsync()
                .toBlocking().value();
        assertNotNull(json);
        assertEquals("http://httpbin.org/anything", json.url);
    }

    @Host("http://httpbin.org")
    private interface Service6 {
        @GET("anything")
        @ExpectedResponse({200})
        HttpBinJSON getAnything(@QueryParam("a") String a, @QueryParam("b") int b);

        @GET("anything")
        @ExpectedResponse({200})
        HttpBinJSON getAnythingWithEncoded(@QueryParam(value="a", encoded=true) String a, @QueryParam("b") int b);

        @GET("anything")
        @ExpectedResponse({200})
        Single<HttpBinJSON> getAnythingAsync(@QueryParam("a") String a, @QueryParam("b") int b);
    }

    @Test
    public void SyncGetRequestWithQueryParametersAndAnything() {
        final HttpBinJSON json = createService(Service6.class)
                .getAnything("A", 15);
        assertNotNull(json);
        assertEquals("http://httpbin.org/anything?a=A&b=15", json.url);
    }

    @Test
    public void SyncGetRequestWithQueryParametersAndAnythingWithPercent20() {
        final HttpBinJSON json = createService(Service6.class)
                .getAnything("A%20Z", 15);
        assertNotNull(json);
        assertEquals("http://httpbin.org/anything?a=A%2520Z&b=15", json.url);
    }

    @Test
    public void SyncGetRequestWithQueryParametersAndAnythingWithEncodedWithPercent20() {
        final HttpBinJSON json = createService(Service6.class)
                .getAnythingWithEncoded("x%20y", 15);
        assertNotNull(json);
        assertEquals("http://httpbin.org/anything?a=x y&b=15", json.url);
    }

    @Test
    public void AsyncGetRequestWithQueryParametersAndAnything() {
        final HttpBinJSON json = createService(Service6.class)
                .getAnythingAsync("A", 15)
                .toBlocking().value();
        assertNotNull(json);
        assertEquals("http://httpbin.org/anything?a=A&b=15", json.url);
    }

    @Host("http://httpbin.org")
    private interface Service7 {
        @GET("anything")
        @ExpectedResponse({200})
        HttpBinJSON getAnything(@HeaderParam("a") String a, @HeaderParam("b") int b);

        @GET("anything")
        @ExpectedResponse({200})
        Single<HttpBinJSON> getAnythingAsync(@HeaderParam("a") String a, @HeaderParam("b") int b);
    }

    @Test
    public void SyncGetRequestWithHeaderParametersAndAnythingReturn() {
        final HttpBinJSON json = createService(Service7.class)
                .getAnything("A", 15);
        assertNotNull(json);
        assertEquals("http://httpbin.org/anything", json.url);
        assertNotNull(json.headers);
        final HttpHeaders headers = new HttpHeaders(json.headers);
        assertEquals("A", headers.value("A"));
        assertArrayEquals(new String[]{"A"}, headers.values("A"));
        assertEquals("15", headers.value("B"));
        assertArrayEquals(new String[]{"15"}, headers.values("B"));
    }

    @Test
    public void AsyncGetRequestWithHeaderParametersAndAnything() {
        final HttpBinJSON json = createService(Service7.class)
                .getAnythingAsync("A", 15)
                .toBlocking().value();
        assertNotNull(json);
        assertEquals("http://httpbin.org/anything", json.url);
        assertNotNull(json.headers);
        final HttpHeaders headers = new HttpHeaders(json.headers);
        assertEquals("A", headers.value("A"));
        assertArrayEquals(new String[]{"A"}, headers.values("A"));
        assertEquals("15", headers.value("B"));
        assertArrayEquals(new String[]{"15"}, headers.values("B"));
    }

    @Host("http://httpbin.org")
    private interface Service8 {
        @POST("post")
        @ExpectedResponse({200})
        HttpBinJSON post(@BodyParam String postBody);

        @POST("post")
        @ExpectedResponse({200})
        Single<HttpBinJSON> postAsync(@BodyParam String postBody);
    }

    @Test
    public void SyncPostRequestWithStringBody() {
        final HttpBinJSON json = createService(Service8.class)
                .post("I'm a post body!");
        assertEquals(String.class, json.data.getClass());
        assertEquals("\"I'm a post body!\"", (String)json.data);
    }

    @Test
    public void AsyncPostRequestWithStringBody() {
        final HttpBinJSON json = createService(Service8.class)
                .postAsync("I'm a post body!")
                .toBlocking().value();
        assertEquals(String.class, json.data.getClass());
        assertEquals("\"I'm a post body!\"", (String)json.data);
    }

    @Host("http://httpbin.org")
    private interface Service9 {
        @PUT("put")
        @ExpectedResponse({200})
        HttpBinJSON put(@BodyParam int putBody);

        @PUT("put")
        @ExpectedResponse({200})
        Single<HttpBinJSON> putAsync(@BodyParam int putBody);

        @PUT("put")
        @ExpectedResponse({201})
        HttpBinJSON putWithUnexpectedResponse(@BodyParam String putBody);

        @PUT("put")
        @ExpectedResponse({201})
        @UnexpectedResponseExceptionType(MyRestException.class)
        HttpBinJSON putWithUnexpectedResponseAndExceptionType(@BodyParam String putBody);
    }

    @Test
    public void SyncPutRequestWithIntBody() {
        final HttpBinJSON json = createService(Service9.class)
                .put(42);
        assertEquals(String.class, json.data.getClass());
        assertEquals("42", (String)json.data);
    }

    @Test
    public void AsyncPutRequestWithIntBody() {
        final HttpBinJSON json = createService(Service9.class)
                .putAsync(42)
                .toBlocking().value();
        assertEquals(String.class, json.data.getClass());
        assertEquals("42", (String)json.data);
    }

    @Test
    public void SyncPutRequestWithUnexpectedResponse() {
        try {
            createService(Service9.class)
                    .putWithUnexpectedResponse("I'm the body!");
            fail("Expected RestException would be thrown.");
        } catch (RestException e) {
            assertNotNull(e.body());
            assertTrue(e.body() instanceof LinkedHashMap);

            final LinkedHashMap<String,String> expectedBody = (LinkedHashMap<String, String>)e.body();
            assertEquals("\"I'm the body!\"", expectedBody.get("data"));
        }
    }

    @Test
    public void SyncPutRequestWithUnexpectedResponseAndExceptionType() {
        try {
            createService(Service9.class)
                    .putWithUnexpectedResponseAndExceptionType("I'm the body!");
            fail("Expected RestException would be thrown.");
        } catch (MyRestException e) {
            assertNotNull(e.body());
            assertEquals("\"I'm the body!\"", e.body().data);
        } catch (Throwable e) {
            fail("Throwable of wrong type thrown.");
        }
    }

    @Host("http://httpbin.org")
    private interface Service10 {
        @HEAD("get")
        @ExpectedResponse({200})
        HttpBinJSON head();

        @HEAD("get")
        @ExpectedResponse({200})
        void voidHead();

        @HEAD("get")
        @ExpectedResponse({200})
        Single<HttpBinJSON> headAsync();

        @HEAD("get")
        @ExpectedResponse({200})
        Completable completableHeadAsync();
    }

    @Test
    public void SyncHeadRequest() {
        final HttpBinJSON json = createService(Service10.class)
                .head();
        assertNull(json);
    }

    @Test
    public void SyncVoidHeadRequest() {
        createService(Service10.class)
                .voidHead();
    }

    @Test
    public void AsyncHeadRequest() {
        final HttpBinJSON json = createService(Service10.class)
                .headAsync()
                .toBlocking().value();
        assertNull(json);
    }

    @Test
    public void AsyncCompletableHeadRequest() {
        createService(Service10.class)
                .completableHeadAsync()
                .await();
    }

    @Host("http://httpbin.org")
    private interface Service11 {
        @DELETE("delete")
        @ExpectedResponse({200})
        HttpBinJSON delete(@BodyParam boolean bodyBoolean);

        @DELETE("delete")
        @ExpectedResponse({200})
        Single<HttpBinJSON> deleteAsync(@BodyParam boolean bodyBoolean);
    }

    @Test
    public void SyncDeleteRequest() {
        final HttpBinJSON json = createService(Service11.class)
                .delete(false);
        assertEquals(String.class, json.data.getClass());
        assertEquals("false", (String)json.data);
    }

    @Test
    public void AsyncDeleteRequest() {
        final HttpBinJSON json = createService(Service11.class)
                .deleteAsync(false)
                .toBlocking().value();
        assertEquals(String.class, json.data.getClass());
        assertEquals("false", (String)json.data);
    }

    @Host("http://httpbin.org")
    private interface Service12 {
        @PATCH("patch")
        @ExpectedResponse({200})
        HttpBinJSON patch(@BodyParam String bodyString);

        @PATCH("patch")
        @ExpectedResponse({200})
        Single<HttpBinJSON> patchAsync(@BodyParam String bodyString);
    }

    @Test
    public void SyncPatchRequest() {
        final HttpBinJSON json = createService(Service12.class)
                .patch("body-contents");
        assertEquals(String.class, json.data.getClass());
        assertEquals("\"body-contents\"", (String)json.data);
    }

    @Test
    public void AsyncPatchRequest() {
        final HttpBinJSON json = createService(Service12.class)
                .patchAsync("body-contents")
                .toBlocking().value();
        assertEquals(String.class, json.data.getClass());
        assertEquals("\"body-contents\"", (String)json.data);
    }

    @Host("http://httpbin.org")
    private interface Service13 {
        @GET("anything")
        @ExpectedResponse({200})
        @Headers({ "MyHeader:MyHeaderValue", "MyOtherHeader:My,Header,Value" })
        HttpBinJSON get();

        @GET("anything")
        @ExpectedResponse({200})
        @Headers({ "MyHeader:MyHeaderValue", "MyOtherHeader:My,Header,Value" })
        Single<HttpBinJSON> getAsync();
    }

    @Test
    public void SyncHeadersRequest() {
        final HttpBinJSON json = createService(Service13.class)
                .get();
        assertNotNull(json);
        assertEquals("http://httpbin.org/anything", json.url);
        assertNotNull(json.headers);
        final HttpHeaders headers = new HttpHeaders(json.headers);
        assertEquals("MyHeaderValue", headers.value("MyHeader"));
        assertArrayEquals(new String[]{"MyHeaderValue"}, headers.values("MyHeader"));
        assertEquals("My,Header,Value", headers.value("MyOtherHeader"));
        assertArrayEquals(new String[]{"My", "Header", "Value"}, headers.values("MyOtherHeader"));
    }

    @Test
    public void AsyncHeadersRequest() {
        final HttpBinJSON json = createService(Service13.class)
                .getAsync()
                .toBlocking().value();
        assertNotNull(json);
        assertEquals("http://httpbin.org/anything", json.url);
        assertNotNull(json.headers);
        final HttpHeaders headers = new HttpHeaders(json.headers);
        assertEquals("MyHeaderValue", headers.value("MyHeader"));
        assertArrayEquals(new String[]{"MyHeaderValue"}, headers.values("MyHeader"));
    }

    @Host("https://httpbin.org")
    private interface Service14 {
        @GET("anything")
        @ExpectedResponse({200})
        @Headers({ "MyHeader:MyHeaderValue" })
        HttpBinJSON get();

        @GET("anything")
        @ExpectedResponse({200})
        @Headers({ "MyHeader:MyHeaderValue" })
        Single<HttpBinJSON> getAsync();
    }

    @Test
    public void AsyncHttpsHeadersRequest() {
        final HttpBinJSON json = createService(Service14.class)
                .getAsync()
                .toBlocking().value();
        assertNotNull(json);
        assertEquals("https://httpbin.org/anything", json.url);
        assertNotNull(json.headers);
        final HttpHeaders headers = new HttpHeaders(json.headers);
        assertEquals("MyHeaderValue", headers.value("MyHeader"));
    }

    // Helpers
    private <T> T createService(Class<T> serviceClass) {
        final HttpClient httpClient = createHttpClient();
        return RestProxy.create(serviceClass, httpClient, serializer);
    }

    private static final SerializerAdapter<?> serializer = new JacksonAdapter();
}
