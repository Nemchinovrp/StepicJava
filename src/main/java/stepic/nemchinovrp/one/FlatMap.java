package stepic.nemchinovrp.one;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class FlatMap {
    public static void main(String[] args) {
        flatMapExample();
    }

    private static void flatMapExample() {
        final List<Book> javaBooks = Stream.of(
                new Book("Java EE 7 Essentials", 2013, Arrays.asList("Arun Gupta", "Robert Martin")),
                new Book("Algorithms", 2011, Arrays.asList("Robert Sedgewick", "Kevin Wayne")),
                new Book("Clean code", 2014, Arrays.asList("Robert Martin"))
        ).collect(toList());


        javaBooks.stream()
                .flatMap(book -> book.getAuthors().stream())
                .distinct()
                .collect(toList())
                .forEach(System.out::println);
    }
}

