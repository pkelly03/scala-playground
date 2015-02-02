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
      val palindromeList = List(1,2,3,2,1)
      val nonPalindromeList = List(1,2,3,4,5)
      Problem6.sol1_tailRecursive(palindromeList) should be(true)
      Problem6.sol2_predefined(palindromeList) should be(true)
      Problem6.sol1_tailRecursive(nonPalindromeList) should be(false)
      Problem6.sol2_predefined(nonPalindromeList) should be(false)
    }
  }
}
