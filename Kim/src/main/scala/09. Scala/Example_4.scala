import com.sun.crypto.provider.AESCipher
import com.sun.crypto.provider.AESCipher.AES128_CBC_NoPadding

/**
  * Created by donghwankim on 2017. 7. 26..
  */

def plainOldSum(x: Int, y: Int) = x + y
plainOldSum(1, 2)
/*
scala> def plainOldSum(x: Int, y: Int) = x + y
plainOldSum: (x: Int, y: Int)Int

scala> plainOldSum(1, 2)
res4: Int =3
 */

def curriedSum(x: Int)(y: Int) = x + y
curriedSum(1)(2)
/*
scala> def curriedSum(x: Int)(y: Int) = x + y
curriedSum: (x: Int)(y: Int)Int

scala> curriedSum(1)(2)
res5: Int = 3
 */

def first(x: Int) = (y: Int) => x + y
/*
scala> def first(x: Int) = (y: Int) => x + y
first: (x: Int)Int => Int
 */

val second = first(1)
/*
scala> val second = first(1)
second: (Int) => Int = <function1>
 */

second(2)
/*
scala> second(2)
res6: Int =3
 */

val onePlus = curriedSum(1)_
/*
scala> val onePlus = curriedSum(1)_
onePlus: (Int) => Int = <function1>
 */

onePlus(2)
/*
scala> onePlus(2)
res7: Int = 3
 */

val twoPlus = curriedSum(2)_
twoPlus(2)
/*
scala> val twoPlus = curriedSum(2)_
twoPlus: (Int) => Int = <function1>

scala> twoPlus(2)
res8: Int = 4
 */