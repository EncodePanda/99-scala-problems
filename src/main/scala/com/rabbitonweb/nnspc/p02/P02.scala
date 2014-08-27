package com.rabbitonweb.nnspc.p02

class P02[T] {
  def penultimate(list: List[T]): Option[T] = list match {
    case Nil => None
    case head :: Nil => None
    case lastButOne :: last :: Nil => Some(lastButOne)
    case head :: tail => penultimate(tail)
  }
}
