/**
  * Created by donghwankim on 2017. 6. 28..
  */

class Rational_5(n: Int, d: Int) {
  require(d != 0)
  val number: Int = n
  val denom: Int = d

  override def toString = number + "/" + denom

  def add(that: Rational_5): Rational_5 =
    new Rational_5(
      number * that.denom + that.number * denom,
      denom * that.denom
    )

  def lessThan(that: Rational_5): Rational_5 =
    this.number * that.denom < that.number * this.denom

  def max(that: Rational_5): Rational_5 =
    if (this.lessThan(that) that else this)
}