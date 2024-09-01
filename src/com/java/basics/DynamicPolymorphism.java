package com.java.basics;

class MethodOverloading {
    int areaOfShape(int length) {
        return length * length;
    }

    int areaOfShape(int length, int breath) {
        return length * breath;
    }

}

public class DynamicPolymorphism {
    public static void main(String[] args) {
        MethodOverloading methodOverloading = new MethodOverloading();
        System.out.println(methodOverloading.areaOfShape(5));
        System.out.println(methodOverloading.areaOfShape(5, 10));

    }
}
