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
        
// Example: 3 Find duplicate number from given ArrayList
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

// Example: 4 Find unique number from given ArrayList
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