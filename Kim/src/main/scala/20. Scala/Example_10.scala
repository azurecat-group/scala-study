/**
  * Created by donghwankim on 2018. 2. 19..
  */

/*
// 처음으로 (잘못) 설계한 통화 클래스
abstract class Currency {
  val amount: Long
  def designation: String
  override def toString = amount +" "+ designation
  def + (that: Currency): Currency = ...
  def * (x: Double): Currency = ...
}
*/

/*
79 USD
11000 Yen
99 Euro
*/

/*
new Currency {
  val amount = 79L
  def designation = "USD"
}
*/

/*
abstract class Dollar extends Currency {
  def designation = "USD"
}
abstract class Euro extends Currency {
  def designation = "Euro"
}
*/

/*
// 두 번째(여전히 완전하지 않은) Currency 클래스 설계
abstract class AbstractCurrency {
  type Currency <: AbstractCurrency
  val amount: Long
  def designation: String
  override def toString = amount +" "+ designation
  def + (that: Currency): Currency = ...
  def * (x: Double): Currency = ...
}
*/

/*
abstract class Dollar extends AbstractCurrency {
  type Currency = Dollar
  def designation = "USD"
}
*/

/*
def + (that: Currency): Currency = new Currency {
  val amount = this.amount + that.amount
}
*/

/*
error: class type required
  def + (that: Currency): Currency = new Currency {
                                         ^
*/

/*
abstract class AbstractCurrency {
  type Currency <: AbstractCurrency // 추상 타입
  def make(amount: Long): Currency  // 팩토리 메소드
  ...                               // 나머지 부분
}
*/

/*
myDollar.make(100)  // 백 달러 더!
*/

/*
abstract class CurrencyZone {
  type Currency <: AbstractCurrency
  def make(x: Long): Currency
  abstract class AbstractCurrency {
    val amount: Long
    def designation: String
    override def toString = amount +" "+ designation
    def + (that: Currency): Currency =
      make(this.amount + that.amount)
    def * (x: Double): Currency =
      make((this.amount * x).toLong)
  }
}
*/

/*
object US extends CurrencyZone {
  abstract class Dollar extends AbstractCurrency {
    def designation = "USD"
  }
  type Currency = Dollar
  def make(x: Long) = new Dollar { val amount = x }
}
*/

/*
class CurrencyZone {
  ...
  val CurrencyUnit: Currency
}
*/

// US 통화 지역
object US extends CurrencyZone {
  abstract class Dollar extends AbstractCurrency {
    def designation = "USD"
  }
  type Currency = Dollar
  def make(cents: Long) = new Dollar {
    val amount = cents
  }
  val Cent = make(1)
  val Dollar = make(100)
  val CurrencyUnit = Dollar
}

/*
override def toString =
  ((amount.toDouble / CurrencyUnit.amount.toDouble)
   formatted ("%."+ decimals(CurrencyUnit.amount) +"f")
   +" "+ designation)
*/

/*
private def decimals(n: Long): Int =
  if (n == 1) 0 else 1 + decimals(n / 10)
 */

// 유렵과 일본의 통화 지역
object Europe extends CurrencyZone {
  abstract class Euro extends AbstractCurrency {
    def designation = "EUR"
  }
  type Currency = Euro
  def make(cents: Long) = new Euro {
    val amount = cents
  }
  val Cent = make(1)
  val Euro = make(100)
  val CurrencyUnit = Euro
}

object Japan extends CurrencyZone {
  abstract class Yen extends AbstractCurrency {
    def designation = "JPY"
  }
  type Currency = Yen
  def make(yen: Long) = new Yen {
    val amount = yen
  }
  val Yen = make(1)
  val CurrencyUnit = Yen
}

// 환율 맵이 있는 Converter 객체
object Converter {
  var exchangeRate = Map(
    "USD" -> Map("USD" -> 1.0   , "EUR" -> 0.7596,
      "JPY" -> 1.211 , "CHF" -> 1.223),
    "EUR" -> Map("USD" -> 1.316 , "EUR" -> 1.0   ,
      "JPY" -> 1.594 , "CHF" -> 1.623),
    "JPY" -> Map("USD" -> 0.8257, "EUR" -> 0.6272,
      "JPY" -> 1.0   , "CHF" -> 1.018),
    "CHF" -> Map("USD" -> 0.8108, "EUR" -> 0.6160,
      "JPY" -> 0.982 , "CHF" -> 1.0  )
  )
}

/*
def from(other: CurrencyZone#AbstractCurrency): Currency =
  make(math.round(
    other.amount.toDouble * Converter.exchangeRate
      (other.designation)(this.designation)))
*/

// CurrencyZone의 전체 코드
abstract class CurrencyZone {

  type Currency <: AbstractCurrency
  def make(x: Long): Currency

  abstract class AbstractCurrency {

    val amount: Long
    def designation: String

    def + (that: Currency): Currency =
      make(this.amount + that.amount)
    def * (x: Double): Currency =
      make((this.amount * x).toLong)
    def - (that: Currency): Currency =
      make(this.amount - that.amount)
    def / (that: Double) =
      make((this.amount / that).toLong)
    def / (that: Currency) =
      this.amount.toDouble / that.amount

    def from(other: CurrencyZone#AbstractCurrency): Currency =
      make(math.round(
        other.amount.toDouble * Converter.exchangeRate
        (other.designation)(this.designation)))

    private def decimals(n: Long): Int =
      if (n == 1) 0 else 1 + decimals(n / 10)

    override def toString =
      ((amount.toDouble / CurrencyUnit.amount.toDouble)
        formatted ("%."+ decimals(CurrencyUnit.amount) +"f")
        +" "+ designation)
  }

  val CurrencyUnit: Currency
}

/*
scala> import org.stairwaybook.currencies._
*/

/*
scala> Japan.Yen from US.Dollar * 100
res16: Japan.Currency = 12110 JPY

scala> Europe.Euro from res16
res17: Europe.Currency = 75.95 EUR

scala> US.Dollar from res17
res18: US.Currency = 99.95 USD
*/

/*
scala> US.Dollar * 100 + res18
res19: US.Currency = 199.95 USD
*/

/*
scala> US.Dollar + Europe.Euro
<console>:10: error: type mismatch;
 found   : Europe.Euro
 required: US.Currency
       US.Dollar + Europe.Euro
                          ^
*/