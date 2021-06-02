package com.platzi.functional._04_functional;

import java.util.function.Function;
import java.util.function.Predicate;

public class _05_MathFuncions {
    public static void main(String[] args) {
        Function<Integer, Integer> squareFunction = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer x) {
                return x * x;
            }
        };

        System.out.println(squareFunction.apply(5));
        System.out.println(square(25));

        //Predicate
        //Short function
        Function<Integer, Boolean> isOdd = x -> x % 2 == 1;
        System.out.println(isOdd.apply(10));//false

        //The predicate
        Predicate<Integer> isEven = x -> x % 2 == 0;
        System.out.println(isEven.test(10)); //true
        System.out.println(isEven.test(11)); //false

        Predicate<Student> isApproved = student -> student.getQualification() >= 6.0;

        Student juan = new Student(5);

        System.out.println(isApproved.test(juan));//false

    }

    static int square(int x) {
        return x * x;
    }

    //Predicate example

    static class Student{
        private double qualification;

        public Student(double qualification) {
            this.qualification = qualification;
        }

        public double getQualification() {
            return qualification;
        }
    }
}
