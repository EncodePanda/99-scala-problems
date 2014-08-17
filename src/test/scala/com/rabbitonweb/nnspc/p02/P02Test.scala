package com.rabbitonweb.nnspc.p02

import org.scalatest.{FunSuite, Matchers}

class P02Test extends FunSuite with Matchers {

  val p02 = new P02[Int]()

  test("that returns none for empty list") {
    p02.penultimate(List()) should be(None)
  }

}
