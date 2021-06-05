package com.platzi.functional._06_reference_operator;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class _02_NamesUtils {

    public static <T>List<T> getList(T... elements){
        return Arrays.asList(elements);
    }

    public static void main(String[] args) {
        List<String> teachNames = getList("Nicolas","Carlos","Juan","Zulema");

        Consumer<String> printer = text -> System.out.println(text);
        teachNames.forEach(printer);
        System.out.println("----------------------------------------");
        teachNames.forEach(System.out::println);
    }
}
