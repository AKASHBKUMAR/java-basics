package com.java.basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EmployeeDetails {
    public static void main(String[] args) throws IOException {
//      Declaration
        Integer employeeId;
        char employeeSex;
        String employeeName;

//      Defining InputStream and BufferedReader
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

//      Getting Inputs from the User
        System.out.print("Enter the Employee ID: ");
        employeeId = Integer.valueOf(bufferedReader.readLine());

        System.out.print("Enter the Employee Sex: ");
        employeeSex = (char) bufferedReader.readLine().charAt(0);

        System.out.print("Enter the Employee Name: ");
        employeeName = bufferedReader.readLine();

//      Printing the result
        System.out.println("Employee Id: " + employeeId);
        System.out.println("Employee Sex: " + employeeSex);
        System.out.println("Employee Name: " + employeeName);

    }
}
