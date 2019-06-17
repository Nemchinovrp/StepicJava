package stepic.nemchinovrp.one;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.*;

public class CollectorsExample {
    public static void main(String[] args) {
        List<Account> accounts = Arrays.asList(new Account("1", 100), new Account("2", 300), new Account("3", 200));


        long summary = accounts.stream()
                .collect(summingLong(Account::getBalance));
        System.out.println("summary - " + summary);

        double average = accounts.stream()
                .collect(averagingLong(Account::getBalance));
        System.out.println("average - " + average);

        String meganumber = accounts.stream()
                .collect(reducing("", Account::getNumber, String::concat));
        System.out.println("reducing - " + meganumber);
    }
}
