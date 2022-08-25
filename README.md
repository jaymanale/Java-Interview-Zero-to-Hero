# Java-8
Java-8 Interview Preparation with Examples

### Example 1 : Find even numbers from given ArrayList
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
        System.out.println("Even Number -> " + evenNumberList); // Even Number -> [2, 4, 6, 8, 10]
    }
}
```
### Example 2 : Find odd numbers from given ArrayList
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
        System.out.println("Odd Number -> " + oddNumberList); // Odd Number -> [1, 3, 5, 7, 9]
    }
}

```

### Example 3 : Find duplicate number from given ArrayList
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
        System.out.println("Duplicate number -> " + duplicateNumber); // Duplicate number -> [2, 3, 6, 8]
    }
}
```

### Example 4 : Find unique number from given ArrayList
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
        System.out.println("Unique number -> " + uniqueNumber); // Unique number -> [1, 2, 3, 4, 5, 6, 7, 8]
    }
}
```

### Example 5 : Sort number from given ArrayList in Ascending order
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
        System.out.println("Number in Ascending order -> " + numberSortedInAscendingOrder); // Number in Ascending order -> [1, 2, 3, 4, 5, 6, 9, 10]
    }
}
```


### Example 6 : Sort number from given ArrayList on descending order
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
        System.out.println("Number in Descending order -> " + numberSortedInDescendingOrder); // Number in Descending order -> [10, 9, 6, 5, 4, 3, 2, 1]
    }
}
```
### Example 7 : Find names start with 'N' in ArrayList
```java
public class StringListStreamExample {
    public static void main(String[] args) {
        
// DATA
        List<String> NAME_LIST = PopulateListData.getNames(); // ["Sham", "Ram", "John", "Neha", "Ajay", "Karan", "Neeraj"]

// Example: 7 -> Find names start with 'N' in ArrayList
// Expected Output : [Neha, Neeraj]

        List<String> nameStartWith = NAME_LIST
                .stream()
                .filter(name -> name.startsWith("N"))
                .toList();
        System.out.println("Name start with 'N' -> " + nameStartWith); // Name start with 'N' -> [Neha, Neeraj]

    }
}
```
### Example 8 : Converts each name into an UPPERCASE string from ArrayList
```java
public class StringListStreamExample {
    public static void main(String[] args) {
        
// DATA
        List<String> NAME_LIST = PopulateListData.getNames(); // ["Sham", "Ram", "John", "Neha", "Ajay", "Karan", "Neeraj"]
        
// Example: 8 -> converts each name into an UPPERCASE string from ArrayList
// Expected Output : [SHAM, RAM, JOHN, NEHA, AJAY, KARAN, NEERAJ]

        List<String> uppercaseNamesList = NAME_LIST
                .stream()
                .map(String::toUpperCase)
                .toList();
        System.out.println("Names in UPPERCASE -> "+uppercaseNamesList); // Names in UPPERCASE -> [SHAM, RAM, JOHN, NEHA, AJAY, KARAN, NEERAJ]

    }
}
```
### Example 9 : Converts each name into an LOWERCASE string from ArrayList
```java
public class StringListStreamExample {
    public static void main(String[] args) {
        
// DATA
        List<String> NAME_LIST = PopulateListData.getNames(); // ["Sham", "Ram", "John", "Neha", "Ajay", "Karan", "Neeraj"]
        
// Example: 9 -> converts each name into an LOWERCASE string from ArrayList
// Expected Output : [sham, ram, john, neha, ajay, karan, neeraj]

        List<String> lowercaseNamesList = NAME_LIST
                .stream()
                .map(String::toLowerCase)
                .toList();
        System.out.println("Names in LOWERCASE -> "+lowercaseNamesList); // Names in LOWERCASE -> [sham, ram, john, neha, ajay, karan, neeraj]

    }
}
```
### Example 10 : Sort name from ArrayList in Ascending Order
```java
public class StringListStreamExample {
    public static void main(String[] args) {
        
// DATA
        List<String> NAME_LIST = PopulateListData.getNames(); // ["Sham", "Ram", "John", "Neha", "Ajay", "Karan", "Neeraj"]

// Example: 10 -> Sort name from ArrayList in Ascending Order
// Expected Output : [Ajay, John, Karan, Neeraj, Neha, Ram, Sham]

        List<String> nameSortedInAscendingOrder = NAME_LIST
                .stream()
                .sorted()
                .toList();
        System.out.println("Names in Ascending order -> "+nameSortedInAscendingOrder); // Names in Ascending order -> [Ajay, John, Karan, Neeraj, Neha, Ram, Sham]

    }
}
```

### Example 11 : Sort name from ArrayList in Descending Order
```java
public class StringListStreamExample {
    public static void main(String[] args) {
        
// DATA
        List<String> NAME_LIST = PopulateListData.getNames(); // ["Sham", "Ram", "John", "Neha", "Ajay", "Karan", "Neeraj"]

// Example: 11 -> Sort name from ArrayList in Descending Order
// Expected Output : [Sham, Ram, Neha, Neeraj, Karan, John, Ajay]

        List<String> nameSortedInDescendingOrder = NAME_LIST
                .stream()
                .sorted(Comparator.reverseOrder())
                .toList();
        System.out.println("Names in Descending order -> "+nameSortedInDescendingOrder); // Names in Descending order -> [Sham, Ram, Neha, Neeraj, Karan, John, Ajay]

    }
}
```