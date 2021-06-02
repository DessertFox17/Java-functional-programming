package com.platzi.functional._05_sam;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;

public class AgeUtils {

    @FunctionalInterface
    interface TriFunction<T, U, V, R>{
        R apply(T t, U u, V v);
    }

    public static void main(String[] args) {
        //verifies if the value is less than 10 starts by 0 = 01,02,03,04...
        Function<Integer, String> addCeros = x -> x < 10 ? "0" + x : String.valueOf(x);

        //Converts three numbers into a date
        TriFunction<Integer, Integer, Integer, LocalDate> parseDate =
                (day, month, year) -> LocalDate.parse(year +"-"+ addCeros.apply(month) +"-"+ addCeros.apply(day));

        //Calculates the amount of years between now and the given date.
        TriFunction<Integer,Integer, Integer, Integer> calculateAge =
                (day,month,year) -> Period.between(parseDate.apply(day,month,year), LocalDate.now()).getYears();

        System.out.println(calculateAge.apply(17,7,1993));
    }
}