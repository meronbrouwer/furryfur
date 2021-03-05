package nl.github.meron.ontheflyjee.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/")
public class HelloWorld {

    @GET
    public String hello() {
        return "Hello World";
    }
}
