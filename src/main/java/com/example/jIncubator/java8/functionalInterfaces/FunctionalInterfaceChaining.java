package com.example.jIncubator.java8.functionalInterfaces;

import java.util.Objects;

public class FunctionalInterfaceChaining {
    public static void main(String[] args) {
        FunctionalInterfaceChaining chaining = new FunctionalInterfaceChaining();
        chaining.chainMultipliers();
    }

    public void chainMultipliers() {

        Multiplier<Integer> doubleMultiplier = (Integer i) -> {
            i = i * 2;
        };
        Multiplier<Integer> tripleMultiplier = (Integer i) -> {
            i = i * 3;
        };
        Integer testInteger = 2;

        doubleMultiplier.andThen(tripleMultiplier);

    }
}


@FunctionalInterface
interface Multiplier<T> {

    void multiply(T o);

    default Multiplier<T> andThen(Multiplier<T> other) {
        Objects.requireNonNull(other);
        return (T t) -> {
            multiply(t);
            other.multiply(t);
            System.out.println("Value of t is " + t);
        };
    }


}
