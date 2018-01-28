/**
  * Created by donghwankim on 2017. 11. 19..
  */

// 클래스와 패키지에 간결하게 접근하기
package bobsrockets {
  package navigation {
    class Navigator {
      // bobsrockets.navigation.starMap을 쓸 필요가 없다
      val map = new StarMap
    }
    class StarMap
  }
  class Ship {
    // bobsrockets.navigation.Navigator를 쓸 필요가 없다
    val nav = new navigation.Navigator
  }

  package fleets {
    class Fleet {
      // bobsrockets.Ship을 쓸 필요가 없다
      def addShip() { new Ship }
    }
  }
}

// 상위 패키지 안에 있는 기호를 그냥 사용할 수는 없다.
package bobsrockets {
  class Ship
}

package bobsrockets.fleets {
  class Fleet {
    // 컴파일할 수 없다 이 스코프에는 Ship이 안 들어 있다
    def addShip() { new Ship }
  }
}

/*
package bobsrockets
package fleets
Class Fleet {
    // bobsrockets.Ship을 쓸 필요가 없다
    def addShip() { new Ship }
 }
*/

// 숨겨진 패캐지 이름에 접근하기
// launch.scala 파일
package launch {
  class Booster3
}

// bobsrockets.scala 파일
package bobsrockets {
  package navigation {
    package launch {
      class Booster1
    }

    class MissionControl {
      val booster1 = new launch.Booster1
      val booster2 = new bobsrockets.launch.Booster2
      val booster3 = new _root_.launch.Booster3
    }
  }

  package launch {
    class Booster2
  }
}