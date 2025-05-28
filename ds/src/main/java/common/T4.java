package common;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class T4 {
    public static <T extends Comparable<T>> List<T> mergeLists(List<T> list1, List<T> list2) {
        if (list1 == null || list1.isEmpty()) return new ArrayList<>(list2 != null ? list2 : List.of());
        if (list2 == null || list2.isEmpty()) return new ArrayList<>(list1);

        List<T> result = new ArrayList<>(list1.size() + list2.size());
        int i = 0, j = 0;

        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i).compareTo(list2.get(j)) <= 0) {
                result.add(list1.get(i++));
            } else {
                result.add(list2.get(j++));
            }
        }

        while (i < list1.size()) result.add(list1.get(i++));
        while (j < list2.size()) result.add(list2.get(j++));

        return result;
    }

    public static void main(String[] args) {
        List<Integer> list1 = List.of(2, 5, 10);
        List<Integer> list2 = List.of(2, 4, 6);
        System.out.println(mergeLists(list1, list2)); // Expected: [1, 2, 3, 4, 5, 6]
}
}
