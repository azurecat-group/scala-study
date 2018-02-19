/**
  * Created by donghwankim on 2018. 2. 19..
  */

/*
scala> List(1, 2, 3)
res41: List[Int] = List(1, 2, 3)

scala> Set('a', 'b', 'c')
res42: scala.collection.immutable.Set[Char] = Set(a, b, c)

scala> import scala.collection.mutable
import scala.collection.mutable


scala> mutable.Map("hi" -> 2, "there" -> 5)
res43: scala.collection.mutable.Map[java.lang.String,Int] =
  Map(hi -> 2, there -> 5)

scala> Array(1.0, 2.0, 3.0)
res44: Array[Double] = Array(1.0, 2.0, 3.0)
*/

/*
scala> import scala.collection.mutable
import scala.collection.mutable

scala> val stuff = mutable.Set(42)
stuff: scala.collection.mutable.Set[Int] = Set(42)

scala> stuff += "abracadabra"
<console>:15: error: type mismatch;
 found   : java.lang.String("abracadabra")
 required: Int
       stuff += "abracadabra"
                ^
*/

/*
scala> val stuff = mutable.Set[Any](42)
stuff: scala.collection.mutable.Set[Any] = Set(42)
*/

/*
scala> val colors = List("blue", "yellow", "red", "green")
colors: List[java.lang.String]
  = List(blue, yellow, red, green)
*/

/*
scala> import scala.collection.immutable.TreeSet
import scala.collection.immutable.TreeSet

scala> val treeSet = TreeSet(colors)
<console>:15: error: could not find implicit value for
parameter ord: Ordering[List[java.lang.String]]
       val treeSet = TreeSet(colors)
                            ^
*/

/*
scala> val treeSet = TreeSet[String]() ++ colors
treeSet: scala.collection.immutable.TreeSet[String]
  = TreeSet(blue, green, red, yellow)
*/

/*
scala> treeSet.toList
res50: List[String] = List(blue, green, red, yellow)
*/

/*
scala> treeSet.toArray
res51: Array[String] = Array(blue, green, red, yellow)
*/

/*
scala> import scala.collection.mutable
import scala.collection.mutable

scala> treeSet
res52: scala.collection.immutable.TreeSet[String] =
  TreeSet(blue, green, red, yellow)

scala> val mutaSet = mutable.Set.empty ++= treeSet
mutaSet: scala.collection.mutable.Set[String] =
  Set(yellow, blue, red, green)

scala> val immutaSet = Set.empty ++ mutaSet
immutaSet: scala.collection.immutable.Set[String] =
  Set(yellow, blue, red, green)
*/

/*
scala> val muta = mutable.Map("i" -> 1, "ii" -> 2)
muta: scala.collection.mutable.Map[java.lang.String,Int] =
  Map(ii -> 2, i -> 1)

scala> val immu = Map.empty ++ muta
immu: scala.collection.immutable.Map[java.lang.String,Int] =
  Map(ii -> 2, i -> 1)

*/