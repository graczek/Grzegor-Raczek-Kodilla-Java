package com.kodilla.stream.beautifier;

public class PoemBeutifier {
    public String beautify(String textToBeautify, PoemDecorator poemDecorator){
        String result = poemDecorator.decorate(textToBeautify);
        System.out.println(result);
        return result;
    }
}
