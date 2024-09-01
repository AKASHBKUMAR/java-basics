package com.java.basics;

class SuperClassNarrowing {
    void displaySuperClassMessage() {
        System.out.println("Super Class Message");
    }
}

class SubClassNarrowing extends SuperClassNarrowing {
    void displaySubClassMessage() {
        System.out.println("Sub Class Message");
    }
}

public class Narrowing {
    public static void main(String[] args) throws ClassCastException {
        try {
            SubClassNarrowing subClassNarrowing;
            subClassNarrowing = (SubClassNarrowing) new SuperClassNarrowing();
            subClassNarrowing.displaySubClassMessage();
        } catch (ClassCastException classCastException) {
            System.out.println("Class Cast Exception ");
        }
    }
}
