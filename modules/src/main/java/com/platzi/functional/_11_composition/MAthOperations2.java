package com.platzi.functional._11_composition;

import java.util.function.Function;

public class MAthOperations2 {

    public static void main(String[] args) {
        Function<Integer, Integer> multiplyBy3 = x -> {
            System.out.printf("Multiplying %s by 3%n", x);
            return x * 3;
        };

        Function<Integer, Integer> add1MultiplyBy3 = multiplyBy3.compose(y -> {
            System.out.printf("Adding 1 to: %s%n", y);
            return y + 1;
        });

        Function<Integer, Integer> andSquare = add1MultiplyBy3.andThen(x -> {
            System.out.printf("Squaring: %s%n", x);
            return x * x;
        });

        System.out.println(add1MultiplyBy3.apply(1));
        System.out.println("\n---------------------------------------------------\n");
        System.out.println(andSquare.apply(1));
    }
}
