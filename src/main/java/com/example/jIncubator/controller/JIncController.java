package com.example.jIncubator.controller;

import com.example.jIncubator.rest.RestHelper;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JIncController {
    
    @RequestMapping(path = "/")
    public String productById(){
       
        new RestHelper().getRestTemplate().exchange("", HttpMethod.GET,null,String.class);
        return  "Product1";
    }
}
