package com.java.basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StreamExample {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReaderObject = new InputStreamReader(System.in);
        BufferedReader bufferedReaderObject = new BufferedReader(inputStreamReaderObject);
        char character = (char) bufferedReaderObject.read();
        System.out.println(character);
    }
}
