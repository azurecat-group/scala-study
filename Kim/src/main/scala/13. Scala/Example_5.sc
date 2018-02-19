/**
  * Created by donghwankim on 2018. 1. 28..
*/

// 비공개 접근이 자바와 스칼라에서 어떻게 다른가?
class Outer {
  class Inner {
    private def f() {
      println("f")
    }
    class InnerMost {
      f() // 문제없음
    }
  }
  (new Inner).f() // 오류: f를 찾을 수 없음
}

// 보호 접근이 스칼라와 자바에서 어떻게 다른가?
package p {
  class Super {
    protected def f() { println("f")}
  }
  class Sub extends Super {
    f()
  }
  class Other {
    (new Super).f() // 오류: f에 접근할 수 없다.
  }
}

// 접근 지정자를 사용해 보호 영역을 유연하게 설정하기
package bobsrockets

package navigation {
  private[bobsrockets] class Navigator {
    protected[navigation] def useStartChart() {}
    class LegOfJourney {
      private[Navigator] val distance = 100
    }
    private[this] var speed = 200
  }
}

package launch {
  import navigation.{Navigator, _}
  object Vehicle {
    private[launch] val guide = new Navigator
  }
}

// 동반 클래스와 객체의 비공개 멤버 접근
class Rocket {
  import Rocket.fuel
  private def canGoHomeAgain = fuel > 20
}

object Rocket {
  private def fuel = 10
  def chooseStrategy(rocket: Rocket): Unit = {
    if (rocket.canGoHomeAgain)
      goHome()
    else
      pickAStar()
  }
  def goHome() {}
  def pickAStar() {}
}