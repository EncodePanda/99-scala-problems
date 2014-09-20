package com.rabbitonweb.nnspc.p05

import org.scalatest.{FunSuite, Matchers}

class P05Test extends FunSuite with Matchers {

  val p05 = new P05[Int]

  test("that empty list should be reversed to itself") {
    p05.reverse(List()) should equal(List())
  }

}
