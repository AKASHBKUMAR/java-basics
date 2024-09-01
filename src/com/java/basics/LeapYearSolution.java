package com.java.basics;

class LeapYear {
    private int year;

    LeapYear(int year) {
        this.year = year;
    }

    boolean checkLeapYear() {
        if ((year % 100 == 0) || (year % 400 == 0))
            return true;
        return false;
    }
}

public class LeapYearSolution {
    public static void main(String[] args) {
        LeapYear leapYear = new LeapYear(2100);
        System.out.println(leapYear.checkLeapYear() ? "It's a Leap Year" : "It's not a Leap Year");
    }
}
