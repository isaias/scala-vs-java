package se.mejsla.java.account;

import java.util.List;

/**
 * Contains customer name and all the account summaries for one customer
 */
public class CustomerSummary {

    private String name;

    private List<AccountSummary> accountSummaries;

    public CustomerSummary(String name, List<AccountSummary> accountSummaries) {
        this.name = name;
        this.accountSummaries = accountSummaries;
    }

    public String getName() {
        return name;
    }

    public List<AccountSummary> getAccountSummaries() {
        return accountSummaries;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAccountSummaries(List<AccountSummary> accountSummaries) {
        this.accountSummaries = accountSummaries;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CustomerSummary that = (CustomerSummary) o;

        if (accountSummaries != null ? !accountSummaries.equals(that.accountSummaries) : that.accountSummaries != null)
            return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (accountSummaries != null ? accountSummaries.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" + name + ", " + accountSummaries + ")";
    }
}