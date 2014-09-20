package com.rabbitonweb.nnspc.p03

class P03[T] {
  def nth(nth: Int, list: List[T]): Option[T] = if (nth < list.size) Some(list(nth)) else None
}
