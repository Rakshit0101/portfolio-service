package com.site.portfolio.config;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiConfig {

    @Value("${api.version}")
    private String apiVersion;

    public String getApiVersion() {
        return apiVersion;
    }
}
