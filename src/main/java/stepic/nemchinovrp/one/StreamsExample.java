package stepic.nemchinovrp.one;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import static java.lang.Math.pow;

public class StreamsExample {
    public static void main(String[] args) {
//        distinctStream();
        filterExample();
        limitExample(10);
    }

    private static void limitExample(int i) {
        Random random = new Random();
        random.ints().limit(i).forEach(System.out::println);
    }

    private static void filterExample() {
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        long count = strings.stream().filter(string -> string.length() >= 3).count();
        System.out.println(count);
    }

    private static void distinctStream() {
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        List<Integer> squaresList = numbers.stream().map( i -> Double.valueOf(pow(i, 2)).intValue()).distinct().collect(Collectors.toList());
        squaresList.forEach(System.out::println);
    }

    private static void randomExample() {
        Random random = new Random();
        random.ints().limit(3).forEach(System.out::println);
    }
}
