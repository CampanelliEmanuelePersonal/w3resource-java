package w3resource.backend.generics.methods;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

public class Es6 {

    // 6. Write a Java program to create a generic method that takes a list of any type and
    // a predicate. It returns an array list containing only elements that satisfy the predicate.
    public static <T> List<T> filterList(List<T> list, Predicate<T> predicate) {
        List<T> filteredList = new ArrayList<>();
        for (T el : list)
            if (predicate.test(el))
                filteredList.add(el);
        return filteredList;
    }

    public static void main(String[] args) {
        List<Double> doubleList = List.of(1.0, 2.0, 3.0, 4.0, 5.0);
        System.out.println(filterList(doubleList, n -> n >= 2.5));

        List <String> colors = List.of("Red", "Green", "Orange");
        System.out.println(filterList(colors, s -> !s.equals("Red")));
    }
}
