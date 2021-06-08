package com.platzi.functional._15_streams_intro;

import java.time.LocalDateTime;

public class UserService {

    public static void main(String[] args) {

        User user = new User();
        user.setName("Foguelito");
        user.setId(1044506);
        user.setAddress("Somewhere");
        user.setBirthdate(LocalDateTime.now());
        user.setPhone(8607308);

        System.out.println(user.getName());


    }
}
