package com.java.basics;

import java.util.StringTokenizer;

public class FindStringCode {
    public static void main(String[] args) {
        String string = "WORLD WIDE WEB";
        StringTokenizer stringTokenizer = new StringTokenizer(string, " ");
        String integerString = "";
        while (stringTokenizer.hasMoreTokens()) {
            String currentString = stringTokenizer.nextToken();
            int currentStringLength = currentString.length();
            int iterator = 0;
            int sum = 0;
            while (iterator < currentStringLength / 2) {
                int differenceInString = Math.abs((currentString.charAt(iterator)) - (currentString.charAt(currentStringLength - iterator - 1)));
                sum += differenceInString;
                iterator++;
            }
            if (currentStringLength % 2 == 1) {
                sum += (currentString.charAt(iterator) - 'A' + 1);
            }
            integerString += Integer.toString(sum);
        }
        System.out.println(integerString);
    }
}
