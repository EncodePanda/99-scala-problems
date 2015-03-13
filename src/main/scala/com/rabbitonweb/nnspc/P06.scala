package com.rabbitonweb.nnspc

/**
 * Find out whether a list is a palindrome.
Example:
scala> isPalindrome(List(1, 2, 3, 2, 1))
res0: Boolean = true
 */
class P06[T] {
  def isPalindrome(list: List[T]): Boolean = list match {
    case Nil => true
    case head :: Nil => true
    case e1 :: e2 :: Nil => e1 == e2
  }
}
