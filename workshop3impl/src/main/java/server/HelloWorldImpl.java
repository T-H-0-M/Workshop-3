package server;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

// This class implements the HelloWorld interface and provides a RESTful web service endpoint.
@Path("/hello")
public class HelloWorldImpl implements HelloWorld {
    @Override
    @GET // Annotation for handling GET HTTP requests.
    @Path("/{param}") // Dynamic path parameter to capture input from the URL.
    @Produces(MediaType.APPLICATION_JSON) // Specifies the media type of the response (JSON).
    public String getHelloWorld(@PathParam("param") String param) {
        // Concatenates "Hello World " with the received parameter and returns the result.
        return "Hello World " + param;
    }
}
