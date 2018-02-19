/**
  * Created by donghwankim on 2018. 1. 28..
  */

// 케이스 클래스 정의
abstract class Expr
case class Var(name: String) extends Expr
case class Number(num: Double) extends Expr
case class UnOp(operator: String, arg: Expr) extends Expr
case class BinOp(operator: String, left: Expr, right: Expr) extends Expr

/*
scala> val v = Var("x")
v: Var = Var(x)
*/

/*
scala> val op = BinOp("+", Number(1), v)
op: BinOp = BinOp(+,Number(1.0),Var(x))
*/

/*
scala> v.name
res0: String = x

scala> op.left
res1: Expr = Number(1.0)
*/

/*
scala> println(op)
BinOp(+,Number(1.0),Var(x))

scala> op.right == Var("x")
res3: Boolean = true
 */

/*
scala> op.copy(operator = "-")
res4: BinOp = BinOp(-,Number(1.0),Var(x))
*/

/*
UnOp("-", UnOp("-", e))  => e   // 부호를 두 번 반전
BinOp("+", e, Number(0)) => e   // 0을 더함
BinOp("*", e, Number(1)) => e   // 1을 곱함
*/

/*
scala> simplifyTop(UnOp("-", UnOp("-", Var("x"))))
res4: Expr = Var(x)
*/

// 패턴 매치를 사용하는 simplifyTop 함수
def simplifyTop(expr: Expr): Expr = expr match {
  case UnOp("-", UnOp("-", e))  => e   // Double negation
  case BinOp("+", e, Number(0)) => e   // Adding zero
  case BinOp("*", e, Number(1)) => e   // Multiplying by one
  case _ => expr
}

/*
switch (selector) { 대안들 }

selector match { 대안들 }
*/

/*
UnOp("-", UnOp("-", e))
*/

// 비어 있는 '디폴트 케이스가 있는 패턴 매치
expr match {
  case BinOp(op, left, right) =>
    println(expr +" is a binary operation")
  case _ =>
}