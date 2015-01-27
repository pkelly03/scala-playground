package com.ninetynineproblems

import org.scalatest.{Matchers, WordSpec}

/*
 http://aperiodic.net/phil/scala/s-99/

 Find the number of elements of a list.
  Example:
  scala> length(List(1, 1, 2, 3, 5, 8))
  res0: Int = 6

*/

class Problem4Spec extends WordSpec with Matchers {
  "Exercise 4" should {
    "Find the number of elements of a list" in {
      val l = List(1, 1, 2, 3, 5, 8)
      Problem4.sol1_tailRecursive(l) should equal(6)
      Problem4.sol2_predefined(l) should equal(6)
      Problem4.sol3_fold(l) should equal(6)
    }
  }
}
