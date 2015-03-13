package com.rabbitonweb.nnspc

/**
 * Find out whether a list is a palindrome.
Example:
scala> isPalindrome(List(1, 2, 3, 2, 1))
res0: Boolean = true
 */
class P06[T] {
  def isPalindrome(list: List[T]): Boolean = list == list.reverse
}
