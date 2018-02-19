/**
  * Created by donghwankim on 2018. 1. 31..
  */

// Predef 안에 있는 디폴트 맵과 집합 정의
object Predef {
  type Map[A, +B] = collection.immutable.Map[A, B]
  type Set[A] = collection.immutable.Set[A]
  val Map = collection.immutable.Map
  val Set = collection.immutable.Set
  // ...
}

/*
scala> import scala.collection.mutable
import scala.collection.mutable
*/

/*
scala> val mutaSet = mutable.Set(1, 2, 3)
mutaSet: scala.collection.mutable.Set[Int] = Set(3, 1, 2)
*/

/*
scala> val text = "See Spot run. Run, Spot. Run!"
text: java.lang.String = See Spot run. Run, Spot. Run!

scala> val wordsArray = text.split("[ !,.]+")
wordsArray: Array[java.lang.String]
   = Array(See, Spot, run, Run, Spot, Run)
*/

/*
scala>  val words = mutable.Set.empty[String]
words: scala.collection.mutable.Set[String] = Set()
*/

/*
scala> for (word <- wordsArray)
     |   words += word.toLowerCase

scala> words
res17: scala.collection.mutable.Set[String]
  = Set(spot, run, see)
*/

/*
scala> val map = mutable.Map.empty[String, Int]
map: scala.collection.mutable.Map[String,Int] = Map()
*/

/*
scala> val map = mutable.Map.empty[String, Int]
map: scala.collection.mutable.Map[String,Int] = Map()
*/

/*
scala> map("hello") = 1

scala> map("there") = 2

scala> map
res20: scala.collection.mutable.Map[String,Int] =
  Map(hello -> 1, there -> 2)
*/

/*
scala> map("hello")
res21: Int = 1
*/

/*
scala> def countWords(text: String) = {
     |   val counts = mutable.Map.empty[String, Int]
     |   for (rawWord <- text.split("[ ,!.]+")) {
     |     val word = rawWord.toLowerCase
     |     val oldCount =
     |       if (counts.contains(word)) counts(word)
     |       else 0
     |     counts += (word -> (oldCount + 1))
     |   }
     |   counts
     | }
countWords: (text:
String)scala.collection.mutable.Map[String,Int]

scala> countWords("See Spot run! Run, Spot. Run!")
res22: scala.collection.mutable.Map[String,Int]
  = Map(see -> 1, run -> 3, spot -> 2)
*/

/*
scala> import scala.collection.immutable.TreeSet
import scala.collection.immutable.TreeSet

scala> val ts = TreeSet(9, 3, 1, 8, 0, 2, 7, 4, 6, 5)
ts: scala.collection.immutable.TreeSet[Int]
  = TreeSet(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)

scala> val cs = TreeSet('f', 'u', 'n')
cs: scala.collection.immutable.TreeSet[Char]
  = TreeSet(f, n, u)
*/

/*
scala> import scala.collection.immutable.TreeMap
import scala.collection.immutable.TreeMap

scala> var tm = TreeMap(3 -> 'x', 1 -> 'x', 4 -> 'x')
tm: scala.collection.immutable.TreeMap[Int,Char]
  = Map(1 -> x, 3 -> x, 4 -> x)

scala> tm += (2 -> 'x')

scala> tm
res30: scala.collection.immutable.TreeMap[Int,Char]
  = Map(1 -> x, 2 -> x, 3 -> x, 4 -> x)
*/