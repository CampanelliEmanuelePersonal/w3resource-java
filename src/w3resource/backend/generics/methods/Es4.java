package w3resource.backend.generics.methods;

import java.util.ArrayList;
import java.util.List;

public class Es4 {
    // 4. Write a Java program to create a generic method that takes a list of any type and returns
    // it as a new list with the elements in reverse order.
    public static <T> List<T> reverseList(List<T> list) {
        List<T> reversedList = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--)
            reversedList.add(list.get(i));
        return reversedList;
    }

    public static void main(String[] args) {
        List<Double> doubleList = List.of(1.0, 2.0, 3.0, 4.0, 5.0);
        List <String> colors = List.of("Red", "Green", "Orange");
        System.out.println(reverseList(doubleList));
        System.out.println(reverseList(colors));
    }
}
