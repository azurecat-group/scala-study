/**
  * Created by donghwankim on 2018. 2. 19..
  */

/*
scala> def doesNotCompile(q: Queue) {}
<console>:5: error: trait Queue takes type parameters
       def doesNotCompile(q: Queue) {}
                          ^
*/

/*
scala> def doesCompile(q: Queue[AnyRef]) {}
doesCompile: (Queue[AnyRef])Unit
*/

/*
trait Queue[+T] { ... }
*/

/*
trait Queue[-T] { ... }
*/

// 무공변성(윤통성이 없는) Cell 클래스
class Cell[T](init: T) {
  private[this] var current = init
  def get = current
  def set(x: T) { current = x }
}

/*
val c1 = new Cell[String]("abc")
val c2: Cell[Any] = c1
c2.set(1)
val s: String = c1.get
*/

/*
Cell.scala:7: error: covariant type T occurs in
contravariant position in type T of value x
   def set(x: T) = current = x
              ^
*/

/*
// 자바 코드
String[] a1 = { "abc" };
Object[] a2 = a1;
a2[0] = new Integer(17);
String s = a1[0];
*/

/*
Exception in thread "main" java.lang.ArrayStoreException:
java.lang.Integer
        at JavaArrays.main(JavaArrays.java:8)
*/

/*
void sort(Object[] a, Comparator cmp) { ... }
*/

/*
scala> val a1 = Array("abc")
a1: Array[java.lang.String] = Array(abc)

scala> val a2: Array[Any] = a1
<console>:5: error: type mismatch;
 found   : Array[java.lang.String]
 required: Array[Any]
       val a2: Array[Any] = a1
                            ^
*/

/*
scala> val a2: Array[Object] =
     |   a1.asInstanceOf[Array[Object]]
a2: Array[java.lang.Object] = Array(abc)
*/