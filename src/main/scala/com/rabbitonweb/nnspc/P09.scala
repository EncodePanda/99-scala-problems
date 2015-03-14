package com.rabbitonweb.nnspc

/**
P09 (**) Pack consecutive duplicates of list elements into sublists.
If a list contains repeated elements they should be placed in separate sublists.
Example:

scala> pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
res0: List[List[Symbol]] =
List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))
  */
class P09[T] {
  def pack(list: List[T]): List[List[T]] = {

    def packInner(acc: List[T], l: List[T]): List[List[T]] = l match {
      case e :: tail if acc.isEmpty => packInner(List(e), tail)
      case e :: tail if e == acc.head => packInner(e :: acc, tail)
      case e :: tail if e != acc.head => acc :: packInner(List(e), tail)
      case Nil => List(acc)
    }

    packInner(List(), list)
  }
}
