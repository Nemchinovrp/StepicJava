package stepic.nemchinovrp.two;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Lambda {
    public static void main(String[] args) {
 /*       Function<Integer, Integer> identity = i -> (i % 2 == 0) ? i + 2 : i + 1;
        Function<Integer, Integer> identity2 = x -> (x & ~1) + 2;
        ;
        System.out.println(identity2.apply(2));
        System.out.println(identity2.apply(317));
        FunctionalInterfaceExample<String> example = (x, y, z, d, e, f, g) -> x.concat(y).concat(z).concat(d).concat(e).concat(f).concat(g).toUpperCase();
        FunctionalInterfaceExample<String> example2 = (x, y, z, d, e, f, g) -> Arrays.asList(x, y, z, d, e, f, g).stream().map(String::toUpperCase).collect(Collectors.joining(""));
        System.out.println(example.apply("on", "tw", "thr", "fr", "dfgd", "dgd", "df"));
        System.out.println(example2.apply("on", "tw", "thr", "fr", "dfgd", "dgd", "df"));*/
        BiFunction<Long, Long, Long> function = (x, y) -> (x == y) ? y :  LongStream.rangeClosed(x, y).reduce(1, (left, right) -> left * right);

        System.out.println(function.apply(0L, 1L));
        System.out.println(function.apply(2L, 2L));
        System.out.println(function.apply(1L, 4L));
        System.out.println(function.apply(5L, 15L));
        BiFunction<String, String, String> before = (x, y) -> "prefix".concat(x.trim()).concat(y.trim()).concat("suffix");
        System.out.println(before.apply("  dfdf  ", "dfdf  "));


    }

    private static int nextEvenNumber(int i) {
      /*  if (i % 2 == 0) {
            return i + 2;
        } else {
            return i + 1;
        }*/
        return (i % 2 == 0) ? i + 2 : i + 1;
    }
}
