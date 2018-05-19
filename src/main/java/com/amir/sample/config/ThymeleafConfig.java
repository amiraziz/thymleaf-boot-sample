package com.amir.sample.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.thymeleaf.ThymeleafProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.thymeleaf.spring5.ISpringTemplateEngine;
import org.thymeleaf.spring5.view.ThymeleafViewResolver;

/**
 * @author am.azizkhani on 2018-05-16.
 */
@Configuration
@EnableWebMvc
@EnableConfigurationProperties(ThymeleafProperties.class)
public class ThymeleafConfig
        implements WebMvcConfigurer {


    @Autowired
    private final ISpringTemplateEngine templateEngine;

    public ThymeleafConfig(final ISpringTemplateEngine engine) {
        templateEngine = engine;
    }

    @Bean
    public ThymeleafViewResolver thymeleafChunkedAndDataDrivenViewResolver() {
        final ThymeleafViewResolver viewResolver = new ThymeleafViewResolver();
        viewResolver.setTemplateEngine(templateEngine);
        viewResolver.setOrder(1);
        return viewResolver;
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
    }
}