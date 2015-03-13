package com.rabbitonweb.nnspc

import org.scalatest.{FunSuite, Matchers}

class P04Test extends FunSuite with Matchers {

  val p04 = new P04[Int]

  test("that empty list is of length 0") {
    p04.length(List()) should equal(0)
  }

  test("that one-element list is of length 1") {
    p04.length(List(1)) should equal(1)
  }

  test("that returns the list length") {
    p04.length(List(1, 3, 7, 9, 0)) should equal(5)
  }

}
