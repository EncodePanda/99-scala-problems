package com.rabbitonweb.nnspc.p05

class P05[T] {
  final def reverse(list: List[T]): List[T] = list match {
    case Nil => Nil
    case head :: Nil => List(head)
    case e1 :: e2 :: Nil => List(e2, e1)
  }
}
