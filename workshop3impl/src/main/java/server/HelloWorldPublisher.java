package server;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.grizzly.http.server.HttpServer;

import java.io.IOException;
import java.net.URI;

// This class is responsible for starting the Grizzly HTTP server and publishing the RESTful web service.
public class HelloWorldPublisher {
    public static final String BASE_URI = "http://localhost:7779/ws/";

    // Starts the Grizzly HTTP server with the given configuration.
    public static HttpServer startServer() {
        final ResourceConfig rc = new ResourceConfig().packages("server");

        // Creates and starts the HTTP server with the specified configuration.
        return GrizzlyHttpServerFactory.createHttpServer(URI.create(BASE_URI), rc);
    }

    public static void main(String[] args) throws IOException {
        // Starts the server and prints a message indicating the server is running.
        final HttpServer server = startServer();
        System.out.println(String.format("Jersey app started with WADL available at "
                + "%sapplication.wadl\nHit enter to stop it...", BASE_URI));
        System.in.read(); // Waits for an Enter key press to stop the server.
        server.shutdownNow(); // Shuts down the server.
    }
}
