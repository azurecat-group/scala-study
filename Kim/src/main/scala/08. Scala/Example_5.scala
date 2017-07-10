/**
  * Created by donghwankim on 2017. 7. 9..
  */

var increase = (x: Int) => x + 1
increase(10)
/*
scala> val increase = (x: Int) => x + 1
increase: (Int) => Int = <function1>

scala> increase(10)
res0: Int = 11
 */

increase = (x: Int) => x + 9999
increase(10)
/*
scala> increase = (x: Int) => x + 9999
increase: (Int) => Int = <function1>

scala> increase(10)
res1: Int = 10009
 */

increase = (x: Int) => {
  println("we")
  println("are")
  println("here")
  x + 1
}
increase(10)
/*
scala> increase = (x: Int) => {
  println("we")
  println("are")
  println("here")
  x + 1
}
increase: (Int) => Int = <function1>

scala> increase(10)
we
are
here!
res2: Int = 11
 */

val someNumbers = List(-11, -10, -5, 0, 5, 10)
someNumbers.foreach((x: Int) => println(x))
/*
scala> val someNumbers = List(-11, -10, -5, 0, 5, 10)
someNumers: List[Int] = List(-11, -10, -5, 0, 5, 10)

scala> someNumbers.foreach((x: Int) => println(x))
-11
-10
-5
0
5
10
 */

someNumbers.filter((x: Int) => x > 0)
/*
scala> someNumbers.filter((x: Int) => x > 0)
res4: List[Int] = List(5, 10)
 */