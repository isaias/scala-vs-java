package se.mejsla.java.account;

import java.util.List;

/**
 * Service API to access account summaries
 */
public interface AccountSummaryService {

    /**
     * @return All account summaries for all users of the system
     */
    public List<CustomerSummary> getCustomerSummaries();

}