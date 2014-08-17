package com.rabbitonweb.nnspc.p01

class P01[T] {
  def last(list: List[T]): Option[T] = list match {
    case Nil => None
    case _ => Some(list(0))
  }
}
