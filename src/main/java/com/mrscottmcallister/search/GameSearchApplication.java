package com.mrscottmcallister.search;

import com.mrscottmcallister.search.resource.GameResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Environment;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.transport.client.PreBuiltTransportClient;

import java.net.InetAddress;

/**
 * Created by smcallister on 2017-01-28.
 */
public class GameSearchApplication extends Application<GameSearchConfiguration> {
    public static void main(String[] args) throws Exception{
        new GameSearchApplication().run(args);
    }

    @Override
    public String getName() {
        return "hello-world";
    }

    public void run(GameSearchConfiguration configuration, Environment environment) throws Exception {
        // nothing yet...
        final GameResource resource = new GameResource();
        environment.jersey().register(resource);
        TransportClient client = new PreBuiltTransportClient(Settings.EMPTY)
                .addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName("localhost"), 9300));
    }
}
