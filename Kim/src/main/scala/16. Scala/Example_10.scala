/**
  * Created by donghwankim on 2018. 1. 31..
  */

/*
scala> msort((x: Char, y: Char) => x > y)(abcde)
res66: List[Char] = List(e, d, c, b, a)
*/

/*
scala> abcde sortWith (_ > _)
res67: List[Char] = List(e, d, c, b, a)
*/

/*
scala> msort(_ > _)(abcde)
<console>:12: error: missing parameter type for expanded
function ((x$1, x$2) => x$1.$greater(x$2))
       msort(_ > _)(abcde)
             ^
*/

/*
scala> msort[Char](_ > _)(abcde)
res68: List[Char] = List(e, d, c, b, a)
*/

/*
def msortSwapped[T](xs: List[T])(less:
    (T, T) => Boolean): List[T] = {

  // same implementation as msort,
  // but with arguments swapped
}
*/

/*
scala> msortSwapped(abcde)(_ > _)
res69: List[Char] = List(e, d, c, b, a)
*/

/*
(xss :\ List[T]()) (_ ::: _)
*/

/*
(xs :\ z) (op)
*/

/*
(xss :\ List()) (_ ::: _)  // 컴파일할 수 없음
*/

/*
(List[T], List[Nothing]) => List[Nothing]
*/