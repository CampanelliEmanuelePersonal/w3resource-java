package functionalProgramming.exercises;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {

    // 1. Having a list of numbers, print the maxim number from it.
    public static void es1solution1() {
        List<Integer> intList = Arrays.asList(4, 6, 1, 6, 7);

        Function<List<Integer>, Number> findMax = list -> {
            return list.stream().max(Comparator.comparing(Integer::valueOf)).get();
        };

        System.out.println(findMax.apply(intList));
    }


    public static void main(String[] args) {
//        es1solution1();

        List<Integer> intList = Arrays.asList(4, 6, 1, 6, 7);
        List<String> stringList = Arrays.asList("s1", "s2", "s3", "s4", "s5");

        Character character = 'a';

//        BiFunction<Character, Predicate<T>, Boolean> f = (c) -> {

//        };

        Predicate<Character> p = c -> {
            return Character.isLowerCase(c) || Character.isUpperCase(c) || Character.isDigit(c);
        };

        System.out.println(p.test(character));

        Predicate<Character> isLowerCase = Character::isLowerCase;
        Predicate<Character> isUpperCase = Character::isUpperCase;
        Predicate<Character> isDigit = Character::isDigit;

        System.out.println(isLowerCase.test(character));

    }
}
