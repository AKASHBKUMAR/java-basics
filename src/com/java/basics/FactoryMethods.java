package com.java.basics;

class MyClass {
    public static MyClass myClass;

    private MyClass() {
    }

    static MyClass getInstance() {
        if (myClass == null)
            myClass = new MyClass();
        return myClass;
    }

    void talk() {
        System.out.println("I'm Talking");
    }
}

public class FactoryMethods {
    public static void main(String[] args) {
        MyClass myClass = MyClass.getInstance();
        myClass.talk();

//        MyClass myClass1 = new MyClass();
    }
}
