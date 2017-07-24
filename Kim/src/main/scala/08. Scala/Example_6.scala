/**
  * Created by donghwankim on 2017. 7. 9..
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

someNumbers.filter((x) => x > 0)
/*
scala> someNumbers.filter((x) => x > 0)
res5: List[Int] = List(5, 10)
 */

someNumbers.filter(x => x > 0)
/*
scala> someNumbers.filter(x => x > 0)
res5: List[Int] = List(5, 10)
 */