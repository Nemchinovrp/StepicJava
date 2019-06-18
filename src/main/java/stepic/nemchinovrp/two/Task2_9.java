package stepic.nemchinovrp.two;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task2_9 {
    public static void main(String[] args) {
//        firstTask();
//        secondTask();
        System.out.println(equalThreeNumber(1,1,1));
        System.out.println(equalThreeNumber(1,2,3));
    }

    private static void secondTask() {
        List<Account> nonEmptyAccounts = Arrays.asList(new Account("1", -100L, true),
                new Account("1", 200L, true),new Account("1", 100_000_0000L, false));
//        et all non-locked accounts with too much money (balance >= 100 000 000)
        List<Account> accounts = nonEmptyAccounts.stream()
                .filter(account -> !account.isLocked())
                .filter(account -> account.getBalance() >=100_000_000L)
                .collect(Collectors.toList());

//        List<Account> accounts = filter(nonEmptyAccounts, account -> !account.isLocked() && account -> account.getBalance() >=100_000_000L);
    }

    private static void firstTask() {
        List<Account> nonEmptyAccounts = Arrays.asList(new Account("1", -100L, true),
                new Account("1", 200L, true),new Account("1", 100L, true));

        nonEmptyAccounts.stream().filter(account -> account.getBalance() > 0).collect(Collectors.toList());
    }

    private static boolean equalThreeNumber(int i, int j, int q) {
        return i != j && j != q && i != q;
    }
}
