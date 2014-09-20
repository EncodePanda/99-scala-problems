package com.rabbitonweb.nnspc.p04

import scala.annotation.tailrec

class P04[T] {

  final def length(list: List[T]): Int = {
    @tailrec
    def sum(acc: Int, lt: List[T]): Int = lt match {
      case Nil => acc
      case head :: tail => sum(acc + 1, tail)
    }
    sum(0, list)
  }
}
