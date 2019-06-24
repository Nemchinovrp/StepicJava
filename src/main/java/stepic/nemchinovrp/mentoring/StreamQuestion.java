package stepic.nemchinovrp.mentoring;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class StreamQuestion {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 2, 3, 3, 4, 5, 6);

        integers.stream().map(HashSet::new).forEach(System.out::println);


    }
}
