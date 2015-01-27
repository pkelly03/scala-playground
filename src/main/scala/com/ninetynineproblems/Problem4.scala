package com.ninetynineproblems

object Problem4 {

  def sol1_tailRecursive[T](list: List[T]): Int = {

    @annotation.tailrec
    def sol1_tail(counter: Int, list: List[T]): Int = list match {
      case _ :: t => sol1_tail(counter + 1, t)
      case _ => counter
    }
    sol1_tail(0, list)
  }

  // Using list api
  def sol2_predefined[T](list: List[T]): Int = list.size

  // using fold
  def sol3_fold(list: List[Int]): Int = list.foldLeft(0)((c, _) => c + 1)
}


