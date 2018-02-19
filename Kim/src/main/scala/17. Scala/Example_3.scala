/**
  * Created by donghwankim on 2018. 2. 19..
  */

/*
scala> val people = Set("Nancy", "Jane")
people: scala.collection.immutable.Set[java.lang.String] =
  Set(Nancy, Jane)

scala> people += "Bob"
<console>:11: error: reassignment to val
       people += "Bob"
*/

/*
scala> var people = Set("Nancy", "Jane")
people: scala.collection.immutable.Set[java.lang.String] =
  Set(Nancy, Jane)

scala> people += "Bob"

scala> people
res34: scala.collection.immutable.Set[java.lang.String] =
  Set(Nancy, Jane, Bob)
*/

/*
scala> people -= "Jane"

scala> people ++= List("Tom", "Harry")

scala> people
res37: scala.collection.immutable.Set[java.lang.String] =
  Set(Nancy, Bob, Tom, Harry)
*/

/*
  var capital = Map("US" -> "Washington", "France" -> "Paris")
  capital += ("Japan" -> "Tokyo")
  println(capital("France"))
*/

/*
import scala.collection.mutable.Map  // 이 부분만 바꾸면 충분함!
var capital = Map("US" -> "Washington", "France" -> "Paris")
capital += ("Japan" -> "Tokyo")
println(capital("France"))
*/

/*
scala> var roughlyPi = 3.0
roughlyPi: Double = 3.0

scala> roughlyPi += 0.1

scala> roughlyPi += 0.04

scala> roughlyPi
res40: Double = 3.14
*/