package com.java.basics;

public class SwitchStatement {
    public static void main(String[] args) {
        SwitchStatement switchStatementObject = new SwitchStatement();
        System.out.println(switchStatementObject.Switch('p'));


    }

    String Switch(char ch) {
        switch (ch) {
            case 'g':
                return "Green";

            case 'w':
                return "White";
            case 'r':
                return "Red";
            case 'b':
                return "Blue";
            default:
                System.exit(0);
                System.out.println("Hii");

                return "";

        }
    }
}
