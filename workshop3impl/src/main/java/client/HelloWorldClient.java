package client;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.MediaType;

public class HelloWorldClient {
    public static void main(String[] args) {
        Client client = ClientBuilder.newClient();

        WebTarget target = client.target("http://localhost:7779/ws/hello/THOMAS");

        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);

        System.out.println(response);
    }
}
