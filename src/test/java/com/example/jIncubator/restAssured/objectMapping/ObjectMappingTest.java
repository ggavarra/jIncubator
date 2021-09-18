package com.example.jIncubator.restAssured.objectMapping;

import io.restassured.RestAssured;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

class ObjectMappingTest {

    public static final String BASE_URL="https://api.github.com/users/rest-assured";

    public static void main(String[] args) {
        User user=RestAssured.get(BASE_URL).as(User.class);
        System.out.println(user);
        assertNotNull(user.getAvatarUrl().isEmpty());
        
    }
}