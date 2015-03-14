package com.rabbitonweb.nnspc

import org.scalatest.{Matchers, FunSuite}

class P09Test extends FunSuite with Matchers {

  val p09 = new P09[Char]

  test("that list without duplicates is returned with elements packed within one-element lists") {
    p09.pack(List('a', 'b', 'a')) should equal(List(List('a'), List('b'), List('a')))
  }

  test("that compress consecutive duplicates") {
    val duplicates = List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')
    var packed = List(List('a', 'a', 'a', 'a'),
      List('b'),
      List('c', 'c'),
      List('a', 'a'),
      List('d'),
      List('e', 'e', 'e', 'e'))
    p09.pack(duplicates) should equal(packed)
  }
}