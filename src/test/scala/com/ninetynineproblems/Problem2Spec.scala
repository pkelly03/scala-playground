package com.ninetynineproblems

import org.scalatest.{Matchers, WordSpec}

/*
 http://aperiodic.net/phil/scala/s-99/

Find the last but one element of a list.
Example:
  scala> penultimate(List(1, 1, 2, 3, 5, 8))
  res0: Int = 5
*/

class Problem2Spec extends WordSpec with Matchers {
  "Exercise 2" should {
    "Find the second last elememt in a list" in {
      val l = List(1, 1, 2, 3, 5, 8)
      Problem2.sol1_tailRecursive(l) should equal(5)
      Problem2.sol2_chainedCalls(l) should equal(5)
    }
  }
}
