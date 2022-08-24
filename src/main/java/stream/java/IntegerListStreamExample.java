package stream.java;

import util.PopulateListData;

import java.util.List;

public class IntegerListStreamExample {
    public static void main(String[] args) {

// DATA
        List<Integer> INTEGER_LIST = PopulateListData.getIntegerList(); // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

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


    }
}
