package stepic.nemchinovrp.one;

public class Account {
    private String number;
    private int balance;
    private State state;

    public Account() {
    }

    public Account(String number, int balance) {
        this.number = number;
        this.balance = balance;
    }

    public Account(String number, int balance, State state) {
        this.number = number;
        this.balance = balance;
        this.state = state;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Account{" +
                "number='" + number + '\'' +
                ", balance=" + balance +
                ", state='" + state + '\'' +
                '}';
    }
}
