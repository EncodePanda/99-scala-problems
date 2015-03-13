package com.rabbitonweb.nnspc

import org.scalatest.{FunSuite, Matchers}

class P01Test extends FunSuite with Matchers {

  val p01 = new P01[Int]()

  test("that returns element for single element's list") {
    p01.last(List(3)) should equal(Some(3))
  }

  test("that returns none for empty list") {
    p01.last(List()) should be(None)
  }

  test("that returns last element of list") {
    p01.last(List(1, 1, 2, 3, 5, 8)) should be(Some(8))
  }
}
