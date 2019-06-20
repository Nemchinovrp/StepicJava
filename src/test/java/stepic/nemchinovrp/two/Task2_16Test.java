package stepic.nemchinovrp.two;


import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class Task2_16Test {

    @Test
    public void test() {
        String text = "one two three four five seven hhh kkk";
        List<String> strings = Arrays.asList("seven", "hhh");
        Task2_16.createBadWordsDetectingStream(text, strings).forEach(System.out::println);

    }

}