package com.mrscottmcallister.search.elastic;

import com.mrscottmcallister.search.api.Game;

import java.io.IOException;
import java.util.List;
import io.searchbox.client.JestClient;
import io.searchbox.core.Search;
import io.searchbox.core.SearchResult;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.builder.SearchSourceBuilder;

import java.util.ArrayList;

/**
 * Created by smcallister on 2017-02-02.
 */
public class GameDao {

    private JestClient jestClient;

    public GameDao(JestClient jestClient) {
        this.jestClient = jestClient;
    }

    public JestClient getJestClient() {
        return jestClient;
    }

    public void setJestClient(JestClient jestClient) {
        this.jestClient = jestClient;
    }

    public List<Game> searchByTitle(String title) throws IOException {
        SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
        searchSourceBuilder.query(QueryBuilders.matchQuery("title", title));
        Search search = new Search.Builder(searchSourceBuilder.toString())
                .addIndex("games")
                .addType("game")
                .build();
        SearchResult results = jestClient.execute(search);
        results.getJsonObject();
        List<Game> response = new ArrayList<Game>();
        List<SearchResult.Hit<Game, Void>> hits = results.getHits(Game.class);
        for(SearchResult.Hit hit: hits){
            response.add((Game)hit.source);
        }
        return response;
    }
}
