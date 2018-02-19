/**
  * Created by donghwankim on 2018. 1. 31..
  */

// 봉인한 케이스 클래스 계층
sealed abstract class Expr
case class Var(name: String) extends Expr
case class Number(num: Double) extends Expr
case class UnOp(operator: String, arg: Expr) extends Expr
case class BinOp(operator: String,
                 left: Expr, right: Expr) extends Expr

/*
def describe(e: Expr): String = e match {
  case Number(_) => "a number"
  case Var(_)    => "a variable"
}
 */

/*
def describe(e: Expr): String = e match {
  case Number(_) => "a number"
  case Var(_) => "a variable"
  case _ => throw new RuntimeException // 일어나서는 안 될 일이다.
}
*/

/*
def describe(e: Expr): String = (e: @unchecked) match {
  case Number(_) => "a number"
  case Var(_)    => "a variable"
}
*/