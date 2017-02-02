package com.mrscottmcallister.search;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.meltmedia.dropwizard.jest.JestConfiguration;
import io.dropwizard.Configuration;
import org.hibernate.validator.constraints.NotEmpty;


/**
 * Created by smcallister on 2017-01-28.
 */
public class GameSearchConfiguration extends Configuration {
    @JsonProperty
    protected JestConfiguration elasticsearch;

    public JestConfiguration getElasticsearch() {
        return elasticsearch;
    }
}
