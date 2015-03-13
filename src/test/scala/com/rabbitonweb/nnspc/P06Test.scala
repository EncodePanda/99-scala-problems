package com.rabbitonweb.nnspc


import org.scalatest.{Matchers, FunSuite}

class P06Test extends FunSuite with Matchers {

  val p06 = new P06[Int]()

  test("that empty list is a palindrome") {
    p06.isPalindrome(List()) should be(true)
  }

  test("that one element list is a palindrome") {
    p06.isPalindrome(List(1)) should be(true)
  }

  test("that list with two exact elements is a palindrome") {
    p06.isPalindrome(List(1, 1)) should be(true)
  }

  test("that list with two different elements is NOT a palindrome") {
    p06.isPalindrome(List(1, 2)) should be(false)
  }

  test("that 1-2-1 is a palindrome") {
    p06.isPalindrome(List(1, 2, 1)) should be(true)
  }

  test("that example from problem definition works") {
    p06.isPalindrome(List(1, 2, 3, 2, 1)) should be(true)
  }

  test("that example from problem slightly modified will not work") {
    p06.isPalindrome(List(1, 2, 3, 1, 1)) should be(false)
  }
}
