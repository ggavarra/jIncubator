package com.example.jIncubator.java8.model;

import com.example.jIncubator.java8.factory.TradeFactory;

import java.util.function.Supplier;

public class TradeFactoryMain {


    public static void main(String[] args) {
        Supplier factoryImpl=()->new CDSTrade();
        System.out.println(factoryImpl.get());
    
    }

}

