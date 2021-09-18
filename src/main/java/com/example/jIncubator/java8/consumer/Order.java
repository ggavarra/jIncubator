package com.example.jIncubator.java8.consumer;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Order {
    private Long orderId;
    private String buySell;
    private String reportingId;
}
