/**
  * Created by donghwankim on 2017. 6. 28..
  */

class Rational_8(n: Int, d: Int) {
  require(d != 0)

  private val g = gcd(n.abs, d.abs)
  val number = n / g
  val denom  = d / g

  def this(n: Int) = this(n, 1)

  def + (that: Rational_8): Rational_8 =
    new Rational_8(
      number * that.denom + that.number * denom,
      denom * that.denom
    )

  def * (that: Rational_8): Rational_8 =
    new Rational_8(number * that.number, denom * that.denom)

  override def toString = number + "/" + denom

  private def gcd(a: Int, b: Int): Int =
    if (b == 0) a else gcd(b, a % b)
}

val x = new Rational_8(1, 2)

val y = new Rational_8(2, 3)

println(x + y)
println(x.+(y))

println(x + x * y)

println((x + x) * y)

println(x + (x * y))