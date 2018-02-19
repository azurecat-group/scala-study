/**
  * Created by donghwankim on 2018. 1. 31..
  */

/*
scala> List(1, 2) ::: List(3, 4, 5)
res0: List[Int] = List(1, 2, 3, 4, 5)

scala> List() ::: List(1, 2, 3)
res1: List[Int] = List(1, 2, 3)

scala> List(1, 2, 3) ::: List(4)
res2: List[Int] = List(1, 2, 3, 4)
*/

/*
xs ::: ys ::: zs
*/

/*
xs ::: (ys ::: zs)
*/

/*
def append[T](xs: List[T], ys: List[T]): List[T]
*/

/*
def append[T](xs: List[T], ys: List[T]): List[T] =
  xs match {
    case List() => ys
    case x :: xs1 => x :: append(xs1, ys)
  }
*/

/*
scala> List(1, 2, 3).length
res3: Int = 3
*/

/*
scala> List().init
java.lang.UnsupportedOperationException: Nil.init
	at scala.List.init(List.scala:544)
	at ...

scala> List().last
java.util.NoSuchElementException: Nil.last
	at scala.List.last(List.scala:563)
	at ...
*/

/*
scala> abcde.reverse
res6: List[Char] = List(e, d, c, b, a)
*/

/*
scala> abcde
res7: List[Char] = List(a, b, c, d, e)
*/

/*
def rev[T](xs: List[T]): List[T] = xs match {
  case List() => xs
  case x :: xs1 => rev(xs1) ::: List(x)
*/

/*
scala> abcde take 2
res8: List[Char] = List(a, b)

scala> abcde drop 2
res9: List[Char] = List(c, d, e)

scala> abcde splitAt 2
res10: (List[Char], List[Char]) = (List(a, b),List(c, d, e))
*/

/*
scala> abcde apply 2 // 스칼라에서는 이렇게 사용하는 경우가 드물다.
res11: Char = c
*/

/*
scala> abcde(2)      // 스칼라에서는 이렇게 사용하는 경우가 드물다.
res12: Char = c
*/

/*
scala> abcde.indices
res13: scala.collection.immutable.Range =
    Range(0, 1, 2, 3, 4)
*/

/*
scala> List(List(1, 2), List(3), List(), List(4, 5)).flatten
res14: List[Int] = List(1, 2, 3, 4, 5)
scala> fruit.map(_.toCharArray).flatten
res15: List[Char] = List(a, p, p, l, e, s, o, r, a, n, g, e,
s, p, e, a, r, s)
*/

/*
scala> List(1, 2, 3).flatten
<console>:5: error: could not find implicit value for
parameter asTraversable: (Int) => Traversable[B]
       List(1, 2, 3).flatten
                     ^
*/

/*
scala> abcde.indices zip abcde
res17: scala.collection.immutable.IndexedSeq[(Int, Char)] =
    IndexedSeq((0,a), (1,b), (2,c), (3,d), (4,e))
*/

/*
scala> val zipped = abcde zip List(1, 2, 3)
zipped: List[(Char, Int)] = List((a,1), (b,2), (c,3))
*/

/*
scala> abcde.zipWithIndex
res18: List[(Char, Int)] = List((a,0), (b,1), (c,2), (d,3),
    (e,4))
*/

/*
scala> zipped.unzip
res19: (List[Char], List[Int]) =
    (List(a, b, c),List(1, 2, 3))
*/

/*
scala> abcde.toString
res20: String = List(a, b, c, d, e)
*/

/*
scala> abcde mkString ("[", ",", "]")
res21: String = [a,b,c,d,e]

scala> abcde mkString ""
res22: String = abcde

scala> abcde.mkString
res23: String = abcde

scala> abcde mkString ("List(", ", ", ")")
res24: String = List(a, b, c, d, e)
*/

/*
scala> val buf = new StringBuilder
buf: StringBuilder =

scala> abcde addString (buf, "(", ";", ")")
res25: StringBuilder = (a;b;c;d;e)
*/

/*
scala> val arr = abcde.toArray
arr: Array[Char] = Array(a, b, c, d, e)

scala> arr.toList
res26: List[Char] = List(a, b, c, d, e)
*/

/*
xs copyToArray (arr, start)
*/

/*
scala> val arr2 = new Array[Int](10)
arr2: Array[Int] = Array(0, 0, 0, 0, 0, 0, 0, 0, 0, 0)

scala> List(1, 2, 3) copyToArray (arr2, 3)

scala> arr2
res28: Array[Int] = Array(0, 0, 0, 1, 2, 3, 0, 0, 0, 0)
*/

/*
scala> val it = abcde.iterator
it: Iterator[Char] = non-empty iterator
*/

/*
scala> it.next
res29: Char = a

scala> it.next
res30: Char = b
*/

// 리스트 병합 정렬 함수
def msort[T](less: (T, T) => Boolean)
            (xs: List[T]): List[T] = {

  def merge(xs: List[T], ys: List[T]): List[T] =
    (xs, ys) match {
      case (Nil, _) => ys
      case (_, Nil) => xs
      case (x :: xs1, y :: ys1) =>
        if (less(x, y)) x :: merge(xs1, ys)
        else y :: merge(xs, ys1)
    }

  val n = xs.length / 2
  if (n == 0) xs
  else {
    val (ys, zs) = xs splitAt n
    merge(msort(less)(ys), msort(less)(zs))
  }
}

/*
scala> msort((x: Int, y: Int) => x < y)(List(5, 7, 1, 3))
res31: List[Int] = List(1, 3, 5, 7)
*/

/*
scala> val intSort = msort((x: Int, y: Int) => x < y) _
intSort: (List[Int]) => List[Int] = <function1>
*/

/*
scala> val reverseIntSort = msort((x: Int, y: Int) => x > y) _
reverseIntSort: (List[Int]) => List[Int] = <function>
*/

/*
scala> val mixedInts = List(4, 1, 9, 0, 5, 8, 3, 6, 2, 7)
mixedInts: List[Int] = List(4, 1, 9, 0, 5, 8, 3, 6, 2, 7)

scala> intSort(mixedInts)
res0: List[Int] = List(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)

scala> reverseIntSort(mixedInts)
res1: List[Int] = List(9, 8, 7, 6, 5, 4, 3, 2, 1, 0)
*/