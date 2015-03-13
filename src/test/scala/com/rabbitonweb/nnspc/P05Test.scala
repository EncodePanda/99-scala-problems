package com.rabbitonweb.nnspc

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

  test("that list should be reversed") {
    p05.reverse(List(1, 2, 3, 4, 5, 6)) should equal(List(6, 5, 4, 3, 2, 1))
  }
}
