package com.rabbitonweb.nnspc

import org.scalatest.{Matchers, FunSuite}

class P10Test extends FunSuite with Matchers {

  val p10 = new P10[Char]

  test("that run-length encoding works") {
    val init = List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')
    p10.encode(init) should equal(List((4, 'a'), (1, 'b'), (2, 'c'), (2, 'a'), (1, 'd'), (4, 'e')))
  }
}
