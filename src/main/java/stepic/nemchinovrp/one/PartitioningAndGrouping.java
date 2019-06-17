package stepic.nemchinovrp.one;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitioningAndGrouping {
    public static void main(String[] args) {
        List<Account> accounts = Arrays.asList(new Account("1", 100), new Account("2", 300), new Account("3", 200));

        Map<Boolean, List<Account>> partByBalance = accounts.stream()
                .collect(Collectors.partitioningBy(a -> a.getBalance() >= 200));
        partByBalance.entrySet().forEach(System.out::println);

        //======================================================
//        Map<Account.State, List<Account>> groupingByState = accounts.stream()
//                .collect(Collectors.groupingBy(Account::getState));
    }
}
