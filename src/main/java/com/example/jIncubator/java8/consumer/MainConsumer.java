package com.example.jIncubator.java8.consumer;

public class MainConsumer {

    public static void main(String[] args) {
        NewOrderConsumer consumer= new NewOrderConsumer();
        Order order= new Order();
        consumer.accept(order);
        System.out.println(order.toString());
    }
}
