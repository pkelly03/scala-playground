def last[A](list: List[A]): A =
  list.foldLeft[A](list.head)((_, c) => c)

println(last(List(1,2,3,4)))

def penultimate[A](list: List[A]): (A,A) =
  list.foldLeft( (list.head, list.tail.head) )((r, c) => {
    println("r " + r)
    println("c " + c)
    (r._2, c)
  } )

println(penultimate(List(1,2,3,4)))
