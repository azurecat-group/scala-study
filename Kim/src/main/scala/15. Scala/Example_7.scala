/**
  * Created by donghwankim on 2018. 1. 31..
  */


// 할당문 하나로 여러 배열 정의하기
scala> val myTuple = (123, "abc")
myTuple: (Int, java.lang.String) = (123,abc)

scala> val (number, string) = myTuple
number: Int = 123
string: java.lang.String = abc

/*
scala> val exp = new BinOp("*", Number(5), Number(1))
exp: BinOp = BinOp(*,Number(5.0),Number(1.0))

scala> val BinOp(op, left, right) = exp
op: String = *
left: Expr = Number(5.0)
right: Expr = Number(1.0)
*/

/*
val withDefault: Option[Int] => Int = {
  case Some(x) => x
  case None => 0
}
*/

/*
scala> withDefault(Some(10))
res28: Int = 10

scala> withDefault(None)
res29: Int = 0
*/

/*
react {
  case (name: String, actor: Actor) => {
    actor ! getip(name)
    act()
  }
  case msg => {
    println("Unhandled message: "+ msg)
    act()
  }
}
*/

/*
val second: List[Int] => Int = {
  case x :: y :: _ => y
}
*/

/*
<console>:17: warning: match is not exhaustive!
missing combination            Nil
*/

/*
scala> second(List(5, 6, 7))
res24: Int = 6

scala> second(List())
scala.MatchError: List()
	at $anonfun$1.apply(<console>:17)
	at $anonfun$1.apply(<console>:17)
*/

/*
val second: PartialFunction[List[Int],Int] = {
  case x :: y :: _ => y
}
*/

/*
scala> second.isDefinedAt(List(5,6,7))
res30: Boolean = true

scala> second.isDefinedAt(List())
res31: Boolean = false
*/

/*
  new PartialFunction[List[Int], Int] {
    def apply(xs: List[Int]) = xs match {
      case x :: y :: _ => y
    }
    def isDefinedAt(xs: List[Int]) = xs match {
      case x :: y :: _ => true
      case _ => false
    }
  }
*/

// 튜플 패턴을 사용하는 for 표현식
scala> for ((country, city) <- capitals)
  |   println("The capital of "+ country +" is "+ city)
The capital of France is Paris
The capital of Japan is Tokyo

// 패턴과 매치하는 리스트 원소 고르기
scala> val results = List(Some("apple"), None,
  |     Some("orange"))
results: List[Option[java.lang.String]] = List(Some(apple),
  None, Some(orange))

scala> for (Some(fruit) <- results) println(fruit)
apple
orange