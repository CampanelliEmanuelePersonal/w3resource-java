import java.util.ArrayList;
import java.util.List;

public class Es2 {

    // 2. Write a Java program to create a generic method that takes a list of numbers and
    // prints the sum of all the even and odd numbers.
    public static <T extends Number> void evenAndOddSum(List<T> list) {
        double evenSum = 0, oddSum = 0;
        for (T number : list) {
            if (number.doubleValue() % 2 == 0)
                evenSum += number.doubleValue();
            else
                oddSum += number.doubleValue();
        }
        System.out.println("Even sum: " + evenSum);
        System.out.println("Odd sum: " + oddSum);
    }

    public static void main(String[] args) {
        List<Double> doubleList = List.of(1.0, 2.0, 3.0, 4.0, 5.0);
        evenAndOddSum(doubleList);
    }
}
