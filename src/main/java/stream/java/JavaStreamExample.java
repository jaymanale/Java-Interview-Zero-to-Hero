package stream.java;

import java.util.List;
import java.util.stream.Collectors;

public class JavaStreamExample {
    public static void main(String[] args) {

// DATA
        List<Integer> INTEGER_LIST = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);


//        Example: 1 -> Find even numbers from given ArrayList
//        Expected Output : [2, 4, 6, 8, 10]

        List<Integer> evenNumberList = INTEGER_LIST
                .stream()
                .filter(number -> number % 2 == 0)
                .toList();
        System.out.println("Even Number -> " + evenNumberList);


//        Example: 1 -> Find odd numbers from given ArrayList
//        Expected Output : [1, 3, 5, 7, 9]

        List<Integer> oddNumberList = INTEGER_LIST
                .stream()
                .filter(number -> number % 2 != 0)
                .toList();
        System.out.println("Odd Number -> " + oddNumberList);
    }
}
