/**
  * Created by donghwankim on 2018. 2. 19..
  */

/*
val initial: String
*/

/*
val initial = "hi"
*/

/*
def initial: String
*/

// 추상 val과 파라미터 없는 메소드 오버라이드하기
abstract class Fruit {
  val v: String // `v' for value
  def m: String // `m' for method
}

abstract class Apple extends Fruit {
  val v: String
  val m: String // OK to override a `def' with a `val'
}

abstract class BadApple extends Fruit {
  def v: String // ERROR: cannot override a `val' with a `def'
  def m: String
}