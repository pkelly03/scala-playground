package com.euler

import org.scalatest.{Matchers, WordSpec}

class Problem1Spec extends WordSpec with Matchers {
  "Exercise 1" should {
    "Calculate sum of ..." in {
      Problem1.solve should equal(233168)
    }
  }
}
