package com.mrscottmcallister.search;

import com.mrscottmcallister.search.resource.GameResource;
import com.mrscottmcallister.search.elastic.GameDao;
import io.dropwizard.Application;
import io.dropwizard.assets.AssetsBundle;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import io.searchbox.client.JestClient;
import io.searchbox.client.JestClientFactory;
import io.searchbox.client.config.HttpClientConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by smcallister on 2017-01-28.
 */
public class GameSearchApplication extends Application<GameSearchConfiguration> {
    private static final Logger logger = LoggerFactory.getLogger(GameSearchConfiguration.class);
    private JestClient jestClient;
    private GameDao gameDao;

    public static void main(String[] args) throws Exception {
        new GameSearchApplication().run(args);
    }

    public JestClient getJestClient() {
        return jestClient;
    }

    @Override
    public String getName() {
        return "dropwizard-elastic";
    }

    @Override
    public void initialize(Bootstrap<GameSearchConfiguration> bootstrap) {
        JestClientFactory factory = new JestClientFactory();
        factory.setHttpClientConfig(new HttpClientConfig
                .Builder("http://localhost:9200")
                .multiThreaded(true)
                .build());
        jestClient = factory.getObject();
        gameDao = new GameDao(jestClient);
        bootstrap.addBundle(new AssetsBundle("/ui", "/", "index.html"));
    }

    @Override
    public void run(GameSearchConfiguration config, Environment environment) throws Exception {
        logger.info("Running the application");
        final GameResource gameResource = new GameResource(gameDao);
        environment.jersey().setUrlPattern("/api/*");
        environment.jersey().register(gameResource);
    }
}
