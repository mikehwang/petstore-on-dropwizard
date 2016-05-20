package com.notswagger;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import io.swagger.api.PetsApi;
import io.swagger.jaxrs.config.BeanConfig;
import io.swagger.jaxrs.listing.ApiListingResource;
import io.swagger.jaxrs.listing.SwaggerSerializers;
import io.swagger.models.Contact;
import io.swagger.models.Info;

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
        // This Info object was lifted from the Swagger generated io.swagger.api.Bootstrap file. Although it was not generated
        // correctly.
        Info info = new Info().title("Swagger Petstore (Simple)").version("0.1.0")
                .description("A sample API that uses a petstore as an example to demonstrate features in the swagger-2.0 specification")
                .contact(new Contact().email("foo@example.com"));
        // Swagger/servlet/jax-rs magic!
        BeanConfig beanConfig = new BeanConfig();
        beanConfig.setInfo(info);
        beanConfig.setResourcePackage("io.swagger.api");
        beanConfig.setScan(true);
    }

    @Override
    public void run(final petstoreConfiguration configuration,
                    final Environment environment) {
        // Wire up the api resource class here
        environment.jersey().register(PetsApi.class);

        // https://github.com/swagger-api/swagger-core/wiki/Swagger-Core-Jersey-2.X-Project-Setup-1.5
        environment.jersey().register(new ApiListingResource());
        environment.jersey().register(new SwaggerSerializers());
    }

}
