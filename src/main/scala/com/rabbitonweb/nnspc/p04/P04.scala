package com.rabbitonweb.nnspc.p04

class P04[T] {
  final def length(list: List[T]): Int = {
    def sum(acc: Int, lt: List[T]): Int = lt match {
      case Nil => acc
      case head :: tail => sum(acc + 1, tail)
    }
    sum(0, list)
  }
}
