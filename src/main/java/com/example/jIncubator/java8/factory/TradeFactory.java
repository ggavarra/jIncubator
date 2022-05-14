package com.example.jIncubator.java8.factory;

import com.example.jIncubator.java8.model.Trade;

import java.util.function.Supplier;

public interface TradeFactory extends Supplier<Trade> {
    
    Trade newInstance(String TradeType);

}
