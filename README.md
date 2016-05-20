# Swagger's *Petstore Simple* on Dropwizard

This project is a demo of a running instance of the Swagger sample project called [*petstore simple*](https://github.com/OAI/OpenAPI-Specification/blob/master/examples/v2.0/yaml/petstore-simple.yaml) on the Java framework [Dropwizard](http://www.dropwizard.io/0.9.2/docs/).

The purpose of this project is to show what is involved in building a barebone Dropwizard service starting from a Swagger specification of the target HTTP API.  The steps include:

1. Create the spec using the [Swagger editor](http://editor.swagger.io/#/)
2. Generate a JAX-RS server project via the Swagger editor
3. Generate the Dropwizard project
4. Merge the JAX-RS server project *into* the Dropwizard project

On generating the Dropwizard project, this project used the Maven [Dropwizard archetype](https://github.com/dropwizard/dropwizard/tree/master/dropwizard-archetypes) to generate the project.

## How to use this repository?

This project is meant to be instructional.  The recommended way to use this repository is to go through the commit history and look at the changes per commit.  That's where the pudding is and the hope is that you get a clear idea of what is involved in going down this path.

There's [one particular commit](https://github.com/mikehwang/petstore-on-dropwizard/commit/c597cbcf0a122168a7bdd8958575bd3f5f0d0278) that took a good afternoon of dependency-hell-wrestling to get things to work.

## Need help or have comments?

Please create a new issue.
