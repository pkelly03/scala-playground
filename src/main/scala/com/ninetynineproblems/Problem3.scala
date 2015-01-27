package com.ninetynineproblems

object Problem3 {


  // Tail recursion
  @annotation.tailrec
  def sol1_tailRecursive[T](idx: Int, list: List[T]): T = list match {
    case h :: t if (idx > 0) => sol1_tailRecursive(idx - 1, t)
    case h :: t if (idx == 0) => h
  }

  // Using list api
  def sol2_predefined[T](idx: Int, list: List[T]): T = list(idx)
}


