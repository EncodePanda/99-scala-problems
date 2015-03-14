package com.rabbitonweb.nnspc

import org.scalatest.{Matchers, FunSuite}

class P11Test extends FunSuite with Matchers {

  val p11 = new P11[Char]

  test("that run-length encoding works") {
    val init = List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')
    p11.encode(init) should equal(List((4, 'a'), 'b', (2, 'c'), (2, 'a'), 'd', (4, 'e')))
  }
}