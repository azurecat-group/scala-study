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

someNumbers.filter(_ > 0) // someNumbers.filter(x => x > 0) 와 같음
/*
scala> someNumbers.filter(_ > 0)
res7: List[Int] = List(5,10)
 */

/* 해당 경우 오류가 발생하는데 원인은 축약 형태로 표현할 수 있으려면 함수에 최대 한번만 등장해야함.
val f = _ + _
<console>:4: error: missing parameter type for expanded
function ((x$1, x$2) => x$1.$plus(x$2))
        val f = _ + _
 */

val f = (_: Int) + (_: Int)
f(5,10)
/*
scala> val f = (_: Int) + (_: Int)
f: (Int, Int) => Int = <function2>

scala> f(5, 10)
res9: Int = 15
 */