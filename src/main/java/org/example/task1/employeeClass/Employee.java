package org.example.task1.employeeClass;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee {
    private String name;
    private double salary;

    @Override
    public String toString() {
        return "Employee name" + name + " with salary " + salary;
    }
}
