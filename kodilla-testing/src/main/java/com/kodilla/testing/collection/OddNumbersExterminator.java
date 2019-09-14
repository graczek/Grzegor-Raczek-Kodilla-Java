package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {

    private ArrayList<Integer> numbers;
    private ArrayList<Integer> evenNumbers;

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers){
        if(numbers.isEmpty()){
            return new ArrayList<Integer>();
        } else {
            for (int i = 0; i < numbers.size(); i++) {
                if ((numbers.get(i) % 2) == 0) {
                    evenNumbers.add(numbers.get(i));
                }
            }
            return evenNumbers;
        }
    }
}
