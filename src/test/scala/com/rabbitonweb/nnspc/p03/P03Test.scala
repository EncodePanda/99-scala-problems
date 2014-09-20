package com.rabbitonweb.nnspc.p03

import org.scalatest.{FunSuite, Matchers}

class P03Test extends FunSuite with Matchers {
  val p03 = new P03[Int]()

  test("that returns nth element") {
    p03.nth(0, List(7, 6, 2, 3, 5, 8)) should be(Some(7))
  }

  test("that fails if nth bigger then size of the list") {
    p03.nth(30, List(7, 6, 2, 3, 5, 8)) should be(None)
  }

  test("that fails if nth smaller then 0") {
    p03.nth(-1, List(7, 6, 2, 3, 5, 8)) should be(None)
  }
}
