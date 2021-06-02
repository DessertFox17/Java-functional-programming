package com.platzi.functional._04_functional;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class _08_StringFunctions {
    public static void main(String[] args) {
        UnaryOperator<String> quote = text -> "\"" + text + "\"";
        UnaryOperator<String> addMark = text -> text + "!";
        System.out.println(quote.apply("Hello, madafaka"));
        System.out.println(addMark.apply("Hello, Madafaka"));

        BiFunction<Integer, Integer, Integer> multi =
                (x, y) -> x * y;

        multi.apply(5, 4);

        BinaryOperator<Integer> multip =
                (x, y) -> x * y;

        multip.apply(5,4);

        BiFunction<String, Integer, String> leftPad =
                (text,number) -> String.format("%" + number + "s",text);

        System.out.println(leftPad.apply("Java",10));

    }
}
