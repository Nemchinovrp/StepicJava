package stepic.nemchinovrp.collectors;

import stepic.nemchinovrp.two.Account;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class Main {
    private static List<Account> accounts = Arrays.asList(new Account("one", 100L, false), new Account("two", 100L, true), new Account("three", 100L, true));

    public static void main(String[] args) {
        /*toList();
        toSet();*/
//        toMap();
//        toHashSet();
//        partitionByToMap();
//        groupBytoMap();
//        sumLongStream();
        collectWithReducing();
    }

    private static void collectWithReducing() {
        String meganumber = accounts.stream()
                .collect(reducing("", Account::getNumber, String::concat));
        System.out.println("reduce - " + meganumber);
    }

    private static void sumLongStream() {
        long summary = accounts.stream()
                .collect(summingLong(Account::getBalance));
        System.out.println("summary - " + summary);

        double average = accounts.stream()
                .collect(averagingLong(Account::getBalance));
        System.out.println("avarage - " + average);
    }

    private static void groupBytoMap() {
        Map<Boolean, List<Account>> groupingByState = accounts.stream()
                .collect(Collectors.groupingBy(Account::isLocked));
        groupingByState.entrySet().forEach(System.out::println);
    }

    private static void partitionByToMap() {
        Map<Boolean, List<Account>> partByBalance = accounts.stream()
                .collect(Collectors.partitioningBy(a -> a.getBalance() >= 10000));
        partByBalance.entrySet().forEach(System.out::println);
    }

    private static void toHashSet() {
        Set<Account> accountSet = accounts.stream().collect(Collectors.toCollection(HashSet::new));
        accountSet.forEach(System.out::println);
    }

    private static void toMap() {
        Map<String, Long> numberToBalanceMap = accounts.stream()
                .collect(Collectors.toMap(Account::getNumber, Account::getBalance));
        numberToBalanceMap.entrySet().forEach(System.out::println);
    }

    private static void toSet() {
        Set<String> numberSet = accounts.stream()
                .map(Account::getNumber)
                .collect(Collectors.toSet());
    }

    private static void toList() {
        List<String> numberList = accounts.stream()
                .map(Account::getNumber)
                .collect(Collectors.toList());
    }
}
