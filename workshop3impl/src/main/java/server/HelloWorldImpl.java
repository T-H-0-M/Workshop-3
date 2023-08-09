package server;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class HelloWorldImpl implements HelloWorld {
    @Override
    @GET
    @Path("/{param}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getHelloWorld(@PathParam("param") String param) {
        return "Hello World " + param;
    }
}
