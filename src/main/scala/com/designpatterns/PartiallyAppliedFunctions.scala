package com.designpatterns

object PartiallyAppliedFunctions extends App {

  var sum = (a: Int, b: Int, c: Int) => a + b + c
  println(sum(1,2,3))

  var partialSum = sum(1, _: Int, 4)
  println(partialSum(2))

}
