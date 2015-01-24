package com.designpatterns

object LazyParamEvaluation extends App {

  object Evaluation {
    def lazyEvaluation(x: => String) = {
      println(x)
    }

  }

  Evaluation.lazyEvaluation("X")
}
