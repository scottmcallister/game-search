package com.mrscottmcallister.search.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.HashMap;
import java.util.Map;

@Path("/game")
@Produces(MediaType.APPLICATION_JSON)
public class GameResource {

    public GameResource(){}

    @GET
    public Game getGame(@QueryParam("name") String name) {
        Game result = new Game();
        return result;
    }
}
