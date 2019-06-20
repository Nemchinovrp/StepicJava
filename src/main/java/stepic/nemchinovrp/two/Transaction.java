package stepic.nemchinovrp.two;

import java.util.Date;

public class Transaction {
    private String uuid;
    private State state;
    private Long sum;
    private Date created;

    public Transaction() {
    }

    public Transaction(String uuid, State state, Long sum, Date created) {
        this.uuid = uuid;
        this.state = state;
        this.sum = sum;
        this.created = created;
    }

    public String getUuid() {
        return uuid;
    }

    public State getState() {
        return state;
    }

    public Long getSum() {
        return sum;
    }

    public Date getCreated() {
        return created;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "uuid='" + uuid + '\'' +
                ", state=" + state +
                ", sum=" + sum +
                ", created=" + created +
                '}';
    }
}
