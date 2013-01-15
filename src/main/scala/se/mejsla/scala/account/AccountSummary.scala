package se.mejsla.scala

/*
 * One version of a more idiomatic counterpart of the se.mejsla.java.account classes. Note that they could be put in separate files just
 * like the Java versions but since it is so little code they are in the same file which is legal in Scala
 */
package object account {


  /**
   * Contains the name and balance of one account.
   */
  case class AccountSummary(name: String, balance: Int)

  /**
   * Contains customer name and all the account summaries for one customer
   */
  case class CustomerSummary(name: String, accountSummaries: Seq[AccountSummary])

  /**
   * @return The balance of the given customer and account or None if the account or user does not exist
   */
  def balanceFor(customerSummaries: => Seq[CustomerSummary])(customerName: String, accountName: String): Option[Int] =
    customerSummaries.find(_.name == customerName).flatMap { customerSummary =>
      customerSummary.accountSummaries.find(_.name == accountName).map(_.balance)
    }

}




