package com.rabbitonweb.nnspc

import scala.annotation.tailrec

class P03[T] {

  @tailrec
  final def nth(n: Int, list: List[T]): Option[T] = (n, list) match {
    case (0, head :: tail) => Some(head)
    case (_, Nil) => None
    case (x, _) if x < 0 => None
    case (x, head :: tail) => nth(x - 1, tail)
  }
}
