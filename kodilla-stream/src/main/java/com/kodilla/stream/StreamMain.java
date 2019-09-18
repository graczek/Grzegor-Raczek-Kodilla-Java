package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeutifier;

public class StreamMain {
    public static void main(String[] args) {

        PoemBeutifier poemBeutifier = new PoemBeutifier();

        poemBeutifier.beautify("SAMPLEtext1", textToBeautify -> textToBeautify.toLowerCase());
        poemBeutifier.beautify("sampletext2", textToBeautify -> textToBeautify.toUpperCase());
        poemBeutifier.beautify("sampletext3", textToBeautify -> textToBeautify.concat("ABC"));
        poemBeutifier.beautify("sampletext4", textToBeautify -> textToBeautify.replaceAll("sample", "lambda"));
        poemBeutifier.beautify("sampletext5", textToBeautify -> textToBeautify.substring(6));


//        Processor processor = new Processor();
//        processor.execute(() -> System.out.println("This is an example text with lambda."));

//        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
//
//        System.out.println("Calculating expressions with lambdas");
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);
//
//        System.out.println("Calculating expressions with menthod references");
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subAFromB);
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);


    }
}
