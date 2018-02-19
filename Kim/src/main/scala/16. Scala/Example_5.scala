/**
  * Created by donghwankim on 2018. 1. 31..
  */

/*
scala> val List(a, b, c) = fruit
a: String = apples
b: String = oranges
c: String = pears
*/

/*
scala> val a :: b :: rest = fruit
a: String = apples
b: String = oranges
rest: List[String] = List(pears)
*/

/*
def isort(xs: List[Int]): List[Int] = xs match {
  case List()   => List()
  case x :: xs1 => insert(x, isort(xs1))
}

def insert(x: Int, xs: List[Int]): List[Int] = xs match {
  case List()  => List(x)
  case y :: ys => if (x <= y) x :: xs
                  else y :: insert(x, ys)
}
*/