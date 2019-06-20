package stepic.nemchinovrp.two;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Task2_22 {
    public static void main(String[] args) {
        List<Integer> numbers = Stream.of(1, 2, 3, 4, 5).collect(Collectors.toList());
        a(numbers);
        System.out.println();
        b(numbers);
        System.out.println();
        c(numbers);
        System.out.println();
        d(numbers);
    }

    private static void d(List<Integer> numbers) {
        numbers.stream()
                .flatMap(Stream::of)
                .collect(Collectors.toList()).forEach(System.out::print);
    }

    private static void c(List<Integer> numbers) {
        numbers.stream()
                .flatMapToInt(n -> IntStream.iterate(n, val -> val + 1).limit(n))
                .boxed()
                .collect(Collectors.toList()).forEach(System.out::print);
    }

    private static void b(List<Integer> numbers) {
        numbers.stream()
                .flatMapToInt(n -> IntStream.rangeClosed(1, n))
                .boxed()
                .collect(Collectors.toList()).forEach(System.out::print);
    }

    private static void a(List<Integer> numbers) {
       numbers.stream()
                .flatMap(n -> Stream.generate(() -> n).limit(n))
                .collect(Collectors.toList()).forEach(System.out::print);
    }
}
