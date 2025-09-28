package com.itkhamar.functionTest;

import com.itkhamar.Employee;

import java.util.function.Function;

public class FunctionTester {
    public static void main(String[] args) {
        Employee employee = new Employee("Abu Bakar", "Siddik");

        Function<Employee, String> fullName = (e) -> {
            if (e.getFirstName() == null || e.getLastName() == null) {
                return "";
            }

            return e.getFirstName() + " " + e.getLastName();
        };

        String firstName = fullName.apply(employee);
        System.out.println(firstName);
    }
}
