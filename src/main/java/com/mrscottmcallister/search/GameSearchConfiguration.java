package com.mrscottmcallister.search;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;
import io.searchbox.client.JestClient;
import org.hibernate.validator.constraints.NotEmpty;


/**
 * Created by smcallister on 2017-01-28.
 */
public class GameSearchConfiguration extends Configuration {
    @JsonProperty
    protected JestClient elasticsearch;

    public JestClient getElasticsearch() {
        return elasticsearch;
    }
}
