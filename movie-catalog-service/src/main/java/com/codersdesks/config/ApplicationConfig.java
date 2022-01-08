package com.codersdesks.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;


@Configuration
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "movie")
@Data
public class ApplicationConfig {

    private  String infoUrl;
    private  String ratingUrl;
}
