package com.platzi.functional._15_streams_intro;

import com.platzi.functional._06_reference_operator._02_NamesUtils;

import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {
        List<String> courseList = _02_NamesUtils.getList("Spring!", "Java Functional!", "Java Persistence!");

        //Most common way to iterate arrays
        for (String course : courseList) {
            //To lower case and replace elements
            String newCourseName = course.toLowerCase(Locale.ROOT).replace("!", "!!");
            //Adding a prefix
            System.out.printf("Platzi: %s%n", newCourseName);
        }
        System.out.println();
        //With streams

        Stream<String> courseStream = Stream.of("Spring", "Java Functional", "Java Persistence");

        //get the logest string
        //Stream<Integer> courseLengthStream = courseStream.map(String::length);
        //Max elements in names
        //Optional<Integer> longest = courseLengthStream.max((x, y) -> y - x);
        Stream<String> emphasisCourses = courseStream.map(course -> course + "!");
        Stream<String> justJavaCourses = emphasisCourses.filter(s -> s.contains("Java"));
        justJavaCourses.forEach(System.out::println);
        System.out.println();
        //With stream listeners
        Stream<String> courseStream2 = courseList.stream();

        courseStream2.map(course -> course + "!").filter(course -> course.contains("Java"))
                .forEach(System.out::println);
        System.out.println();
        //From a list without definning a new stream object
        List<String> newCoursesList = _02_NamesUtils.getList("Java Persistence", "Java SpringBoot",
                "Java Functional", "Scala Play", "Node.js", "Gosu");

        newCoursesList.stream().map(course -> course + "!!!").filter(course -> course.contains("Java"))
                .forEach(System.out::println);

        System.out.println();
        addOperator(newCoursesList.stream().map(course -> course + "!!!!")
                .filter(course -> course.contains("Java"))).forEach(System.out::println);

    }

    //static method that gets an stream and returns another stream
    static <T> Stream<T> addOperator(Stream<T> stream){
        return stream.peek(data -> System.out.printf("Data: %s%n",data));
    }
}
