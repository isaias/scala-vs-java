package se.mejsla.java.account;

import org.junit.Test;
import se.mejsla.java.account.AccountBalanceCalculator;
import se.mejsla.java.account.AccountSummaryService;
import se.mejsla.java.account.CustomerSummary;

import java.lang.Override;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

class AccountBalanceCalculatorTest {

    private AccountSummaryService emptyFakeService = new AccountSummaryService() {
        @Override
        public List<CustomerSummary> getCustomerSummaries() {
            return Collections.emptyList();
        }
    };

    @Test(expected = RuntimeException.class)
    public void accountBalanceThrowsErrorIfAccountCannotBeFound() {

        AccountBalanceCalculator calculator = new AccountBalanceCalculator(emptyFakeService);
        calculator.balanceFor("nonexistant", "nonexistant");

    }


}