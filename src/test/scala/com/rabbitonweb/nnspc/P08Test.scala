package com.rabbitonweb.nnspc

import org.scalatest.{Matchers, FunSuite}

class P08Test extends FunSuite with Matchers {

  val p08 = new P08[Char]

  test("that list without duplicates is returned untouched") {
    p08.compress(List('a', 'b', 'a', 'c', 'b')) should equal(List('a', 'b', 'a', 'c', 'b'))
  }

  test("that compress consecutive duplicates") {
    val duplicates = List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')
    p08.compress(duplicates) should equal(List('a', 'b', 'c', 'a', 'd', 'e'))
  }
}
