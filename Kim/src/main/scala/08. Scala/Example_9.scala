/**
  * Created by donghwankim on 2017. 7. 9..
  */

/*
scala> (x: Int) => x + more
<console>:5: error: not found: value more
        (x: Int) => x + more
 */

var more = 1
val addMore = (x: Int) => x + more
addMore(10)
/*
scala> var more = 1
more: Int = 1

scala> val addMore = (x: Int) => x + more
addMore: (Int) => Int = <function1>

addMore(10)
res17: Int = 11
 */

more = 9999
addMore(10)
/*
scala> more = 9999
more: Int = 9999

scala> addMore(10)
res18: Int = 10009
 */

val someNumbers = List(-11, -10, -5, 0, 5, 10)
var sum = 0
someNumbers.foreach(sum += _)
/*
scala> val someNumbers = List(-11, -10, -5, 0, 5, 10)
someNumbers: List[Int] = List(-11, -10, -5, 0, 5, 10)

scala> var sum = 0
sum: Int = 0

scala> someNumbers.foreach(sum += _)

scala> sum
res20: Int = -11
 */

def makeIncreaser(more: Int) = (x: Int) => x + more

val inc1 = makeIncreaser(1)
val inc9999 = makeIncreaser(9999)
/*
scala> val inc1 = makeIncreaser(1)
inc1: (Int) => Int = <function1>

scala> val inc9999 = makeIncreaser(9999)
inc9999: (Int) => Int = <function1>
 */

inc1(10)
inc9999(10)
/*
scala> inc1(10)
res21: Int = 11

scala> inc9999(10)
res22: Int = 10009
 */