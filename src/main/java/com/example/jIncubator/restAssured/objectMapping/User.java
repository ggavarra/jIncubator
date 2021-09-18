package com.example.jIncubator.restAssured.objectMapping;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class User {
    
    private String id;
    
    @JsonProperty("node_id")
    private String nodeId;

    @JsonProperty("avatar_url")
    private String avatarUrl;
}
