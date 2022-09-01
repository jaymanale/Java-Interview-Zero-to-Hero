package stream.java;

import util.PopulateListData;

import java.util.*;

public class IntegerListStreamExample {
    public static void main(String[] args) {

// DATA
        List<Integer> INTEGER_LIST = PopulateListData.getIntegerList(); // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        List<Integer> DUPLICATE_INTEGER_LIST = PopulateListData.getDuplicateIntegerList(); // 1, 2, 2, 3, 3, 4, 5, 6, 6, 7, 8, 8
        List<Integer> UNSORTED_LIST = PopulateListData.getListForSorting(); // [5, 2, 6, 9, 3, 1, 10, 4]

//        Example: 1 -> Find even numbers from given ArrayList
//        Expected Output : [2, 4, 6, 8, 10]

        List<Integer> evenNumberList = INTEGER_LIST
                .stream()
                .filter(number -> number % 2 == 0)
                .toList();
        System.out.println("Even Number -> " + evenNumberList); // Even Number -> [2, 4, 6, 8, 10]


//        Example: 2 -> Find odd numbers from given ArrayList
//        Expected Output : [1, 3, 5, 7, 9]

        List<Integer> oddNumberList = INTEGER_LIST
                .stream()
                .filter(number -> number % 2 != 0)
                .toList();
        System.out.println("Odd Number -> " + oddNumberList); // Odd Number -> [1, 3, 5, 7, 9]

//        Example: 3 Find duplicate number from given ArrayList
//        Expected Output : [2, 3, 6, 8]

        Set<Integer> duplicateSet = new HashSet<>();
        List<Integer> duplicateNumber = DUPLICATE_INTEGER_LIST
                .stream()
                .filter(number -> !duplicateSet.add(number))
                .toList();
        System.out.println("Duplicate number -> " + duplicateNumber); // [2, 3, 6, 8]

//        Example: 4 Find unique number from given ArrayList
//        Expected Output : [1, 2, 3, 4, 5, 6, 7, 8]
        Set<Integer> uniqueSet = new HashSet<>();
        List<Integer> uniqueNumber = DUPLICATE_INTEGER_LIST
                .stream()
                .filter(uniqueSet::add)
                .toList();
        System.out.println("Unique number -> " + uniqueNumber); // [1, 2, 3, 4, 5, 6, 7, 8]

//        Example: 5 Sort number from given ArrayList in Ascending order
//        Expected Output : [1, 2, 3, 4, 5, 6, 9, 10]
        List<Integer> numberSortedInAscendingOrder = UNSORTED_LIST
                .stream()
                .sorted()
                .toList();
        System.out.println("Number in Ascending order -> " + numberSortedInAscendingOrder); // Number in Ascending order -> [1, 2, 3, 4, 5, 6, 9, 10]


//        Example: 6 -> Sort number from given ArrayList on descending order
//        Expected Output : [10, 9, 6, 5, 4, 3, 2, 1]
        List<Integer> numberSortedInDescendingOrder = UNSORTED_LIST
                .stream()
                .sorted(Comparator.reverseOrder())
                .toList();
        System.out.println("Number in Descending order -> " + numberSortedInDescendingOrder); // Number in Descending order -> [10, 9, 6, 5, 4, 3, 2, 1]

// Example: 7 -> Sum of all given number in ArrayList
// Expected Output : 55

        Optional<Integer> sumOfAllNumber = INTEGER_LIST.stream().reduce(Integer::sum);
        sumOfAllNumber.ifPresent(integer -> System.out.println("Sum Of all Numbers -> " + integer)); // Sum Of all Numbers -> 55


//  Example: 8 -> find the largest/Max number from ArrayList
// Expected Output : 10

        Optional<Integer> largestNumber = UNSORTED_LIST.stream().max(Integer::compare);
        largestNumber.ifPresent(integer -> System.out.println("Largest Number -> " + integer)); // Largest Number -> 10

//  Example: 9 -> find the Smallest/Min number from ArrayList
// Expected Output : 1

        Optional<Integer> smallestNumber = UNSORTED_LIST.stream().min(Integer::compare);
        smallestNumber.ifPresent(integer -> System.out.println("Smallest number -> " + integer)); // Smallest number -> 1


    }
}
