package com.designpatterns

object Currying extends App {

  def sum(a: Int)(b: Int): Int = {
    a + b
  }

  val x = sum(3)(2)
  val y = sum(3) _
  println(s"x : ${x}")
  println(s"y : ${y(10)}")

  def curryEx2(age: Int) (f: String => Unit) = {
    val toPrint = s"My age is ${age}"
    f(toPrint)
  }

  val ageMessage = curryEx2(33) _

  ageMessage { println(_) }
  ageMessage { anyVar => println(anyVar) }

}
