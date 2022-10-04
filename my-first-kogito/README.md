# Ground Zero
### Using Springboot

Refer: https://docs.jboss.org/kogito/release/1.27.0/html_single/#proc-kogito-creating-project_kogito-creating-running

- Create a maven project using Maven Archetype for Kogito
    ``` 
    mvn archetype:generate -DarchetypeGroupId=org.kie.kogito -DarchetypeArtifactId=kogito-spring-boot-archetype -DgroupId=org.acme -DartifactId=my-first-kogito -DarchetypeVersion=1.27.0.Final -Dversion=1.0-SNAPSHOT
    ```


- Compile and Run

    ```
    mvn clean package spring-boot:run    
    ```

# Test your application

Generated application comes with sample test process that allows you to verify if the application is working as expected. Simply execute following command to try it out

```sh
curl -d '{}' -H "Content-Type: application/json" -X POST http://localhost:8080/greetings
                                                             
```

**Once successfully invoked you should see "Hello World" in the console of the running application.**

The generated application provides out of the box multiple samples of Kogito assets; you can reference the generated Swagger documentation and JUnit tests.

# Developing

Add your business assets resources (process definition, rules, decisions) into src/main/resources.

Add your java classes (data model, utilities, services) into src/main/java.

Then just build the project and run.


# OpenAPI (Swagger) documentation
[Specification at swagger.io](https://swagger.io/docs/specification/about/)

You can take a look at the [OpenAPI definition](http://localhost:8080/v3/api-docs) - automatically generated and included in this service - to determine all available operations exposed by this service. For easy readability you can visualize the OpenAPI definition file using a UI tool like for example available [Swagger UI](https://editor.swagger.io).

In addition, various clients to interact with this service can be easily generated using this OpenAPI definition.