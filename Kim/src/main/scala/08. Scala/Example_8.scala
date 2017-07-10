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

someNumbers.foreach(println _) // someNumbers.foreach(x => println(x)) 와 동일하게 간주함.

def sum(a: Int, b: Int, c: Int) = a + b + c
/*
scala> def sum(a: Int, b: Int, c: Int) = a + b + c
sum: (a: Int,b: Int,c: Int)Int
 */

sum(1, 2, 3)
/*
scala> sum(1, 2, 3)
res10: Int = 6
 */

val a = sum _
/*
scala> val a = sum _
a: (Int, Int, Int) => Int = <function3>
 */

a(1, 2, 3)
/*
scala> a(1, 2, 3)
res11: Int = 6
 */

a.apply(1, 2 ,3)
/*
scala> a.apply(1, 2, 3)
res12: Int = 6
 */

val b = sum(1, _: Int, 3)
b(2)
b(5)
/*
scalaL> val b = sum(1, _: Int, 3)
b: (Int) => Int = <functional1>

scala> b(2)
res13: Int = 6
scala> b(5)
res14: Int = 9
 */

someNumbers.foreach(println) // someNumbers.foreach(println _) 사용하는 대신 해당과 같이 작성 가능

/* _을 생략할 수 있는 경우는 foreach처럼 함수가 필요한 시점 뿐입니다.
scala> val c = sum
<console>:5: error: missing arguments for method sum...
follow this method with `_' if you want to treat it as a
partially applied function
        val c = sum
                ^
*/

val d = sum _
d(10, 20, 30)
/*
scala> val d = sum _
d: (Int, Int, Int) => Int = <function3>

scala> d(10, 20, 30)
res15: Int = 60
 */

