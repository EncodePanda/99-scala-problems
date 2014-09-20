package com.rabbitonweb.nnspc.p03

import org.scalatest.{FunSuite, Matchers}

class P03Test extends FunSuite with Matchers {
  val p03 = new P03[Int]()

  test("that returns nth element") {
    p03.nth(0, List(7, 6, 2, 3, 5, 8)) should be(7)
  }
}
