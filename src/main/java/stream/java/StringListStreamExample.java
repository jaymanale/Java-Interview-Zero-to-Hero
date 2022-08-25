package stream.java;

import util.PopulateListData;

import java.util.List;

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
        System.out.println("Name start with 'N' -> " + nameStartWith); // Name start with 'N' -> [Neha, Neeraj]

// Example: 2 -> converts each name into an UPPERCASE string from ArrayList
// Expected Output : [SHAM, RAM, JOHN, NEHA, AJAY, KARAN, NEERAJ]

        List<String> uppercaseNamesList = NAME_LIST
                .stream()
                .map(String::toUpperCase)
                .toList();
        System.out.println("Names in UPPERCASE -> "+uppercaseNamesList); // Names in UPPERCASE -> [SHAM, RAM, JOHN, NEHA, AJAY, KARAN, NEERAJ]

// Example: 3 -> converts each name into an LOWERCASE string from ArrayList
// Expected Output : [sham, ram, john, neha, ajay, karan, neeraj]

        List<String> lowercaseNamesList = NAME_LIST
                .stream()
                .map(String::toLowerCase)
                .toList();
        System.out.println("Names in LOWERCASE -> "+lowercaseNamesList); // Names in LOWERCASE -> [sham, ram, john, neha, ajay, karan, neeraj]
    }
}
