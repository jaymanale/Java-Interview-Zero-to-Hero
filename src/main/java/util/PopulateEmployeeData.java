package util;


import stream.java.Employee;

import java.util.List;

public class PopulateEmployeeData {

    public static List<Employee> getEmployeeData() {

        return List.of(
                new Employee(1, "Sham", "IT", 25, 30000),
                new Employee(1, "Karan", "IT", 27, 60000),
                new Employee(1, "Priyanka", "IT", 25, 35000),
                new Employee(1, "Geeta", "IT", 32, 80000),
                new Employee(1, "Harsh", "IT", 29, 50000),
                new Employee(1, "Ram", "ADMIN", 27, 35000),
                new Employee(1, "Neeraj", "ADMIN", 27, 55000),
                new Employee(1, "Sujata", "HR", 26, 50000),
                new Employee(1, "Aishwarya", "HR", 28, 60000),
                new Employee(1, "Suresh", "HR", 30, 40000)
        );
    }
}
