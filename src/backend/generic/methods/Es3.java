package backend.generic.methods;

import java.util.List;

public class Es3 {

    // 3. Write a Java program to create a generic method that takes a list of any type and
    // a target element. It returns the index of the first occurrence of the target element
    // in the list. Return -1 if the target element cannot be found.
    public static <T> int targetIndex(List<T> list, T target) {
        for (T el : list)
            if (el.equals(target))
                return list.indexOf(el);
        return -1;
    }

    public static void main(String[] args) {
        List<Double> doubleList = List.of(1.0, 2.0, 3.0, 4.0, 5.0);
        System.out.println(targetIndex(doubleList, 1.0));;
        System.out.println(targetIndex(doubleList, 5.0));;
        System.out.println(targetIndex(doubleList, 25.0));;
    }
}
