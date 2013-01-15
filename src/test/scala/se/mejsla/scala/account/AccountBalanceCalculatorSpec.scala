package se.mejsla.scala.account;

import org.specs2.mutable._

class AccountBalanceCalculatorSpec extends Specification {

  "The balance calculator" should {

    import se.mejsla.scala.account

    "Return None when no summary is found" in {

      account.balanceFor(Seq())("nonexistant", "nonexistant") must beNone

    }

  }

}