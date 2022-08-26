package util;


import stream.java.Employee;

import java.util.List;

public class PopulateEmployeeData {

    public static List<Employee> getEmployeeData() {

        return List.of(
                new Employee(1, "Sham", "IT", 25, 30000,"Male"),
                new Employee(2, "Karan", "IT", 27, 60000,"Male"),
                new Employee(3, "Priyanka", "IT", 25, 35000,"Female"),
                new Employee(4, "Geeta", "IT", 32, 80000,"Female"),
                new Employee(5, "Harsh", "IT", 29, 50000,"Male"),
                new Employee(6, "Ram", "ADMIN", 27, 35000,"Male"),
                new Employee(7, "Neeraj", "ADMIN", 27, 55000,"Male"),
                new Employee(8, "Sujata", "HR", 26, 50000,"Female"),
                new Employee(9, "Aishwarya", "HR", 28, 60000,"Female"),
                new Employee(10, "Suresh", "HR", 30, 40000,"Male")
        );
    }
}
