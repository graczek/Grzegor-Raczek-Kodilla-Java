package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            String result = secondChallenge.probablyIWillThrowException(2, 1.3);
        } catch (Exception e) {
            System.out.println("We got a problem! " + e);
        } finally {
            System.out.println("Whatever");
        }
    }
}
