package com.notswagger;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import io.swagger.api.PetsApi;

public class petstoreApplication extends Application<petstoreConfiguration> {

    public static void main(final String[] args) throws Exception {
        new petstoreApplication().run(args);
    }

    @Override
    public String getName() {
        return "petstore";
    }

    @Override
    public void initialize(final Bootstrap<petstoreConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final petstoreConfiguration configuration,
                    final Environment environment) {
        // Wire up the api resource class here
        environment.jersey().register(PetsApi.class);
    }

}
