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