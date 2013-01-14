package se.mejsla.scala.account

/*
 * Scala counterpart of the se.mejsla.java.account classes. Note that they could be put in separate files just
 * like the Java versions but since it is so little code they are in the same file which is legal in Scala
 */

/**
 * Contains the name and balance of one account.
 */
case class AccountSummary(name: String, balance: Int)

/**
 * Contains customer name and all the account summaries for one customer
 */
case class CustomerSummary(name: String, accountSummaries: Seq[AccountSummary])


/**
 * Service API to access account summaries
 */
trait AccountSummaryService {

  /**
   * @return All account summaries for all users of the system
   */
  def customerSummaries: Seq[CustomerSummary]

}



class AccountBalanceCalculator(service: AccountSummaryService) {

  /**
   * @return The balance of the given customer and account
   * @throws RuntimeException if the customer or account is unknown
   */
  def balanceFor(customerName: String, accountName: String): Int =
    service.customerSummaries.find(_.name == customerName).flatMap { customerSummary =>
      customerSummary.accountSummaries.find(_.name == accountName).map(_.balance)
    }.getOrElse {
      throw new RuntimeException("Customer " + customerName + " or account " + accountName + " does not exist!")
    }

}