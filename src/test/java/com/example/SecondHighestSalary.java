package com.example;

import com.example.orgsLevelPrograms.Employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondHighestSalary {
    public static void main(String[] args) {
        List<Employee>  salary = Arrays.asList(
                new Employee(5000),
                new Employee(10000),
                new Employee(2000),
                new Employee(75874));


        salary.stream()
                .map(Employee::getSalary)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();

    }

}
