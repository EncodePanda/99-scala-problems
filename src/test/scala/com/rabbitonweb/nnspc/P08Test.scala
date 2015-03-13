package com.rabbitonweb.nnspc

import org.scalatest.{Matchers, FunSuite}

class P08Test extends FunSuite with Matchers {

  val p08 = new P08[Char]

  test("that list without duplicates is returned untouched") {
    p08.flatten(List('a', 'b', 'a', 'c', 'b')) should equal(List('a', 'b', 'a', 'c', 'b'))
  }
}
