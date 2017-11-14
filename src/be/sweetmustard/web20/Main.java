package be.sweetmustard.web20;

import jdk.incubator.http.HttpClient;
import jdk.incubator.http.HttpRequest;
import jdk.incubator.http.HttpResponse;

import java.net.URI;
import java.util.concurrent.CompletableFuture;

public class Main {
    public static void main(String[] args) {
        async();
    }

    private static void sync() {
        try {
            HttpClient client = HttpClient.newHttpClient();

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI("http://kanariepiet.com//"))
                    .GET()
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandler.asString());
            System.out.println(response.statusCode());
            System.out.println(response.body());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void async() {
        try {
            HttpClient client = HttpClient.newHttpClient();

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI("http://kanariepiet.com//"))
                    .GET()
                    .build();

            CompletableFuture<HttpResponse<String>> asyncResponse = client.sendAsync(request, HttpResponse.BodyHandler.asString());
            HttpResponse<String> response = asyncResponse.get();
            System.out.println(response.statusCode());
            System.out.println(response.body());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
