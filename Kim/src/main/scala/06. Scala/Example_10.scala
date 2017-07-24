/**
  * Created by donghwankim on 2017. 6. 28..
  */

class Rational(n: Int, d: Int) {
  require(d != 0)

  private val g = gcd(n.abs, d.abs)

  val numer = n / g
  val denom = d / g

  def this(n: Int) = this(n, 1)

  def + (that: Rational): Rational =
    new Rational(
      numer * that.denom + that.numer * denom,
      denom * that.denom
    )

  def + (i: Int): Rational =
    new Rational(numer + i * denom, denom)

  def - (that: Rational): Rational =
    new Rational(
      numer * that.denom - that.numer * denom,
      denom * that.denom
    )

  def - (i: Int): Rational =
    new Rational(numer - i * denom, denom)

  def * (that: Rational): Rational =
    new Rational(numer * that.numer, denom * that.denom)

  def * (i: Int): Rational =
    new Rational(numer * i, denom)

  def / (that: Rational): Rational =
    new Rational(numer * that.denom, denom * that.denom)

  def / (i: Int): Rational =
    new Rational(numer, denom * i)

  override def toString = numer + "/" + denom

  private def gcd(a: Int, b: Int): Int =
    if(b == 0) a else gcd(b, a % b)
}

val x = new Rational(2, 3)

println(x * x)

println(x * 2)

import scala.language.implicitConversions
// scala 2.10 이후 부터 명시적으로 허용하는 습관을 들이자. 가능하면 21장에서 다루는 다른 기법을 확용해 문제를 해결하자.

implicit def intToRational(x: Int) = new Rational(x)

println(2 * x)