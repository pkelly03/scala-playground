package com.ninetynineproblems

import org.scalatest.{Matchers, WordSpec}

/*
 http://aperiodic.net/phil/scala/s-99/

 Reverse a list.
Example:
scala> reverse(List(1, 1, 2, 3, 5, 8))
res0: List[Int] = List(8, 5, 3, 2, 1, 1)


*/

class Problem5Spec extends WordSpec with Matchers {
  "Exercise 5" should {
    "Reverse a list" in {
      val l = List(1,1,2,3,5,8)
      Problem5.sol1_tailRecursive(l) should be(List(8,5,3,2,1,1))
      Problem5.sol2_predefined(l) should be(List(8,5,3,2,1,1))
      Problem5.sol3_fold(l) should be(List(8,5,3,2,1,1))
    }
  }
}
