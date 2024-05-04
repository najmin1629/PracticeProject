package org.example.employee;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
class Employee {
    private int id;
    private String firstname;
    private String lastname;
    private double salary;
    private int age;
}
