/**
  * Created by donghwankim on 2017. 7. 26..
  */

// 2개의 함수가 서로 번갈아 호출하는 경우 꼬리재귀가 되지 않음
def isEven(x: Int): Boolean =
  if (x == 0) true else isOdd(x - 1)
def isOdd(x: Int): Boolean =
  if (x == 0) false else isEven(x - 1)

val funValue = nestedFun _
def nestedFun(x: Int): Unit = {
  if (x != 0) { println(x); funValue(x - 1) }
}

