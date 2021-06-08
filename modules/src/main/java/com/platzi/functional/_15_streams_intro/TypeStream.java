package com.platzi.functional._15_streams_intro;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TypeStream {
    public static void main(String[] args) {

        IntStream infiniteStream = IntStream.iterate(0, x -> x + 1);
        infiniteStream.limit(100)
                .parallel()
                .filter(x -> x % 2 == 0)
                .forEachOrdered(System.out::println);

        Stream<String> letters = Stream.of("L","Z","Y");


    }
}
