package com.ninetynineproblems

object Problem2 {

  // Tail recursion
  @annotation.tailrec
  def sol2_tailRecursive[T](list: List[T]): T = list match {
    case h :: _ :: Nil => h
    case _ :: t => sol2_tailRecursive(t)
    case _ => throw new NoSuchElementException("List is empty")
  }

  // Chained calls
  def sol2_chainedCalls[T](list: List[T]): T = list.reverse.tail.head

  // Folding
  def sol3_folding[T](list: List[T]): T = list.reverse

