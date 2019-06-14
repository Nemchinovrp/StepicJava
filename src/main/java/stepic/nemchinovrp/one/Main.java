package stepic.nemchinovrp.one;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntPredicate;

public class Main {
    public static void main(String[] args) {
        predicate();
    }

    private static void integerFunction() {
        final Integer constant = 100;
        Function<Integer, Integer> function = (i) -> i * 10;

        System.out.println(function.apply(10));
        System.out.println(function.apply(15));
    }

    private void stringFunction() {
        final String hello = "Hello, ";
        Function<String, String> helloFunction = (name) -> "Hello Amigo - " + name.toUpperCase();

        System.out.println(helloFunction.apply("Serega"));
        System.out.println(helloFunction.apply("Anna"));
    }

    private static void exampleCallback() {
        List<String> fruits = Arrays.asList("apple", "pear", "orange", "banana");

//        fruits.forEach(System.out::println);

        fruits.forEach(fruit -> {
            String doubleFruit = fruit.concat(fruit).toUpperCase().concat(fruit);
            if (doubleFruit.length() > 9) {
                System.out.println(doubleFruit);
            }
        });
    }

    private static void composeFunction() {
        Function<Integer, Integer> adder = x -> x + 10;
        Function<Integer, Integer> multiplier = x -> x * 5;

        // compose: adder(multiplier(5))
        System.out.println("result: " + multiplier.compose(adder).apply(5));

        // andThen: multiplier(adder(5))
        System.out.println("result: " + adder.andThen(multiplier).apply(5));
    }

    private static void predicate() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        IntPredicate isEven = x -> x % 2 == 0;
        IntPredicate dividedBy3 = x -> x % 3 == 0;
        IntPredicate pred = isEven.or(dividedBy3.negate());

        numbers.forEach(val -> {
            if (isEven.negate().or(dividedBy3.negate()).test(val)) System.out.print(val + " ");
        });
    }
}
