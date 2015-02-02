package com.ninetynineproblems

import org.scalatest.{Matchers, WordSpec}

/*
 http://aperiodic.net/phil/scala/s-99/

Flatten a nested list structure.
Example:
scala> flatten(List(List(1, 1), 2, List(3, List(5, 8))))
res0: List[Any] = List(1, 1, 2, 3, 5, 8)

*/

class Problem7Spec extends WordSpec with Matchers {
  "Exercise 7" should {
    "Flatten a nested list structure" in {
      Problem7.flatten(List(List(1, 1), 2, List(3, List(5, 8)))) should equal(List(1,1,2,3,5,8))
    }
  }
}
