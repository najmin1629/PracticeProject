package org.example.employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeeMain {
    public static void main(String[] args) {
        List<Employee> empList= Arrays.asList(
                new Employee(1,"Subham","Sen",445.75,26),
                new Employee(2,"Najmin","Sen",500.50,26),
                new Employee(3,"Ankita","Das",750.25,25));
        empList.stream().filter(e->e.getFirstname().startsWith("S")).forEach(e1->System.out.println(e1.getAge())
        );

    }
}