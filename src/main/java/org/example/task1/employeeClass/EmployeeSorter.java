package org.example.task1.employeeClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeSorter {

    public static void showEmployeeList() {

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Alice", 565450.0));
        employeeList.add(new Employee("Bob", 534556.0));
        employeeList.add(new Employee("Charlie", 674561.0));

        System.out.println("Unsorted Employee List:");
        printEmployeeList(employeeList);

        sortEmployeeListBySalary(employeeList);

        System.out.println("Sorted Employee List (Ascending Order):");
        printEmployeeList(employeeList);
    }

    private static void printEmployeeList(List<Employee> employeeList) {
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }

    private static void sortEmployeeListBySalary(List<Employee> employeeList) {
        for (int i = 0; i < employeeList.size() - 1; i++) {
            for (int j = 0; j < employeeList.size() - i - 1; j++) {
                if (employeeList.get(j).getSalary() > employeeList.get(j + 1).getSalary()) {
                    Collections.swap(employeeList, j, j + 1);
                }
            }
        }
    }

}
