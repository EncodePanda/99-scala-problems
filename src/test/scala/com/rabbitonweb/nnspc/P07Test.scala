package com.rabbitonweb.nnspc

import org.scalatest.{Matchers, FunSuite}

class P07Test extends FunSuite with Matchers {

  test("that already flattened list is returned untouched") {
    P07.flatten(List(1, 2, 3, 4)) should equal(List(1, 2, 3, 4))
  }

  test("that nested list is flattened") {
    P07.flatten(List(List(1, 1), 2, List(3, List(5, 8)))) should equal(List(1, 1, 2, 3, 5, 8))
  }
}
