package com.amir.sample.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

/**
 * @author am.azizkhani on 2018-05-15.
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.amir.sample.controller"))
                .paths(PathSelectors.ant("/main/**"))
                .build().apiInfo(apiInfo())
                ;
    }

    private ApiInfo apiInfo() {
        return new ApiInfo(
                "My Boot Sample",
                "Some custom description of API.",
                "1.0.0_snapshot",
                "",
                new Contact("amir azizkhani", "/redirect", "amir.azizkhani.ros@gmail.com"),
                "", "", Collections.emptyList());
    }
}