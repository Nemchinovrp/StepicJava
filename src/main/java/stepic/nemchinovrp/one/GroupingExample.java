package stepic.nemchinovrp.one;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;



public class GroupingExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        int result = numbers.stream().reduce(100, Integer::sum);
        System.out.println(result);


        List<Integer> sortedNumbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        sortedNumbers.stream()
                .map(Function.identity()) // some processing
                .forEach(n -> System.out.print(n + " "));

       /* Stream.concat(numbers.stream(), emptyList.stream())
                .parallel()
                .filter(x -> x % 2 == 0)
                .limit(3)
                .forEachOrdered((n) -> System.out.print(n + " "));*/
    }
}
