package com.rabbitonweb.nnspc

/**
 * P07 (**) Flatten a nested list structure.
Example:
scala> flatten(List(List(1, 1), 2, List(3, List(5, 8))))
res0: List[Any] = List(1, 1, 2, 3, 5, 8)
 */
object P07 {
  def flatten(list: List[Any]): List[Any] = list match {
    case head :: tail if head.isInstanceOf[List[_]] => flatten(head.asInstanceOf[List[_]]) ++ flatten(tail)
    case head :: tail => head :: flatten(tail)
    case Nil => Nil
  }
}
