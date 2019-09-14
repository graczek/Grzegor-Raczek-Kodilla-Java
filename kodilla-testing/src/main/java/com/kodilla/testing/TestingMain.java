package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if(result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        System.out.println("Test - pierwszy test jednostkowy: ");

        Calculator calculator = new Calculator();

        int addResult = calculator.add(5, 5);
        int substractResult = calculator.substract(10, 5);

        if(addResult == 10){
            System.out.println("Add test OK");
        } else {
            System.out.println("Add test error");
        }

        if(substractResult == 5){
            System.out.println("Substract test OK");
        } else {
            System.out.println("Substract test error");
        }


    }
}
