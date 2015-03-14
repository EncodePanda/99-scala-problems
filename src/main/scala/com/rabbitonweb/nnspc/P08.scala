package com.rabbitonweb.nnspc

/**
P08 (**) Eliminate consecutive duplicates of list elements.
If a list contains repeated elements they should be replaced with a single copy of the element.
The order of the elements should not be changed.
Example:

scala> compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
res0: List[Symbol] = List('a, 'b, 'c, 'a, 'd, 'e)
  */
class P08[T] {
  def compress(list: List[T]): List[T] = list match {
    case e1 :: e2 :: tail if e1 == e2 => compress(e1 :: tail)
    case e1 :: tail => e1 :: compress(tail)
    case Nil => Nil
  }
}
