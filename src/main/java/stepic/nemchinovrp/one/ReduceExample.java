package stepic.nemchinovrp.one;

import java.util.stream.IntStream;

public class ReduceExample {
    public static void main(String[] args) {
        int sum = IntStream.range(1, 9).reduce(10, (acc, elem) -> {
            System.out.println("acc = " + acc + ", " + "elem = " + elem);
            return acc * elem;
        });
        System.out.println(sum);
    }
}