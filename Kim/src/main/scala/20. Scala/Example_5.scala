/**
  * Created by donghwankim on 2018. 2. 19..
  */

/*
trait RationalTrait {
  val numerArg: Int
  val denomArg: Int
}
*/

/*
new RationalTrait {
  val numerArg = 1
  val denomArg = 2
}
*/

/*
new Rational(expr1, expr2)
*/

/*
new RationalTrait {
  val numerArg = expr1
  val denomArg = expr2
}
*/

// 추상 val을 사용하는 트레이트
trait RationalTrait {
  val numerArg: Int
  val denomArg: Int
  require(denomArg != 0)
  private val g = gcd(numerArg, denomArg)
  val numer = numerArg / g
  val denom = denomArg / g
  private def gcd(a: Int, b: Int): Int =
    if (b == 0) a else gcd(b, a % b)
  override def toString = numer +"/"+ denom
}

/*
scala> val x = 2
x: Int = 2

scala> new RationalTrait {
     |   val numerArg = 1 * x
     |   val denomArg = 2 * x
     | }
java.lang.IllegalArgumentException: requirement failed
	   at scala.Predef$.require(Predef.scala:134)
	   at RationalTrait$class.$init$(<console>:8)
	   at $anon$1.<init>(<console>:8)
*/

// 익명 클래스 표현식에서 필드를 미리 초기화하기
scala> new {
  |   val numerArg = 1 * x
  |   val denomArg = 2 * x
  | } with RationalTrait
res1: java.lang.Object with RationalTrait = 1/2

// 객체 정의에서 필드를 미리 초기화하기
object twoThirds extends {
  val numerArg = 2
  val denomArg = 3
} with RationalTrait

// 클래스 정의에서 필드를 미리 초기화하기
class RationalClass(n: Int, d: Int) extends {
  val numerArg = n
  val denomArg = d
} with RationalTrait {
  def + (that: RationalClass) = new RationalClass(
    numer * that.denom + that.numer * denom,
    denom * that.denom
  )
}

/*
scala> new {
   |   val numerArg = 1
   |   val denomArg = this.numerArg * 2
   | } with RationalTrait
<console>:9: error: value numerArg is not a member of object
$iw
         val denomArg = this.numerArg * 2
                             ^
*/

/*
scala> object Demo {
     |   val x = { println("initializing x"); "done" }
     | }
defined module Demo
*/

/*
scala> Demo
initializing x
res3: Demo.type = Demo$@17469af

scala> Demo.x
res4: java.lang.String = done
*/

/*
scala> object Demo {
     |   lazy val x = { println("initializing x"); "done" }
     | }
defined module Demo

scala> Demo
res5: Demo.type = Demo$@11dda2d

scala> Demo.x
initializing x
res6: java.lang.String = done
*/

// 트레이트를 지연 val로 초기화하
trait LazyRationalTrait {
  val numerArg: Int
  val denomArg: Int
  lazy val numer = numerArg / g
  lazy val denom = denomArg / g
  override def toString = numer +"/"+ denom
  private lazy val g = {
    require(denomArg != 0)
    gcd(numerArg, denomArg)
  }
  private def gcd(a: Int, b: Int): Int =
    if (b == 0) a else gcd(b, a % b)
}

/*
scala> val x = 2
x: Int = 2

scala> new LazyRationalTrait {
     |   val numerArg = 1 * x
     |   val denomArg = 2 * x
     | }
res7: java.lang.Object with LazyRationalTrait = 1/2
*/