package com.designpatterns

object CakePattern extends App {
  // example didn't work
  Env.welcome
}

trait Context

// Where the dependency injection occurs
trait MyContext extends Context {
  this: Config =>
  def welcome = this.text
}

trait Config {
  load
  def load: Unit
  val text: String
}

case class InMemoryConfig() extends Config {
  val text = "Hello"
  def load = println("load : " + text)
}

object Env extends InMemoryConfig with MyContext
