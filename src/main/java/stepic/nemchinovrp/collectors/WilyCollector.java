package stepic.nemchinovrp.collectors;

import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class WilyCollector {
    private static List<Account> accounts = Stream.of(
            new Account("530012", 3333L, State.ACTIVE),
            new Account("771843", 15000L, State.BLOCKED),
            new Account("234465", 12000L, State.ACTIVE),
            new Account("110011", 8800L, State.ACTIVE),
            new Account("462181", 45000L, State.BLOCKED),
            new Account("681891", 0L, State.REMOVED)
    ).collect(toList());


    public static void main(String[] args) {
        groupByListAccounts();
        summing();
    }

    private static void summing() {
        Collector<Account, ?, Map<State, Long>> summingByStates =
                groupingBy(Account::getState, summingLong(Account::getBalance));

        Map<State, Long> sumByStates = accounts.stream().collect(summingByStates);
        sumByStates.entrySet().forEach(System.out::println);
    }

    private static void groupByListAccounts() {
        Map<State, Long> sumByStates = accounts.stream()
                .collect(groupingBy(Account::getState, summingLong(Account::getBalance)));
        sumByStates.entrySet().forEach(System.out::println);
    }
}
