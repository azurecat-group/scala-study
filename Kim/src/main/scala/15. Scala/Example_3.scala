/**
  * Created by donghwankim on 2018. 1. 31..
  */

/*
BinOp("+", Var("x"), Var("x"))
 */

/*
BinOp("*", Var("x"), Number(2))
*/

/*
scala> def simplifyAdd(e: Expr) = e match {
        case BinOp("+", x, y) => BinOp("*", x, Number(2))
        case _ => e
        }
<console>:11: error: x is already defined as value x
        case BinOp("+", x, x) => BinOp("*", x, Number(2))
                           ^
 */

/* 패턴 가드가 있는 match 표현식
scala> def simplifyAdd(e: Expr) = e match {
        case BinOp("+", x, y) if x == y =>
           BinOp("*", x, Number(2))
        case _ => e
      }
simplifyAdd: (e: Expr)Expr
*/

// 양의 정수만 매치
case n: Int if 0 < n => ...

// 'a' 문자로 시작하는 문자열만 매치
case s: String if s == 'a' => ...