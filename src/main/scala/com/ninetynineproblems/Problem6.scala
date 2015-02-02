package com.ninetynineproblems

object Problem6 {

  def sol1_tailRecursive[T](list: List[T]): Boolean = {

    @annotation.tailrec
    def sol1_tail(reverseList: List[T], list: List[T]): List[T] = list match {
      case h :: t => sol1_tail(h :: reverseList, t)
      case _ => reverseList
    }
    val reversedList = sol1_tail(List(), list)
    reversedList == list
  }

//  // Using list api
  def sol2_predefined[T](list: List[T]): Boolean = list.reverse == list
}


