package se.mejsla.java.account;

public class AccountBalanceCalculator {

    private AccountSummaryService service;

    public AccountBalanceCalculator(AccountSummaryService service) {
        this.service = service;
    }

    /**
     * @return The balance of the given customer and account
     * @throws RuntimeException if the customer or account is unknown
     */
    public int balanceFor(String customerName, String accountName) {
        for (CustomerSummary customerSummary: service.getCustomerSummaries()) {
            if (customerName.equals(customerSummary.getName())) {
                for (AccountSummary accountSummary: customerSummary.getAccountSummaries()) {
                    if (accountName.equals(accountSummary.getName())) {
                        return accountSummary.getBalance();
                    }
                }
            }
        }
        throw new RuntimeException("Customer " + customerName + " or account " + accountName + " does not exist!");
    }

}