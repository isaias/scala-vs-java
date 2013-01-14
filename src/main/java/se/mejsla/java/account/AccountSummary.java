package se.mejsla.java.account;

/**
 * Contains the name and balance of one account.
 */
public class AccountSummary {

    private String name;

    private int balance;

    public AccountSummary(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AccountSummary that = (AccountSummary) o;

        if (balance != that.balance) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + balance;
        return result;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" + name + "," + balance + ")";
    }
}