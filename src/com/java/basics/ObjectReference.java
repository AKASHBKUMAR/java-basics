package com.java.basics;

class Square {
    private int number;

    Square(int number) {
        this.number = number;
    }

    int getNumber() {
        return number;
    }

    int calculateSquare() {
        return number * number;
    }
}

class Cube {
    Square square;

    Cube(Square square) {
        this.square = square;
    }

    int calculateCube() {
        return square.calculateSquare() * square.getNumber();
    }
}

public class ObjectReference {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {


    }
}
