package com.ninetynineproblems

object Problem5 {

  def sol1_tailRecursive[T](list: List[T]): List[T] = {

    @annotation.tailrec
    def sol1_tail(reverseList: List[T], list: List[T]): List[T] = list match {
      case h :: t => sol1_tail(h :: reverseList, t)
      case _ => reverseList
    }
    sol1_tail(List(), list)
  }

//  // Using list api
  def sol2_predefined[T](list: List[T]): List[T] = list.reverse
//
  // using fold
//  def sol3_fold[T](list: List[T]): List[T] = list.foldLeft(List())((c, el) => el :: c)
}


