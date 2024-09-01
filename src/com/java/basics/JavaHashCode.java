package com.java.basics;

class Person {
    String name;
    long id;

    Person(String name, long id) {
        this.name = name;
        this.id = id;
    }

    void talk() {
        System.out.println("I'm Talking" + this.name);
    }

    void eat() {
        System.out.println("I'm eating");
    }

}

public class JavaHashCode {
    public static void main(String[] args) {
        Person personAkash = new Person("Akash", 212221040011L);
        personAkash.talk();
        personAkash.eat();

    }
}
