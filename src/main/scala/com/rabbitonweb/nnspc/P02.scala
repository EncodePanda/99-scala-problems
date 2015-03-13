package com.rabbitonweb.nnspc

import scala.annotation.tailrec

class P02[T] {

  @tailrec
  final def penultimate(list: List[T]): Option[T] = list match {
    case Nil => None
    case head :: Nil => None
    case lastButOne :: last :: Nil => Some(lastButOne)
    case head :: tail => penultimate(tail)
  }
}
