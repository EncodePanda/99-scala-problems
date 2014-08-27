package com.rabbitonweb.nnspc.p02

import org.scalatest.{FunSuite, Matchers}

class P02Test extends FunSuite with Matchers {

  val p02 = new P02[Int]()

  test("that returns none for empty list") {
    p02.penultimate(List()) should be(None)
  }

  test("that returns none for one-element list") {
    p02.penultimate(List(5)) should be(None)
  }

  test("that returns first element of two-elements list") {
    p02.penultimate(List(5, 7)) should be(Some(5))
  }
}
