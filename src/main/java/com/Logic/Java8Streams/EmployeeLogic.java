package com.Logic.Java8Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;




class Employee {   
    String name;
    int salary;

    Employee(String name ,int salary){
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }
}

public class EmployeeLogic {   
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Vishal", 60000),
                new Employee("Raj", 45000),
                new Employee("Amit", 75000),
                new Employee("Neha", 52000),
                new Employee("Priya", 30000)
        );

        List<String> highestPaidSalary = employees.stream()//list ko stream me convert kiya, taaki chaining operations kar saku.
                .filter(e -> e.getSalary() > 50000) //unwanted data hataane ke liye.
                .sorted((e1, e2) -> Integer.compare(e2.getSalary(), e1.getSalary())) //order maintain karne ke liye (yaha descending salary).
                .map(Employee::getName) //object se sirf required field extract karne ke liye (yaha name).
                .collect(Collectors.toList());//final result ko list ke form me wapas lene ke liye.

        System.out.println("Highest Paid Salary Employees: " + highestPaidSalary);
    }
}
