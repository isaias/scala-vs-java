package se.mejsla.scala.account;

import org.specs2.mutable._

class AccountBalanceCalculatorSpec extends Specification {

  val emptyFakeService = new AccountSummaryService {

    def customerSummaries = Seq()

  }

  "The balance calculator" should {

    "Throw an exception when no summary is found" in {
      val calculator = new AccountBalanceCalculator(emptyFakeService)

      calculator.balanceFor("nonexistant", "nonexistant") must throwA[RuntimeException]

    }

  }

}