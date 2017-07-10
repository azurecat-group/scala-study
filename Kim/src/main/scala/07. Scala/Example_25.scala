/**
  * Created by donghwankim on 2017. 7. 6..
  */

/* 컴파일 할수 없는 코드
val a = 1
val a = 2
println(a)
 */

// 컴파일할 수 있는 코드

val a = 1;
{
  val a = 2
  println(a)
}
println(a)

/* 인터프린트에서 가능한 코드
scala> val a = 1
a: Int =1

scala> val a = 2
a: Int = 2

scala> println(a)
2
*/

/* 인터프린터에서 해석하는 결과
스칼라 인터프린터에서는 작성하는 구문마다 스코프를 새로 만듭니다.

val a = 1;
{
  val a = 2;
  {
    println(a)
  }
}
 */
