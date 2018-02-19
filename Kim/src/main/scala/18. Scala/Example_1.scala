/**
  * Created by donghwankim on 2018. 2. 19..
  */

/*
val cs = List('a', 'b', 'c')
*/

// 변경 가능한 은행 계좌 클래스
class BankAccount {

  private var bal: Int = 0

  def balance: Int = bal

  def deposit(amount: Int) {
    require(amount > 0)
    bal += amount
  }

  def withdraw(amount: Int): Boolean =
    if (amount > bal) false
    else {
      bal -= amount
      true
    }
}

/*
scala> val account = new BankAccount
account: BankAccount = BankAccount@bf5bb7

scala> account deposit 100

scala> account withdraw 80
res1: Boolean = true

scala>  account withdraw 80
res2: Boolean = false
*/

/*
class Keyed {
  def computeKey: Int = ... // 이 부분에서 시간이 오래 걸린다.
  ...
}
*/

/*
class MemoKeyed extends Keyed {
  private var keyCache: Option[Int] = None
  override def computeKey: Int = {
    if (!keyCache.isDefined) keyCache = Some(super.computeKey)
    keyCache.get
  }
}
*/