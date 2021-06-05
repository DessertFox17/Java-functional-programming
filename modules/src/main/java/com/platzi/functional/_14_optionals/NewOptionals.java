package com.platzi.functional._14_optionals;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class NewOptionals {
    //No Optional
    static List<String> getNames() {
        List<String> list = new LinkedList<>();
        //return list;
        return Collections.emptyList();
    }

    //With optional
    static Optional<List<String>> getOptionalNames() {
        List<String> list = new LinkedList<>();
        return Optional.of(list);
    }

    static String mostValuablePlayer() {
        //return "";
        return null;
    }

    static int mostExpensiveItem() {
        return 0;
    }

    static Optional<String> optionalMostValuablePlayer() {
        //Operations
        //return Optional.ofNullable()
        try {
            //Access to dates
            return Optional.of("El Sech");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        //Avoid to work with nulls
        return Optional.empty();
    }

    public static void main(String[] args) {
        //No Optionals
        List<String> names = getNames();
        //Validations per data, a lot of them
        if (names != null) {
            //Operar con nombres
        }

        //With Optionals
        Optional<List<String>> optionalNames = getOptionalNames();

        optionalNames.ifPresent(nameValues -> nameValues.forEach(System.out::println));
        //Obtains the date
        Optional<String> mostValuablePlayer = optionalMostValuablePlayer();
        //If not present, we set by default
        String playerName = mostValuablePlayer.orElseGet(() -> "No player");

    }


}
