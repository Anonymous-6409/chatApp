package com.chatapp.chating.configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition
public class SwaggerConfig {

    @Bean
    OpenAPI custoOpenAPI(@Value("Chat Application") String appDesciption,
                         @Value("0.0.1") String appVersion,
                         @Value("Fake Chatters") String title){
        return new OpenAPI()
                .info( new Info()
                        .description(appDesciption)
                        .title(title)
                        .version(appVersion).license(new License().name("Arjun Singh")
                                .url("https://github.com/Anonymous-6409/")))
                .addServersItem(new Server().description("DEV").url("http://localhost:8080"))
                .addServersItem(new Server().description("UAT").url("https://anonymous-6409.github.io/chatApp/"));
    }

}
