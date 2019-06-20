package stepic.nemchinovrp.two;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Task2_16 {
    public static void main(String[] args) {
//        1 2 3 4
      /*  createFilteringStream(IntStream.of(30, 60, 90), IntStream.of(75)).forEach(System.out::println);
        createFilteringStream(IntStream.of(2, 4), IntStream.of(1, 3)).forEach(System.out::println);*/
       /* System.out.println(factorial(0));
        System.out.println(factorial(1));
        System.out.println(factorial(2));*/
        System.out.println(sumOfOddNumbersInRangeVersionTwo(0, 0));
        System.out.println(sumOfOddNumbersInRangeVersionTwo(7, 9));
        System.out.println(sumOfOddNumbersInRangeVersionTwo(21, 30));
    }

    private static Boolean second() {
        return IntStream
                .iterate(0, n -> n + 1)
                .limit(100)
                .filter(n -> n % 2 != 0)
                .noneMatch(n -> n % 2 == 0);
    }

    private static void first() {
        boolean result = LongStream
                .rangeClosed(1, 100_000)
                .anyMatch(val -> val == 100_000);

        System.out.println(result);
    }

    public static boolean isPrime(long number) {
        return number > 1 &&
                LongStream
                        .range(2, number)
                        .noneMatch(index -> number % index == 0);
    }

    public static Stream<String> createBadWordsDetectingStream(String text, List<String> badWords) {
        return Arrays.stream(text.split(" ")).filter(badWords::contains).distinct().sorted();
    }

    public static IntStream createFilteringStream(IntStream evenStream, IntStream oddStream) {
        return IntStream.concat(evenStream, oddStream).filter(v -> v % 3 == 0 && v % 5 == 0).sorted().skip(2);
    }

    public static long factorial(long n) {
        return LongStream.rangeClosed(1, n).reduce(1, (left, right) -> left * right);
    }

    public static long sumOfOddNumbersInRange(long start, long end) {
        return LongStream.rangeClosed(start, end).filter(v -> v % 2 != 0).reduce(0, (left, right) -> left + right);
    }

    public static long sumOfOddNumbersInRangeVersionTwo(long start, long end) {
        return LongStream.rangeClosed(start, end).filter(v -> v % 2 != 0).sum();
    }
}
