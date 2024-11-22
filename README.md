
# <img src="https://raw.githubusercontent.com/danielcranney/readme-generator/main/public/icons/skills/java-colored.svg" width="36" height="36" alt="Java" /> - Java Interview Preparation with Examples


Java Interview Preparation

## Table of Contents

### Core Java
- [Q.1 Why Java is not 100% Object Oriented?](#q1-why-java-is-not-100-object-oriented)
- [Q.2 Is Java Pass by value or Pass by reference?](#q2-is-java-pass-by-value-or-pass-by-reference)
- [Q.3 Why Pointers are not used in Java?](#q3-why-pointers-are-not-used-in-java)

## Stream API Examples
- [👉 Integer](#integer)
- [👉 String](#string)
- [👉 Employee](#employee)


## Core Java
### Q.1 Why Java is not 100% Object Oriented?

- **Primitive Data Types:** In Java, primitive data types such as int, float, boolean, byte, char, double, long, and short are not objects. They do not inherit from a common superclass and cannot have methods or fields like objects. Java offers wrapper classes (e.g., Integer, Double) to encapsulate primitives for compatibility with object-oriented contexts. However, this adds complexity to its type system.
- **Static Members and Methods:** Java allows the declaration of static members (fields and methods) within classes. Static members belong to the class itself rather than any instance of the class, and they can be accessed without creating an object of the class.
- **Lack of Multiple Inheritance:** Java does not support multiple inheritance of classes, meaning a class cannot extend more than one class. This limitation was imposed to avoid the complexities associated with multiple inheritance, such as the diamond problem. Instead, Java provides interfaces as a mechanism for achieving some benefits of multiple inheritance through abstract types.

### Q.2 Is Java Pass by value or Pass by reference?

- Java is pass-by-value. In Java, when we pass a variable to a method, we're passing a copy of the variable's value.
- In Java, when we pass an object as an argument to a method, we're still passing the value of the **reference to the object, not the object itself.** This means the method receives a copy of the reference to the object, not a copy of the object.
```java
public class Main {
    public static void main(String[] args) {
      // For Variable
      int num = 10;
      System.out.println("Before: " + num);
      modifyValue(num);
      System.out.println("After: " + num);

      // For Objects
      Employee employee= new Employee();
      employee.setName("Jayram");
      System.out.println(employee);
      modifyObject(employee);
    }

    public static void modifyValue(int num) {
      num = 20; // Changing the value of the copy
      System.out.println("Inside modify Value: " + num);
    }

    public static void modifyObject(Employee employee) {  
        employee.setName("Neeraj"); // Modifying the object
        System.out.println("Inside modify Object: " + employee);
  }


}
```

### Q.3 Why Pointers are not used in Java?
- They are unsafe
- Pointers are not used in Java primarily because they introduce complexities like memory management issues and security vulnerabilities, which Java aims to avoid.
- JVM is responsible for memory management, thus in order to avoid direct access to memory by user, pointer are discouraged in java.

## Integer

| No&nbsp; &nbsp; | Problem Statement                                                             |
|-----------------|-------------------------------------------------------------------------------|
| 1               | [ ✅ Find even numbers from given ArrayList](#integer-example-1)               |
| 2               | [ ✅ Find odd numbers from given ArrayList](#integer-example-2)                |
| 3               | [ ✅ Find duplicate number from given ArrayList](#integer-example-3)           |
| 4               | [ ✅ Find unique number from given ArrayList](#integer-example-4)              |
| 5               | [ ✅ Sort number from given ArrayList in Ascending order](#integer-example-5)  |
| 6               | [ ✅ Sort number from given ArrayList in descending order](#integer-example-6) |
| 7               | [ ✅ Sum of all given number in ArrayList](#integer-example-7)                 |
| 8               | [ ✅ Find the largest/Max number from ArrayList](#integer-example-8)           |
| 9               | [ ✅ find the Smallest/Min number from ArrayList](#integer-example-9)          |
| 10              | [ ✅ find the number which occur more than once](#integer-example-10)          |
| 11              | [ ✅ find the number along with its frequency which occur more than once](#integer-example-11)          |
| 12              | [ ✅ perform Multiple Operation](#integer-example-12)          |



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
| 5               | [ ✅ find the character which occur more than once](#string-example-6)               |
| 5               | [ ✅ find the character with its frequency which occur more than once](#string-example-7)               |

<div>
    <b><a href="#table-of-contents">👆 Back To Top</a></b>
</div>

## Employee

| No&nbsp; &nbsp; | Problem Statement                                                                                  |
|-----------------|----------------------------------------------------------------------------------------------------|
| DATA            | [ ☑️ Employee List Data](#employee-list-data)                                                      |
| 1               | [ ✅ Print all employee from IT Department](#employee-example-1)                                    |
| 2               | [ ✅ Print all employee from IT Department whose salary is greater than 40000](#employee-example-2) |
| 3               | [ ✅ Print Distinct Department from employee](#employee-example-3)                                  |
| 4               | [ ✅ Print No of employee from each department](#employee-example-4)                                |
| 5               | [ ✅ Find Average age of Male and Female employee](#employee-example-5)                             |
| 6               | [ ✅ Find employee with highest paid salary in each department](#employee-example-6)                |
| 7               | [ ✅ Find employee with lowest paid salary in each department](#employee-example-7)                 |

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


#### Integer Example 8
>find the largest/Max number from ArrayList
```java
public class IntegerListStreamExample {
    public static void main(String[] args) {
        
// DATA
        List<Integer> UNSORTED_LIST = PopulateListData.getListForSorting(); // [5, 2, 6, 9, 3, 1, 10, 4]

//  Example: 8 -> find the largest/Max number from ArrayList
// Expected Output : 10

        Optional<Integer> largestNumber = UNSORTED_LIST.stream().max(Integer::compare);
        largestNumber.ifPresent(integer -> System.out.println("Largest Number -> " + integer)); 

// OUTPUT : 👇        
// Largest Number -> 10
    }
}
```

<div align="right">
    <b><a href="#integer">👆 Back To Integer</a></b>
</div>


#### Integer Example 9
>find the Smallest/Min number from ArrayList
```java
public class IntegerListStreamExample {
    public static void main(String[] args) {
        
// DATA
        List<Integer> UNSORTED_LIST = PopulateListData.getListForSorting(); // [5, 2, 6, 9, 3, 1, 10, 4]

//  Example: 9 -> find the Smallest/Min number from ArrayList
// Expected Output : 1

        Optional<Integer> smallestNumber = UNSORTED_LIST.stream().min(Integer::compare);
        smallestNumber.ifPresent(integer -> System.out.println("Smallest number -> " + integer)); // Smallest number -> 1
        

// OUTPUT : 👇        
// Smallest number -> 1
    }
}
```


#### Integer Example 10
>find the number which occur more than once
```java
public class IntegerListStreamExample {
    public static void main(String[] args) {
        
// DATA
       int[] nums = {1,2,3,4,5,2,3,4,5,7,3};

//  Example: 10 -> find the number which occur more than once
// Expected Output : //[2, 3, 4, 5]
        Set<Integer> Output = Arrays.stream(nums)
        .boxed()
        .collect(Collectors.groupingBy(num -> num, Collectors.counting()))
        .entrySet()
        .stream()
        .filter(num -> num.getValue() > 1)
        .map(Entry::getKey)
        .collect(Collectors.toSet());
    System.out.println(Output); //[2, 3, 4, 5]

// OUTPUT : 👇        
// Smallest number -> //[2, 3, 4, 5]
    }
}
```

#### Integer Example 11
>find the number along with its frequency which occur more than once
```java
public class IntegerListStreamExample {
    public static void main(String[] args) {
        
// DATA
       int[] nums = {1,2,3,4,5,2,3,4,5,7,3};

//  Example: 11 -> find the number along with its frequency which occur more than once
// Expected Output : //{2=2, 3=3, 4=2, 5=2}
         Map<Integer, Long> Output = Arrays.stream(nums)
        .boxed()
        .collect(Collectors.groupingBy(num -> num, Collectors.counting()))
        .entrySet()
        .stream()
        .filter(num -> num.getValue() > 1)
        .collect(Collectors.toMap(Entry::getKey, Entry::getValue));

        System.out.println(Output);

// OUTPUT : 👇        
// Smallest number -> //{2=2, 3=3, 4=2, 5=2}
    }
}
```


#### Integer Example 12
>Perform Multiple Operation
```java
public class IntegerListStreamExample {
    public static void main(String[] args) {
        
// DATA

    // You are given a list of lists containing integers.
    // Create a stream to flatten the nested lists,
    // filter out the repeated numbers ( remove duplicate number),
    // sort in descending order,
    // and then find the square of each distinct value.
    // Input:
       List<List<Integer>> nestedLists = Arrays.asList(
        Arrays.asList(1, 2, 3),
        Arrays.asList(3, 4, 5),
        Arrays.asList(5, 6, 7),
        Arrays.asList(7, 8, 9) );

// Expected Output : // [81, 64, 36, 16, 4, 1]

        List<Integer> result = nestedLists.stream().flatMap(List::stream)
        .collect(Collectors.groupingBy(num -> num, Collectors.counting()))
        .entrySet()
        .stream()
        .filter(entry -> entry.getValue() == 1)
        .map(Entry::getKey)
        .sorted((a, b) -> b - a)
        .map(num -> num * num)
        .collect(Collectors.toList());
    
    System.out.println(result);

// OUTPUT : 👇        
//  [81, 64, 36, 16, 4, 1]

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


#### String Example 6
>find the character which occur more than once
```java
public class StringListStreamExample {
    public static void main(String[] args) {
        
// DATA
       String str = "abdbeebddd";

// Example: 5 -> Sort name from ArrayList in Descending Order
// Expected Output : // [b, d, e]

           Set<String> collect1 = Arrays.stream(str.split(""))
        .collect(Collectors.groupingBy(ch -> ch, Collectors.counting()))
        .entrySet()
        .stream()
        .filter(entry -> entry.getValue() > 1)
        .map(Entry::getKey)
        .collect(Collectors.toSet());
    System.out.println(collect1); // [b, d, e]

// OUTPUT : 👇        
// [b, d, e]

    }
}
```



#### String Example 7
>find the character with its frequency which occur more than once
```java
public class StringListStreamExample {
    public static void main(String[] args) {
        
// DATA
       String str = "abdbeebddd";

// Example: 5 -> Sort name from ArrayList in Descending Order
// Expected Output : // {b=3, d=4, e=2}

    Map<String, Long> collect = Arrays.stream(str.split(""))
        .collect(Collectors.groupingBy(ch -> ch, Collectors.counting()))
        .entrySet()
        .stream()
        .filter(ch -> ch.getValue() > 1)
        .collect(Collectors.toMap(Entry::getKey, Entry::getValue));

    System.out.println(collect); // {b=3, d=4, e=2}

// OUTPUT : 👇        
// {b=3, d=4, e=2}

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


#### Employee Example 7
>Find employee with lowest paid salary in each department
```java
public class EmployeeStreamExample {
    public static void main(String[] args) {

// DATA
        List<Employee> EMPLOYEE_LIST = PopulateEmployeeData.getEmployeeData();
        
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
```
<div align="right">
    <b><a href="#employee">👆 Back To Employee</a></b>
</div>