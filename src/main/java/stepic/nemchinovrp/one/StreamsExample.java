package stepic.nemchinovrp.one;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import static java.lang.Math.pow;

public class StreamsExample {
    public static void main(String[] args) {
        distinctStream();

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
