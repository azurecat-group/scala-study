/**
  * Created by donghwankim on 2018. 2. 19..
  */

/*
object Color extends Enumeration {
  val Red = Value
  val Green = Value
  val Blue = Value
}
*/

/*
object Color extends Enumeration {
  val Red, Green, Blue = Value
}
*/

/*
import Color._
*/

/*
object Direction extends Enumeration {
  val North, East, South, West = Value
}
*/

/*
object Direction extends Enumeration {
  val North = Value("North")
  val East = Value("East")
  val South = Value("South")
  val West = Value("West")
}
*/

/*
scala> for (d <- Direction.values) print(d +" ")
North East South West
*/

/*
scala> Direction.East.id
res14: Int = 1
*/

/*
scala> Direction(1)
res15: Direction.Value = East
*/