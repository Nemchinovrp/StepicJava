package stepic.nemchinovrp.two;

import java.util.List;

public class AccountTask {
    private String number;
    private Long balance;
    private List<Transaction> transactions;

    public AccountTask() {
    }

    public AccountTask(String number, Long balance, List<Transaction> transactions) {
        this.number = number;
        this.balance = balance;
        this.transactions = transactions;
    }

    public String getNumber() {
        return number;
    }

    public Long getBalance() {
        return balance;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    @Override
    public String toString() {
        return "AccountTask{" +
                "number='" + number + '\'' +
                ", balance=" + balance +
                ", transactions=" + transactions +
                '}';
    }
}
