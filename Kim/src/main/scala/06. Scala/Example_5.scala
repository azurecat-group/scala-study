/**
  * Created by donghwankim on 2017. 6. 28..
  */

/*
class Rational_4(n: Int, d: Int) {
  require(d != 0)
  override def toString = n + "/" + d
  def add(that: Rational_4): Rational_4 =
    new Rational_4(n * that.d + that.n * d, d * that.d)
}
*/

class Rational_4(n: Int, d: Int) {
  require(d != 0)
  val number: Int = n
  val denom: Int = d

  override def toString = number + "/" + denom
  def add(that: Rational_4): Rational_4 =
    new Rational_4(
      number * that.denom + that.number * denom,
      denom * that.denom
    )
}

val oneHalf = new Rational_4(1, 2)

val twoThirds = new Rational_4(2, 3)

println(oneHalf add twoThirds)

val r = new Rational_4(1, 2)

r.number

r.denom