package com.ninetynineproblems

import org.scalatest.{Matchers, WordSpec}

/*
 http://aperiodic.net/phil/scala/s-99/

Find out whether a list is a palindrome.
Example:
scala> isPalindrome(List(1, 2, 3, 2, 1))
res0: Boolean = true


*/

class Problem6Spec extends WordSpec with Matchers {
  "Exercise 6" should {
    "Determine if a list is a palindrome" in {
      val l = List(1,1,2,3,5,8)
      Problem5.sol1_tailRecursive(l) should be(List(8,5,3,2,1,1))
      Problem5.sol2_predefined(l) should be(List(8,5,3,2,1,1))
      Problem5.sol3_fold(l) should be(List(8,5,3,2,1,1))
    }
  }
}
