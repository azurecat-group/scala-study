/**
  * Created by donghwankim on 2017. 11. 18..
  */

final def ==(that: Any): Boolean
final def !=(that: Any): Boolean
def equals(that: Any): Boolean
def ##: Int
def hashCode: Int
def toString: String

/*
scala> new Int
<console>:5: error: class Int is abstract; cannot be
instantiated
        new Int
        ^
 */

/*
scala> 42.toString
res1: java.lang.String = 42

scala> 42.hashCode
res2: Int = 42

scala> 42 equals 42
res3: Boolean = true
 */

/*
scala> 42 max 43
res4: Int = 43

scala> 42 min 43
res5: Int = 42

scala> 1 untill 5
res6: Range = Range(1, 2, 3, 4)

scala> 1 to 5
res7: Range.Inclusive = Range(1, 2, 3, 4, 5)

scala> 3.abs
res8: Int = 3

scala> (-3).abs
res9: Int = 3
 */