package stepic.nemchinovrp.two;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Task2_26 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        long val = numbers.stream().collect(Collectors.reducing(1L, x -> new Long(x), (integer, integer2) -> integer * integer * integer2 * integer2));
        System.out.println(val);

//        collectToMAp();
    }

/*    private static void collectToMAp() {
        String[] words = {"level" ,"bbaa" ,"ac"};
        Map<Boolean, List<String>> palindromeOrNoMap =
                Arrays.stream(words)
                        .collect(Collectors.toMap(Boolean, Function.identity(), (x) -> {
                            int length = x.

                            for (int i = length - 1; i >= 0; i--)
                                reverse = reverse + original.charAt(i);

                            if (original.equals(reverse))
                                System.out.println("The string is a palindrome.");
                            else
                                System.out.println("The string isn't a palindrome.");

                        }));

        palindromeOrNoMap.entrySet().forEach(System.out::println);
    }*/
}
