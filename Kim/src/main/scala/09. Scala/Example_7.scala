import java.util.function.Predicate

/**
  * Created by donghwankim on 2017. 7. 27..
  */

var assertionEnable = true

def myAssert(predicate: () => Boolean) =
  if (assertionEnable && !predicate())
    throw new AssertionError()

myAssert(() => 5 > 3)

// myAssert(5 > 3) 함수 리터럴의 () => 이 없어서 동작하지 않음

def byNameAssert(predicate: => Boolean) =
  if (assertionEnable && !predicate)
    throw new AssertionError()

byNameAssert(5 > 3)

def boolAssert(predicate: Boolean) =
  if (assertionEnable && !predicate)
      throw new AssertionError

boolAssert(5 > 3)

/* boolAssert 플래그가 꺼져 있어도 표현식을 계산하고 부수 효과가 발생함
플래그 : var assertionEnable = true
표현식: x / 0 == 0 // 표현식을 계산 후에 boolAssert 결과 값을 전달

val x = 0

scala> var assertionEnabled = false
assertionEnabled: Boolean = false

scala> boolAssert(x / 0 == 0)
java.lang.ArithmeticException: / by zero
      at .<init>(<console>:9)
      at .<clinit>(<console>)
      at RequestResult$.<init>(<console>:9)
      at RequestResult$.<clinit>(<console>)
 */

/* byNameAssert 플래그가 꺼져 있다면 표현식을 계산하지 않고, 부수 효과도 발생하지 않음
플래그 : var assertionEnable = true
표현식: 0 / 0 == 0 // 표현식 계산하는 내용의 apply 메소드가 들어간 함수 값을 만들어서 byNameAssert로 넘긴다.

scala> byNameAssert(x / 0 == 0)
 */
