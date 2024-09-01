package com.java.basics;

import java.lang.reflect.Field;

class Student {
    private static final String studentUniform = "Blue and White";
    private final String studentName;
    private int studentAge;

    Student(String studentName, int studentAge) {
        this.studentName = studentName;
        this.studentAge = studentAge;
    }

    static void getDressCode() {
        System.out.println(Student.studentUniform);
    }

    //  Sets the age of the student, and it should be incremented each year.
    void setAge(int studentAge) {
        this.studentAge = studentAge;
    }

    //  Introduces the Student
    void studentTalk() {
        String display = String.format("%s , I'm Talking and I'm of %d age", this.studentName, this.studentAge);
        System.out.println(display);
    }
}

public class JavaReflection {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Student studentModric = new Student("Modiric", 20);
//      Field[] studentFields = studentModric.getClass().getDeclaredFields();
//      for(Field field:studentFields)
//      {
//          if(field.getName().equals("studentName"))
//          {
//             field.setAccessible(true);
//             field.set(studentModric,"Kroos");
//          }
//      }

        Field studentUniformField = Student.class.getDeclaredField("studentUniform");
        studentUniformField.setAccessible(true);

        Field modifiersField = Field.class.getDeclaredField("modifiers");
        modifiersField.setAccessible(true);
        modifiersField.setInt(studentUniformField, studentUniformField.getModifiers() & ~java.lang.reflect.Modifier.FINAL);

        studentUniformField.set(null, "Black and White");
        Student.getDressCode();

    }
}
