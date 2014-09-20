package com.rabbitonweb.nnspc.p04

import org.scalatest.{FunSuite, Matchers}

class P04Test extends FunSuite with Matchers {

  val p04 = new P04[Int]

  test("that empty list is of length 0") {
    p04.length(List()) should equal(0)
  }

}
