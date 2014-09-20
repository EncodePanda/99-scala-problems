package com.rabbitonweb.nnspc.p03

class P03[T] {
  def nth(n: Int, list: List[T]): Option[T] = (n, list) match {
    case (0, head :: tail) => Some(head)
    case (_, Nil) => None
    case (x, head :: tail) => if (x < 0) None else nth(x - 1, tail)
  }
}
