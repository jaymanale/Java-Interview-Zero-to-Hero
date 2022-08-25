package util;

import java.util.List;

public class PopulateListData {

    public static List<Integer> getIntegerList() {
        return List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    }

    public static List<Integer> getDuplicateIntegerList() {
        return List.of(1, 2, 2, 3, 3, 4, 5, 6, 6, 7, 8, 8);
    }

}
