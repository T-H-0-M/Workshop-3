package client;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.MediaType;

// This class is a simple client that sends a request to a RESTful web service.
// The client targets a specific URL, expects a JSON response, and prints the received response.
public class HelloWorldClient {
    public static void main(String[] args) {
        // Creating a new client instance using the ClientBuilder class.
        Client client = ClientBuilder.newClient();

        // Targeting the specific URL where the RESTful service is hosted.
        WebTarget target = client.target("http://localhost:7779/ws/hello/THOMAS");

        // Sending a GET request to the targeted URL and expecting a JSON response.
        // The response is then deserialized into a String.
        String response = target.request(MediaType.APPLICATION_JSON).get(String.class);

        // Printing the received response to the console.
        System.out.println(response);
    }
}
