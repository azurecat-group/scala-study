/**
  * Created by donghwankim on 2017. 6. 28..
  */

class Rational_6(n: Int, d: Int) {
  require(d != 0)
  val number: Int = n
  val denom: Int = d

  override def toString = number + "/" + denom

  def this(n: Int) = this(n, 1)

  def add(that: Rational_6): Rational_6 =
    new Rational_6(
      this.number * that.denom + that.number * this.denom,
      this.denom * that.denom
    )
}

val y = new Rational_6(3)

println(y)