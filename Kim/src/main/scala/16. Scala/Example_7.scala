/**
  * Created by donghwankim on 2018. 1. 31..
  */

/*
scala> List(1, 2, 3) map (_ + 1)
res32: List[Int] = List(2, 3, 4)

scala> val words = List("the", "quick", "brown", "fox")
words: List[java.lang.String] = List(the, quick, brown, fox)

scala> words map (_.length)
res33: List[Int] = List(3, 5, 5, 3)

scala> words map (_.toList.reverse.mkString)
res34: List[String] = List(eht, kciuq, nworb, xof)
*/

/*
scala> words map (_.toList)
res35: List[List[Char]] = List(List(t, h, e), List(q, u, i,
    c, k), List(b, r, o, w, n), List(f, o, x))

scala> words flatMap (_.toList)
res36: List[Char] = List(t, h, e, q, u, i, c, k, b, r, o, w,
    n, f, o, x)
*/

/*
scala> List.range(1, 5) flatMap (
     |   i => List.range(1, i) map (j => (i, j))
     | )
res37: List[(Int, Int)] = List((2,1), (3,1), (3,2), (4,1),
    (4,2), (4,3))
*/

/*
for (i <- List.range(1, 5); j <- List.range(1, i)) yield (i, j)
*/

/*
scala> var sum = 0
sum: Int = 0

scala> List(1, 2, 3, 4, 5) foreach (sum += _)

scala> sum
res39: Int = 15
*/

/*
scala> List(1, 2, 3, 4, 5) filter (_ % 2 == 0)
res40: List[Int] = List(2, 4)

scala> words filter (_.length == 3)
res41: List[java.lang.String] = List(the, fox)
*/

/*
scala> List(1, 2, 3, 4, 5) partition (_ % 2 == 0)
res42: (List[Int], List[Int]) = (List(2, 4),List(1, 3, 5))
*/

/*
scala>  List(1, 2, 3, 4, 5) find (_ % 2 == 0)
res43: Option[Int] = Some(2)

scala>  List(1, 2, 3, 4, 5) find (_ <= 0)
res44: Option[Int] = None
*/

/*
scala> List(1, 2, 3, -4, 5) takeWhile (_ > 0)
res45: List[Int] = List(1, 2, 3)

scala> words dropWhile (_ startsWith "t")
res46: List[java.lang.String] = List(quick, brown, fox)
*/

/*
scala> List(1, 2, 3, -4, 5) span (_ > 0)
res47: (List[Int], List[Int]) = (List(1, 2, 3),List(-4, 5))
*/

/*
scala> def hasZeroRow(m: List[List[Int]]) =
     |   m exists (row => row forall (_ == 0))
hasZeroRow: (m: List[List[Int]])Boolean

scala> hasZeroRow(diag3)
res48: Boolean = false
*/

/*
scala> def sum(xs: List[Int]): Int = (0 /: xs) (_ + _)
sum: (xs: List[Int])Int
*/

/*
scala> def product(xs: List[Int]): Int = (1 /: xs) (_ * _)
product: (xs: List[Int])Int
*/

/*
scala>  ("" /: words) (_ +" "+ _)
res49: java.lang.String =  the quick brown fox
*/

/*
scala> (words.head /: words.tail)  (_ +" "+ _)
res50: java.lang.String = the quick brown fox
*/

/*
def flattenLeft[T](xss: List[List[T]]) =
    (List[T]() /: xss) (_ ::: _)

def flattenRight[T](xss: List[List[T]]) =
    (xss :\ List[T]()) (_ ::: _)
*/

/*
scala> def flattenRight[T](xss: List[List[T]]) =
     |     (xss :\ List()) (_ ::: _)
<console>:5: error: type mismatch;
 found   : scala.List[T]
 required: List[Nothing]
           (xss :\ List()) (_ ::: _)
                              ^
*/

/*
def reverseLeft[T](xs: List[T]) = (\startValue /: xs)(\operation)
*/

/*
def reverseLeft[T](xs: List[T]) =
  (List[T]() /: xs) {(ys, y) => y :: ys}
*/

/*
scala> List(1, -3, 4, 2, 6) sortWith (_ < _)
res51: List[Int] = List(-3, 1, 2, 4, 6)

scala> words sortWith (_.length > _.length)
res52: List[java.lang.String] = List(quick, brown, the, fox)
*/