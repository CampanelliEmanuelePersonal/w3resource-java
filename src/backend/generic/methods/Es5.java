package backend.generic.methods;

import java.util.ArrayList;
import java.util.List;

public class Es5 {

    // 5. Write a Java program to create a generic method that takes two lists of the same
    // type and merges them into a single list. This method alternates the elements of each list.
    public static <T> List<T> mergeLists(List<T> list1, List<T> list2) {
        if (!(list1.size() == list2.size()))
            return null;
        else {
            List<T> mergedList = new ArrayList<>();
            for (int i = 0; i < list1.size(); i++) {
                mergedList.add(list1.get(i));
                mergedList.add(list2.get(i));
            }
            return mergedList;
        }
    }

    public static void main(String[] args) {
        List <String> colors1 = List.of("Red1", "Green1", "Orange1");
        List <String> colors2 = List.of("Red", "Green", "Orange");
        System.out.println(mergeLists(colors1, colors2));
    }
}
