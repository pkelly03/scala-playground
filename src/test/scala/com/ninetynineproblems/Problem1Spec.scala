package com.ninetynineproblems

import org.scalatest.{Matchers, WordSpec}

/*
 http://aperiodic.net/phil/scala/s-99/

 Find the last element of a list.
  scala> last(List(1, 1, 2, 3, 5, 8))
*/

class Problem1Spec extends WordSpec with Matchers {
  "Exercise 1" should {
    "Determine last elememt in a list" in {
      val l = List(1, 1, 2, 3, 5, 8)
      Problem1.sol1_predefined(l) should equal(8)
      Problem1.sol2_tailRecursive(l) should equal(8)
      Problem1.sol3_chainedCalls(l) should equal(8)
      Problem1.sol4_haskellLikeComposition(l) should equal(8)
      Problem1.sol5_reversedFunctionComposition(l) should equal(8)
    }
  }
}
