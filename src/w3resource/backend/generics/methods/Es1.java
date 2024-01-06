package w3resource.backend.generics.methods;

import java.util.List;

public class Es1 {

    // 1. Write a Java program to create a generic method that takes two arrays
    // of the same type and checks if they have the same elements in the same order.
    public static <T> boolean sameElementsPos(T arr1[], T arr2[]) {
        if (arr1.length != arr2.length)
            return false;
        for (int i = 0; i < arr1.length; i++)
            if (!arr1[i].equals(arr2[i]))
                return false;
        return true;
    }

    public static void main(String[] args) {
        Integer[] intArr1 = {1, 2, 3, 4, 5};
        Integer[] intArr2 = {1, 2, 3, 4, 5};
        String[] stringArr1 = {"a", "b", "c"};
        String[] stringArr2 = {"b", "a", "c"};

        System.out.println(sameElementsPos(intArr1, intArr2));
        System.out.println(sameElementsPos(stringArr1, stringArr2));
    }
}