package com.ninetynineproblems
  
object Problem1 {

  // Predefined function
  def sol1_predefined[T](list: List[T]): T = list.last

  // Tail recursion
  @annotation.tailrec
  def sol2_tailRecursive[T](list: List[T]): T = list match {
    case h :: Nil => h
    case _ :: t => sol2_tailRecursive(t)
    case _ => throw new NoSuchElementException("List is empty")
  }

  // Chained calls
  def sol3_chainedCalls[T](list: List[T]): T = list.reverse.head

  // Haskell-like function composition, point-free style (looks strange with Scala syntax and OO model)
  def sol4_haskellLikeComposition[T] = ((_: List[T]).head).compose((_: List[T]).reverse)

  // Reversed function composition
  def sol5_reversedFunctionComposition[T] = ((_: List[T]).reverse).andThen((_: List[T]).head)

  // Folding
  def sol6_folding[T](list: List[T]): T = if (list.nonEmpty) list.reduce((a, b) => b) else
    throw new NoSuchElementException("List is empty")  
}  

