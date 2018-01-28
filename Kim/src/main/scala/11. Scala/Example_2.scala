/**
  * Created by donghwankim on 2017. 11. 18..
  */

/* 자바 코드
boolean isEqual(int x, int y) {
  return x == y
}
System.out.println(isEqual(421, 421));
*/

/* 자바 코드
boolean isEqual(Integer x, Integer y) {
  return x == y
}
System.out.println(isEqual(421, 421));
*/

/*
scala> def isEqual(x: Int, y: Int) = x == y
isEqual: (Int,Int)Boolean

scala> isEqual(421, 421)
res10: Boolean = true

scala> def isEqual(x: Any, y: Any) = x == y
isEqual: (Any,Any)Boolean

scala> isEqual(421, 421)
res11: Boolean = true
*/

/*
scala> val x = "abcd".substring(2)
x: java.lang.String = cd

scala> val y = "abcd".substring(2)
y: java.lang.String = cd

scala> x == y
res12: Boolean = true
 */

/*
scala> val x = new String("abc")
x: java.lang.String = abc

scala> val y = new String("abc")
y: java.lang.String = abc

scala> x == y
res13: Boolean = true

scala> x eq y
res14: Boolean = false

scala> x ne y
res15: Boolean = true
 */