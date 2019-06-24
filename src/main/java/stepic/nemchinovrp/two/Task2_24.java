package stepic.nemchinovrp.two;


import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Task2_24 {
    public static void main(String[] args) {
        Transaction transactionOne = new Transaction("1", State.CANCELED, 100L, new Date());
        Transaction transactionTwo = new Transaction("2", State.CANCELED, 100L, new Date());
        Transaction transactionThree = new Transaction("3", State.CANCELED, 100L, new Date());
        Transaction transactionFour = new Transaction("4", State.CANCELED, 100L, new Date());
        AccountTask account = new AccountTask("Kolay", 0L, Arrays.asList(transactionOne, transactionTwo));
        AccountTask accountTwo = new AccountTask("Ilya", 100L, Arrays.asList(transactionOne, transactionTwo, transactionThree, transactionFour));
        System.out.println(calcSumOfCanceledTransOnNonEmptyAccounts(Arrays.asList(account, accountTwo)));
    }

    public static long calcSumOfCanceledTransOnNonEmptyAccounts(List<AccountTask> accounts) {
        return accounts.stream()
                .filter(a -> a.getBalance() > 0)
                .flatMap(a -> a.getTransactions().stream())
                .filter(t -> t.getState().equals(State.CANCELED))
                .mapToLong(Transaction::getSum)
                .sum();
    }
}
/*[
        {
        "number": "1001",
        "balance": 0,
        "transactions": [
        {
        "uuid": "774cedda-9cde-4f53-8bc2-5b4d4859772a",
        "state": "CANCELED",
        "sum": 1000,
        "created": "2016.12.12 18:30:05"
        }
        ]
        },
        {
        "number": "1002",
        "balance": 8000,
        "transactions": [
        {
        "uuid": "337868a7-f469-43c0-9042-3422ce37ee26a",
        "state": "FINISHED",
        "sum": 8000,
        "created": "2016.12.12 17:30:55"
        },
        {
        "uuid": "f8047f86-89e7-4226-8b75-74c55a4d7e31",
        "state": "CANCELED",
        "sum": 10000,
        "created": "2016.12.12 18:10:18"
        }
        ]
        }
        ]*/

//    Write a method using Stream API that calculates the total sum of canceled transactions
//    for all non-empty accounts (balance > 0). Perhaps,
//    flatMap method can help you to implement it.