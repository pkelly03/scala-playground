package com.ninetynineproblems

import org.scalatest.{Matchers, WordSpec}

/*
 http://aperiodic.net/phil/scala/s-99/

 Find the Kth element of a list.
  By convention, the first element in the list is element 0.
  Example:

  scala> nth(2, List(1, 1, 2, 3, 5, 8))
res0: Int = 2
*/

class Problem3Spec extends WordSpec with Matchers {
  "Exercise 3" should {
    "Find the Kth element of a list" in {
      val l = List(1, 1, 2, 3, 5, 8)
      Problem3.sol1_tailRecursive(2, l) should equal(2)
      Problem3.sol2_predefined(2, l) should equal(2)
    }
  }
}
