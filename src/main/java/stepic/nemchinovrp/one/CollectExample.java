package stepic.nemchinovrp.one;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectExample {
    public static void main(String[] args) {
        List<Account> accounts = Arrays.asList(new Account("1", 100), new Account("2", 300), new Account("3", 200));
        accounts.stream()
                .map(Account::getNumber)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        Set<String> numberSet = accounts.stream()
                .map(Account::getNumber)
                .collect(Collectors.toSet());
        numberSet.forEach(System.out::println);

        Map<String, Integer> numberToBalanceMap = accounts.stream()
                .collect(Collectors.toMap(Account::getNumber, Account::getBalance));
        numberToBalanceMap.forEach((key, value) -> System.out.println(key + " = " + value));
    }
}
