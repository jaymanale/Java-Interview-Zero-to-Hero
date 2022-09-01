package stream.java;

import util.PopulateEmployeeData;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeStreamExample {
    public static void main(String[] args) {

        List<Employee> EMPLOYEE_LIST = PopulateEmployeeData.getEmployeeData();

//        Employee {id=1, name='Sham', department='IT', age=25, salary=30000}
//        Employee {id=2, name='Karan', department='IT', age=27, salary=60000}
//        Employee {id=3, name='Priyanka', department='IT', age=25, salary=35000}
//        Employee {id=4, name='Geeta', department='IT', age=32, salary=80000}
//        Employee {id=5, name='Harsh', department='IT', age=29, salary=50000}
//        Employee {id=6, name='Ram', department='ADMIN', age=27, salary=35000}
//        Employee {id=7, name='Neeraj', department='ADMIN', age=27, salary=55000}
//        Employee {id=8, name='Sujata', department='HR', age=26, salary=50000}
//        Employee {id=9, name='Aishwarya', department='HR', age=28, salary=60000}
//        Employee {id=10, name='Suresh', department='HR', age=30, salary=40000}
        System.out.println("------------------------------------------------------");

// Example: 1 -> Print all employee from IT Department

        EMPLOYEE_LIST
                .stream()
                .filter(employee -> employee.getDepartment().equals("IT"))
                .forEach(System.out::println);
        System.out.println("------------------------------------------------------");

//            Employee{id=1, name='Sham', department='IT', age=25, salary=30000}
//            Employee{id=2, name='Karan', department='IT', age=27, salary=60000}
//            Employee{id=3, name='Priyanka', department='IT', age=25, salary=35000}
//            Employee{id=4, name='Geeta', department='IT', age=32, salary=80000}
//            Employee{id=5, name='Harsh', department='IT', age=29, salary=50000}


// Example: 2 -> Print all employee from IT Department whose salary is greater than 40000

        EMPLOYEE_LIST
                .stream()
                .filter(employee -> employee.getDepartment().equals("IT") && employee.getSalary() > 40000)
                .forEach(System.out::println);

//            Employee{id=2, name='Karan', department='IT', age=27, salary=60000}
//            Employee{id=4, name='Geeta', department='IT', age=32, salary=80000}
//            Employee{id=5, name='Harsh', department='IT', age=29, salary=50000}

        System.out.println("------------------------------------------------------");

// Example: 3 -> Print Distinct Department from employee
        EMPLOYEE_LIST
                .stream()
                .map(Employee::getDepartment)
                .distinct()
                .forEach(System.out::println);

//        IT
//        ADMIN
//        HR

        System.out.println("------------------------------------------------------");

// Example: 4 -> print employee from each department

        Map<String, Long> employeeInEachDepartment = EMPLOYEE_LIST
                .stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));

        employeeInEachDepartment
                .forEach((key, value) -> System.out.println(key + " -> " + value));

//        HR -> 3
//        ADMIN -> 2
//        IT -> 5
        System.out.println("------------------------------------------------------");

// Example: 5 -> Find Average age of Male and Female employee

        Map<String, Double> averageAgeByGender = EMPLOYEE_LIST
                .stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getAge)));
        averageAgeByGender
                .forEach((key, value) -> System.out.println(key + " -> " + value));

//        Female -> 27.75
//        Male -> 27.5

        System.out.println("------------------------------------------------------");

// Example: 6 -> Find employee with highest paid salary in each department

        Map<String, Optional<Employee>> highestSalaryInEachDepartment = EMPLOYEE_LIST
                .stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.maxBy(Comparator.comparingInt(Employee::getSalary))));
        highestSalaryInEachDepartment
                .forEach((key, value) -> System.out.println(key + " -> " + value));

//        HR -> Optional[Employee {id=9, name='Aishwarya', department='HR', age=28, salary=60000}]
//        ADMIN -> Optional[Employee {id=7, name='Neeraj', department='ADMIN', age=27, salary=55000}]
//        IT -> Optional[Employee {id=4, name='Geeta', department='IT', age=32, salary=80000}]

        System.out.println("------------------------------------------------------");

// Example: 7 -> Find employee with lowest paid salary in each department

        Map<String, Optional<Employee>> lowestSalaryInEachDepartment = EMPLOYEE_LIST
                .stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.minBy(Comparator.comparingInt(Employee::getSalary))));
        lowestSalaryInEachDepartment.forEach((key, value) -> System.out.println(key + " -> "+ value));

//        HR -> Optional[Employee {id=10, name='Suresh', department='HR', age=30, salary=40000}]
//        ADMIN -> Optional[Employee {id=6, name='Ram', department='ADMIN', age=27, salary=35000}]
//        IT -> Optional[Employee {id=1, name='Sham', department='IT', age=25, salary=30000}]

    }
}
