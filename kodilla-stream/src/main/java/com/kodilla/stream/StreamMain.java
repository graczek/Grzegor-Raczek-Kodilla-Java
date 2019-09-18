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

    }
}
