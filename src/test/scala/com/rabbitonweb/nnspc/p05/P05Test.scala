package com.rabbitonweb.nnspc.p05

import org.scalatest.{FunSuite, Matchers}

class P05Test extends FunSuite with Matchers {

  val p05 = new P05[Int]

  test("that empty list should be reversed to itself") {
    p05.reverse(List()) should equal(List())
  }

  test("that one-element list should be reversed to itself") {
    p05.reverse(List(1)) should equal(List(1))
  }

  test("that two-elements list should switch elements when reversed") {
    p05.reverse(List(1, 2)) should equal(List(2, 1))
  }
}
