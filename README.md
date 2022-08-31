
# <img src="https://raw.githubusercontent.com/danielcranney/readme-generator/main/public/icons/skills/java-colored.svg" width="36" height="36" alt="Java" /> - Java Interview Preparation with Examples


Java-8 Interview Preparation with Examples

## Table of Contents

> 1️⃣ Stream
- [👉 Integer](#integer)
- [👉 String](#string)
- [👉 Employee](#employee)

## Integer

| No&nbsp; &nbsp; | Problem Statement                                                             |
|-----------------|-------------------------------------------------------------------------------|
| 1               | [ ✅ Find even numbers from given ArrayList](#integer-example-1)               |
| 2               | [ ✅ Find odd numbers from given ArrayList](#integer-example-2)                |
| 3               | [ ✅ Find duplicate number from given ArrayList](#integer-example-3)           |
| 4               | [ ✅ Find unique number from given ArrayList](#integer-example-4)              |
| 5               | [ ✅ Sort number from given ArrayList in Ascending order](#integer-example-5)  |
| 6               | [ ✅ Sort number from given ArrayList on descending order](#integer-example-6) |
| 7               | [ ✅ Sum of all given number in ArrayList](#integer-example-7)                 |

<div>
    <b><a href="#table-of-contents">👆 Back To Top</a></b>
</div>

## String

| No&nbsp; &nbsp; | Problem Statement                                                                  |
|-----------------|------------------------------------------------------------------------------------|
| 1               | [ ✅ Find names start with 'N' in ArrayList](#string-example-1)                     |
| 2               | [ ✅ Converts each name into an UPPERCASE string from ArrayList](#string-example-2) |
| 3               | [ ✅ Converts each name into an LOWERCASE string from ArrayList](#string-example-3) |
| 4               | [ ✅ Sort name from ArrayList in Ascending Order](#string-example-4)                |
| 5               | [ ✅ Sort name from ArrayList in Descending Order](#string-example-5)               |

<div>
    <b><a href="#table-of-contents">👆 Back To Top</a></b>
</div>

## Employee

| No&nbsp; &nbsp; | Problem Statement                                                                                  |
|-----------------|----------------------------------------------------------------------------------------------------|
| DATA            | [ ☑️Employee List Data](#employee-list-data)                                                       |
| 1               | [ ✅ Print all employee from IT Department](#employee-example-1)                                    |
| 2               | [ ✅ Print all employee from IT Department whose salary is greater than 40000](#employee-example-2) |
| 3               | [ ✅ Print Distinct Department from employee](#employee-example-3)                                  |
| 4               | [ ✅ Print No of employee from each department](#employee-example-4)                                |
| 5               | [ ✅ Find Average age of Male and Female employee](#employee-example-5)                             |
| 6               | [ ✅ Find employee with highest paid salary in each department](#employee-example-6)                |


<div>
    <b><a href="#table-of-contents">👆 Back To Top</a></b>
</div>



#### Integer Example 1
>Find even numbers from given ArrayList
 ```java
public class IntegerListStreamExample {
    public static void main(String[] args) {

// DATA
        List<Integer> INTEGER_LIST = PopulateListData.getIntegerList(); // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

// Example: 1 -> Find even numbers from given ArrayList
// Expected Output : [2, 4, 6, 8, 10]

        List<Integer> evenNumberList = INTEGER_LIST
                .stream()
                .filter(number -> number % 2 == 0)
                .toList();
        System.out.println("Even Number -> " + evenNumberList);

// OUTPUT : 👇
// Even Number -> [2, 4, 6, 8, 10]
    }
}
```

<div align="right">
    <b><a href="#integer">👆 Back To Integer</a></b>
</div>

#### Integer Example 2
>Find odd numbers from given ArrayList
```java
public class IntegerListStreamExample {
    public static void main(String[] args) {

// DATA
        List<Integer> INTEGER_LIST = PopulateListData.getIntegerList(); // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

// Example: 2 -> Find odd numbers from given ArrayList
// Expected Output : [1, 3, 5, 7, 9]

        List<Integer> oddNumberList = INTEGER_LIST
                .stream()
                .filter(number -> number % 2 != 0)
                .toList();
        System.out.println("Odd Number -> " + oddNumberList);

// OUTPUT : 👇
// Odd Number -> [1, 3, 5, 7, 9]
    }
}
```

<div align="right">
    <b><a href="#integer">👆 Back To Integer</a></b>
</div>

#### Integer Example 3
>Find duplicate number from given ArrayList
```java
public class IntegerListStreamExample {
    public static void main(String[] args) {
        
// DATA
        List<Integer> DUPLICATE_INTEGER_LIST = PopulateListData.getDuplicateIntegerList(); // 1, 2, 2, 3, 3, 4, 5, 6, 6, 7, 8, 8
        
// Example: 3 -> Find duplicate number from given ArrayList
// Expected Output : [2, 3, 6, 8]
        
        Set<Integer> duplicateSet = new HashSet<>();
        List<Integer> duplicateNumber = DUPLICATE_INTEGER_LIST
                .stream()
                .filter(number -> !duplicateSet.add(number))
                .toList();
        System.out.println("Duplicate number -> " + duplicateNumber);

// OUTPUT : 👇        
// Duplicate number -> [2, 3, 6, 8]
    }
}
```

<div align="right">
    <b><a href="#integer">👆 Back To Integer</a></b>
</div>


#### Integer Example 4
>Find unique number from given ArrayList
```java
public class IntegerListStreamExample {
    public static void main(String[] args) {
        
// DATA
        List<Integer> DUPLICATE_INTEGER_LIST = PopulateListData.getDuplicateIntegerList(); // 1, 2, 2, 3, 3, 4, 5, 6, 6, 7, 8, 8

// Example: 4 -> Find unique number from given ArrayList
// Expected Output : [1, 2, 3, 4, 5, 6, 7, 8]
        
        Set<Integer> uniqueSet = new HashSet<>();
        List<Integer> uniqueNumber = DUPLICATE_INTEGER_LIST
                .stream()
                .filter(uniqueSet::add)
                .toList();
        System.out.println("Unique number -> " + uniqueNumber);

// OUTPUT : 👇        
// Unique number -> [1, 2, 3, 4, 5, 6, 7, 8]
    }
}
```

<div align="right">
    <b><a href="#integer">👆 Back To Integer</a></b>
</div>


#### Integer Example 5
>Sort number from given ArrayList in Ascending order
```java
public class IntegerListStreamExample {
    public static void main(String[] args) {
        
// DATA
        List<Integer> UNSORTED_LIST = PopulateListData.getListForSorting(); // [5, 2, 6, 9, 3, 1, 10, 4]

// Example: 5 -> Sort number from given ArrayList in Ascending order
// Expected Output : [1, 2, 3, 4, 5, 6, 9, 10]
        
        List<Integer> numberSortedInAscendingOrder = UNSORTED_LIST
                .stream()
                .sorted()
                .toList();
        System.out.println("Number in Ascending order -> " + numberSortedInAscendingOrder);

// OUTPUT : 👇        
// Number in Ascending order -> [1, 2, 3, 4, 5, 6, 9, 10]
    }
}
```

<div align="right">
    <b><a href="#integer">👆 Back To Integer</a></b>
</div>

#### Integer Example 6
>Sort number from given ArrayList on descending order
```java
public class IntegerListStreamExample {
    public static void main(String[] args) {
        
// DATA
        List<Integer> UNSORTED_LIST = PopulateListData.getListForSorting(); // [5, 2, 6, 9, 3, 1, 10, 4]

// Example: 6 -> Sort number from given ArrayList in descending order
// Expected Output : [10, 9, 6, 5, 4, 3, 2, 1]
        
        List<Integer> numberSortedInDescendingOrder = UNSORTED_LIST
                .stream()
                .sorted(Comparator.reverseOrder())
                .toList();
        System.out.println("Number in Descending order -> " + numberSortedInDescendingOrder);

// OUTPUT : 👇        
// Number in Descending order -> [10, 9, 6, 5, 4, 3, 2, 1]
    }
}
```

<div align="right">
    <b><a href="#integer">👆 Back To Integer</a></b>
</div>


#### Integer Example 7
>Sum of all given number in ArrayList
```java
public class IntegerListStreamExample {
    public static void main(String[] args) {
        
// DATA
        List<Integer> INTEGER_LIST = PopulateListData.getIntegerList(); // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

// Example: 7 -> Sum of all given number in ArrayList
// Expected Output : [10, 9, 6, 5, 4, 3, 2, 1]

        Optional<Integer> sumOfAllNumber = INTEGER_LIST.stream().reduce(Integer::sum);
        System.out.println("Sum Of all Numbers -> "+sumOfAllNumber);

// OUTPUT : 👇        
// Sum Of all Numbers -> Optional[55]
    }
}
```

<div align="right">
    <b><a href="#integer">👆 Back To Integer</a></b>
</div>


#### String Example 1
>Find names start with 'N' in ArrayList
```java
public class StringListStreamExample {
    public static void main(String[] args) {
        
// DATA
        List<String> NAME_LIST = PopulateListData.getNames(); // ["Sham", "Ram", "John", "Neha", "Ajay", "Karan", "Neeraj"]

// Example: 1 -> Find names start with 'N' in ArrayList
// Expected Output : [Neha, Neeraj]

        List<String> nameStartWith = NAME_LIST
                .stream()
                .filter(name -> name.startsWith("N"))
                .toList();
        System.out.println("Name start with 'N' -> " + nameStartWith);

// OUTPUT : 👇        
// Name start with 'N' -> [Neha, Neeraj]

    }
}
```

<div align="right">
    <b><a href="#string">👆 Back To String</a></b>
</div>

#### String Example 2
>Converts each name into an UPPERCASE string from ArrayList
```java
public class StringListStreamExample {
    public static void main(String[] args) {
        
// DATA
        List<String> NAME_LIST = PopulateListData.getNames(); // ["Sham", "Ram", "John", "Neha", "Ajay", "Karan", "Neeraj"]
        
// Example: 2 -> converts each name into an UPPERCASE string from ArrayList
// Expected Output : [SHAM, RAM, JOHN, NEHA, AJAY, KARAN, NEERAJ]

        List<String> uppercaseNamesList = NAME_LIST
                .stream()
                .map(String::toUpperCase)
                .toList();
        System.out.println("Names in UPPERCASE -> "+uppercaseNamesList);

// OUTPUT : 👇        
// Names in UPPERCASE -> [SHAM, RAM, JOHN, NEHA, AJAY, KARAN, NEERAJ]

    }
}
```

<div align="right">
    <b><a href="#string">👆 Back To String</a></b>
</div>

#### String Example 3
>Converts each name into an LOWERCASE string from ArrayList
```java
public class StringListStreamExample {
    public static void main(String[] args) {
        
// DATA
        List<String> NAME_LIST = PopulateListData.getNames(); // ["Sham", "Ram", "John", "Neha", "Ajay", "Karan", "Neeraj"]
        
// Example: 3 -> converts each name into an LOWERCASE string from ArrayList
// Expected Output : [sham, ram, john, neha, ajay, karan, neeraj]

        List<String> lowercaseNamesList = NAME_LIST
                .stream()
                .map(String::toLowerCase)
                .toList();
        System.out.println("Names in LOWERCASE -> "+lowercaseNamesList);

// OUTPUT : 👇        
// Names in LOWERCASE -> [sham, ram, john, neha, ajay, karan, neeraj]

    }
}
```

<div align="right">
    <b><a href="#string">👆 Back To String</a></b>
</div>

#### String Example 4
>Sort name from ArrayList in Ascending Order
```java
public class StringListStreamExample {
    public static void main(String[] args) {
        
// DATA
        List<String> NAME_LIST = PopulateListData.getNames(); // ["Sham", "Ram", "John", "Neha", "Ajay", "Karan", "Neeraj"]

// Example: 4 -> Sort name from ArrayList in Ascending Order
// Expected Output : [Ajay, John, Karan, Neeraj, Neha, Ram, Sham]

        List<String> nameSortedInAscendingOrder = NAME_LIST
                .stream()
                .sorted()
                .toList();
        System.out.println("Names in Ascending order -> "+nameSortedInAscendingOrder);

// OUTPUT : 👇        
// Names in Ascending order -> [Ajay, John, Karan, Neeraj, Neha, Ram, Sham]

    }
}
```

<div align="right">
    <b><a href="#string">👆 Back To String</a></b>
</div>

#### String Example 5
>Sort name from ArrayList in Descending Order
```java
public class StringListStreamExample {
    public static void main(String[] args) {
        
// DATA
        List<String> NAME_LIST = PopulateListData.getNames(); // ["Sham", "Ram", "John", "Neha", "Ajay", "Karan", "Neeraj"]

// Example: 5 -> Sort name from ArrayList in Descending Order
// Expected Output : [Sham, Ram, Neha, Neeraj, Karan, John, Ajay]

        List<String> nameSortedInDescendingOrder = NAME_LIST
                .stream()
                .sorted(Comparator.reverseOrder())
                .toList();
        System.out.println("Names in Descending order -> "+nameSortedInDescendingOrder);

// OUTPUT : 👇        
// Names in Descending order -> [Sham, Ram, Neha, Neeraj, Karan, John, Ajay]

    }
}
```

<div align="right">
    <b><a href="#string">👆 Back To String</a></b>
</div>

#### Employee List Data
```java
public class PopulateEmployeeData {

    List<Employee> EMPLOYEE_LIST = List.of(
            new Employee(1, "Sham", "IT", 25, 30000, "Male"),
            new Employee(2, "Karan", "IT", 27, 60000, "Male"),
            new Employee(3, "Priyanka", "IT", 25, 35000, "Female"),
            new Employee(4, "Geeta", "IT", 32, 80000, "Female"),
            new Employee(5, "Harsh", "IT", 29, 50000, "Male"),
            new Employee(6, "Ram", "ADMIN", 27, 35000, "Male"),
            new Employee(7, "Neeraj", "ADMIN", 27, 55000, "Male"),
            new Employee(8, "Sujata", "HR", 26, 50000, "Female"),
            new Employee(9, "Aishwarya", "HR", 28, 60000, "Female"),
            new Employee(10, "Suresh", "HR", 30, 40000, "Male")
    );
}

```

<div align="right">
    <b><a href="#employee">👆 Back To Employee</a></b>
</div>

#### Employee Example 1
>Print all employee from IT Department
```java
public class EmployeeStreamExample {
    public static void main(String[] args) {

// DATA
        List<Employee> EMPLOYEE_LIST = PopulateEmployeeData.getEmployeeData();
        
// Example: 1 -> Print all employee from IT Department

        EMPLOYEE_LIST
                .stream()
                .filter(employee -> employee.getDepartment().equals("IT"))
                .forEach(System.out::println);

// OUTPUT : 👇
//            Employee{id=1, name='Sham', department='IT', age=25, salary=30000}
//            Employee{id=2, name='Karan', department='IT', age=27, salary=60000}
//            Employee{id=3, name='Priyanka', department='IT', age=25, salary=35000}
//            Employee{id=4, name='Geeta', department='IT', age=32, salary=80000}
//            Employee{id=5, name='Harsh', department='IT', age=29, salary=50000}
    }
}
```
<div align="right">
    <b><a href="#employee">👆 Back To Employee</a></b>
</div>

#### Employee Example 2
>Print all employee from IT Department whose salary is greater than 40000
```java
public class EmployeeStreamExample {
    public static void main(String[] args) {

// DATA
        List<Employee> EMPLOYEE_LIST = PopulateEmployeeData.getEmployeeData();

// Example: 2 -> Print all employee from IT Department whose salary is greater than 40000

        EMPLOYEE_LIST
                .stream()
                .filter(employee -> employee.getDepartment().equals("IT") && employee.getSalary() > 40000)
                .forEach(System.out::println);

// OUTPUT : 👇
//            Employee{id=2, name='Karan', department='IT', age=27, salary=60000}
//            Employee{id=4, name='Geeta', department='IT', age=32, salary=80000}
//            Employee{id=5, name='Harsh', department='IT', age=29, salary=50000}

    }
}
```
<div align="right">
    <b><a href="#employee">👆 Back To Employee</a></b>
</div>


#### Employee Example 3
>Print Distinct Department from employee
```java
public class EmployeeStreamExample {
    public static void main(String[] args) {

// DATA
        List<Employee> EMPLOYEE_LIST = PopulateEmployeeData.getEmployeeData();

// Example: 3 -> Print Distinct Department from employee
        EMPLOYEE_LIST
                .stream()
                .map(Employee::getDepartment)
                .distinct()
                .forEach(System.out::println);

// OUTPUT : 👇
//        IT
//        ADMIN
//        HR
    }
}
```
<div align="right">
    <b><a href="#employee">👆 Back To Employee</a></b>
</div>

#### Employee Example 4
>Print No of employee from each department
```java
public class EmployeeStreamExample {
    public static void main(String[] args) {

// DATA
        List<Employee> EMPLOYEE_LIST = PopulateEmployeeData.getEmployeeData();

// Example: 4 -> Print No of employee from each department

        Map<String, Long> employeeInEachDepartment = EMPLOYEE_LIST
                .stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));

        employeeInEachDepartment
                .forEach((key, value) -> System.out.println(key + " -> " + value));

// OUTPUT : 👇
//        HR -> 3
//        ADMIN -> 2
//        IT -> 5
    }
}
```
<div align="right">
    <b><a href="#employee">👆 Back To Employee</a></b>
</div>

#### Employee Example 5
>Find Average age of Male and Female employee
```java
public class EmployeeStreamExample {
    public static void main(String[] args) {

// DATA
        List<Employee> EMPLOYEE_LIST = PopulateEmployeeData.getEmployeeData();

// Example: 5 -> Find Average age of Male and Female employee

        Map<String, Double> averageAgeByGender = EMPLOYEE_LIST
                .stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getAge)));
        averageAgeByGender
                .forEach((key, value) -> System.out.println(key + " -> " + value));

// OUTPUT : 👇
//        Female -> 27.75
//        Male -> 27.5
    }
}
```
<div align="right">
    <b><a href="#employee">👆 Back To Employee</a></b>
</div>

#### Employee Example 6 
>Find employee with highest paid salary in each department
```java
public class EmployeeStreamExample {
    public static void main(String[] args) {

// DATA
        List<Employee> EMPLOYEE_LIST = PopulateEmployeeData.getEmployeeData();

// Example: 6 -> Find employee with highest paid salary in each department

        Map<String, Optional<Employee>> highestSalaryInEachDepartment = EMPLOYEE_LIST
                .stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.maxBy(Comparator.comparingInt(Employee::getSalary))));
        highestSalaryInEachDepartment
                .forEach((key, value) -> System.out.println(key + " -> " + value));

// OUTPUT : 👇
//        HR -> Optional[Employee {id=9, name='Aishwarya', department='HR', age=28, salary=60000}]
//        ADMIN -> Optional[Employee {id=7, name='Neeraj', department='ADMIN', age=27, salary=55000}]
//        IT -> Optional[Employee {id=4, name='Geeta', department='IT', age=32, salary=80000}]
    }
}
```
<div align="right">
    <b><a href="#employee">👆 Back To Employee</a></b>
</div>
