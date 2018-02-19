/**
  * Created by donghwankim on 2018. 1. 28..
  */

/*
expr match {
  case BinOp(op, left, right) =>
    println(expr +" is a binary operation")
  case _ =>
}
*/

// 와일드카드 패턴 매치
expr match {
  case BinOp(_, _, _) => println(expr +" is a binary operation")
  case _ => println("It's something else")
}

// 상수 패턴을 사용한 패턴 매치
def describe(x: Any) = x match {
  case 5 => "five"
  case true => "truth"
  case "hello" => "hi!"
  case Nil => "the empty list"
  case _ => "something else"
}

/* 리스트 15.5의 패턴 실행
scala> describe(5)
res6: java.lang.String = five

scala> describe(true)
res7: java.lang.String = truth

scala> describe("hello")
res8: java.lang.String = hi!

scala> describe(Nil)
res9: java.lang.String = the empty list

scala> describe(List(1,2,3))
res10: java.lang.String = something else
*/

// 변수 패턴을 사용한 패턴 매치
expr match {
  case 0 => "zero"
  case somethingElse => "not zero: "+ somethingElse
}

/*
scala> import math.{E, Pi}
import math.{E, Pi}

scala> E match {
     |   case Pi => "strange math? Pi = "+ Pi
     |   case _ => "OK"
     | }
res11: java.lang.String = OK
*/

/*
scala> val pi = math.Pi
pi: Double = 3.141592653589793

scala> E match {
     |   case pi => "strange math? Pi = "+ pi
     | }
res12: java.lang.String = strange math? Pi =
2.718281828459045
*/

/*
scala> E match {
     |   case pi => "strange math? Pi = "+ pi
     |   case _ => "OK"
     | }
<console>:9: error: unreachable code
         case _ => "OK"
                   ^
*/

/*
scala> E match {
     |   case pi => "strange math? Pi = "+ pi
     |   case _ => "OK"
     | }
<console>:9: error: unreachable code
         case _ => "OK"
                   ^
*/

/*
scala> E match {
     |   case `pi` => "strange math? Pi = "+ pi
     |   case _ => "OK"
     | }
res14: java.lang.String = OK
*/

// 생성자 패턴을 사용한 패턴 매치
expr match {
  case BinOp("+", e, Number(0)) => println("a deep match")
  case _ =>
}

// 길이가 정해진 시퀀스 패턴
expr match {
  case List(0, _, _) => println("found it")
  case _ =>
}

// 길이와 관계없이 매치할 수 있는 시퀀스 패턴
expr match {
  case List(0, _*) => println("found it")
  case _ =>
}

// 튜플 패턴을 사용하는 패턴 매치
def tupleDemo(expr: Any) =
  expr match {
    case (a, b, c)  =>  println("matched "+ a + b + c)
    case _ =>
  }

/*
scala> tupleDemo(("a ", 3, "-tuple"))
matched a 3-tuple
*/

// 타입 지정 패턴을 사용한 패턴 매치
def generalSize(x: Any) = x match {
  case s: String => s.length
  case m: Map[_, _] => m.size
  case _ => -1
}

/*
scala> generalSize("abc")
res16: Int = 3

scala> generalSize(Map(1 -> 'a', 2 -> 'b'))
res17: Int = 2

scala> generalSize(math.Pi)
res18: Int = -1
*/

/*
expr.isInstanceOf[String]

expr.asInstanceOf[String]
*/

// isinstanceOf와 asinstanceOf 사용(좋지 않은 스타일)
if (x.isInstanceOf[String]) {
  val s = x.asInstanceOf[String]
  s.length
} else ...

/*
scala> def isIntIntMap(x: Any) = x match {
     |   case m: Map[Int, Int] => true
     |   case _ => false
     | }
warning: there were unchecked warnings; re-run with
-unchecked for details
isIntIntMap: (x: Any)Boolean
*/

/*
scala> :quit
$ scala -unchecked
Welcome to Scala version 2.8.1
(Java HotSpot(TM) Client VM, Java 1.5.0_13).
Type in expressions to have them evaluated.
Type :help for more information.

scala>  def isIntIntMap(x: Any) = x match {
   |   case m: Map[Int, Int] => true
   |   case _ => false
   | }
<console>:5: warning: non variable type-argument Int in
type pattern is unchecked since it is eliminated by erasure
         case m: Map[Int, Int] => true
*/

/*
scala> isIntIntMap(Map(1 -> 1))
res19: Boolean = true

scala> isIntIntMap(Map("abc" -> "abc"))
res20: Boolean = true
*/

/*
scala> def isStringArray(x: Any) = x match {
     |   case a: Array[String] => "yes"
     |   case _ => "no"
     | }
isStringArray: (x: Any)java.lang.String

scala> val as = Array("abc")
as: Array[java.lang.String] = Array(abc)

scala> isStringArray(as)
res21: java.lang.String = yes

scala> val ai = Array(1, 2, 3)
ai: Array[Int] = Array(1, 2, 3)

scala> isStringArray(ai)
res22: java.lang.String = no
*/

// (@ 기호를 사용한) 변수 바인딩이 있는 패턴 매치
expr match {
  case UnOp("abs", e @ UnOp("abs", _)) => e
  case _ =>
}