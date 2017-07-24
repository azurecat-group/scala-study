/**
  * Created by donghwankim on 2017. 6. 19..
  */
// Scala 구현
def factorial(x: BigInt): BigInt = if (x == 0) 1 else x * factorial(x -1)

println(factorial(30))

// Java 클래스 구현

import java.math.BigInteger

def factorial2(x: BigInteger): BigInteger =
  if (x == BigInteger.ZERO)
    BigInteger.ONE
  else
    x.multiply(factorial2(x.subtract(BigInteger.ONE)))

println(factorial2(BigInteger.valueOf(30)))
