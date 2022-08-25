package stream.java;

import util.PopulateEmployeeData;

import java.util.List;

public class EmployeeStreamExample {
    public static void main(String[] args) {

        List<Employee> EMPLOYEE_LIST = PopulateEmployeeData.getEmployeeData();

//        Example: 1 -> Print all employee from IT Department

        EMPLOYEE_LIST
                .stream()
                .filter(employee -> employee.getDepartment().equals("IT"))
                .forEach(System.out::println);
        System.out.println("------------------------------------------------------");
       /*
            Employee{id=1, name='Sham', department='IT', age=25, salary=30000}
            Employee{id=2, name='Karan', department='IT', age=27, salary=60000}
            Employee{id=3, name='Priyanka', department='IT', age=25, salary=35000}
            Employee{id=4, name='Geeta', department='IT', age=32, salary=80000}
            Employee{id=5, name='Harsh', department='IT', age=29, salary=50000}
        */

//        Example: 2 -> Print all employee from IT Department whose salary is greater than 40000

        EMPLOYEE_LIST
                .stream()
                .filter(employee -> employee.getDepartment().equals("IT") && employee.getSalary() > 40000)
                .forEach(System.out::println);
        /*
            Employee{id=2, name='Karan', department='IT', age=27, salary=60000}
            Employee{id=4, name='Geeta', department='IT', age=32, salary=80000}
            Employee{id=5, name='Harsh', department='IT', age=29, salary=50000}
         */

    }
}
