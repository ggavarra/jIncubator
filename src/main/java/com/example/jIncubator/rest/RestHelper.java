package com.example.jIncubator.rest;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.client.RestTemplate;

public class RestHelper {
    
    public RestTemplate getRestTemplate(){
        RestTemplateBuilder builder=new RestTemplateBuilder();
        builder.basicAuthentication("username","password");
        return builder.build();
    }
}
