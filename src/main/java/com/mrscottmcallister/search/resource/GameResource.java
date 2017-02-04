package com.mrscottmcallister.search.resource;

import com.mrscottmcallister.search.api.Game;
import com.mrscottmcallister.search.elastic.GameDao;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.io.IOException;
import java.util.List;

@Path("/game")
@Produces(MediaType.APPLICATION_JSON)
public class GameResource {
    GameDao dao;

    public GameResource(GameDao dao){
        this.dao = dao;
    }

    @GET
    public List<Game> getGames(@QueryParam("name") String name) throws IOException{
        System.out.println("getting games for search "+name);
        List<Game> games = dao.searchByTitle(name);
        return games;
    }
}
