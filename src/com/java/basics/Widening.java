package com.java.basics;

class SuperClass {
    void displaySuperClassMessage() {
        System.out.println("Super Class Method");
    }
}

class SubClass extends SuperClass {
    void displaySubClassMessage() {
        System.out.println("Sub Class Method");
    }
}

public class Widening {
    public static void main(String[] args) {
        SuperClass superClass;
        superClass = (SuperClass) new SubClass();
        superClass.displaySuperClassMessage();
    }
}
