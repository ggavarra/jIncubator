package com.example.jIncubator.java8.consumer;

import java.util.function.Consumer;


public class NewOrderConsumer implements Consumer<Order> {
    @Override
    public void accept(Order order) {
        order.setBuySell("BUY");
    }

    @Override
    public Consumer andThen(Consumer after) {
        return null;
    }
}
