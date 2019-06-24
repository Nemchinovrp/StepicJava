package stepic.nemchinovrp.collectors;


import java.util.Objects;

public class Account {
    private String name;
    private Long balance;
    private State state;

    public Account() {
    }

    public Account(String name, Long balance, State state) {
        this.name = name;
        this.balance = balance;
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getBalance() {
        return balance;
    }

    public void setBalance(Long balance) {
        this.balance = balance;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(name, account.name) &&
                Objects.equals(balance, account.balance) &&
                state == account.state;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, balance, state);
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                ", state=" + state +
                '}';
    }
}
