package com.rabbitonweb.nnspc


import org.scalatest.{Matchers, FunSuite}

class P06Test extends FunSuite with Matchers {

  import com.rabbitonweb.nnspc.P06.isPalindrome

  test("that empty list is a palindrome") {
    isPalindrome(List()) should be(true)
  }

}
