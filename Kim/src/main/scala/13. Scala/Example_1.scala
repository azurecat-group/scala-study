/**
  * Created by donghwankim on 2017. 11. 19..
  */

// 모든 파일을 한 패키지 안에 넣기
package bobsrockets.navigation
class Navigator

// 간단한 패키지 선언을 길게 쓴 형태
package bobsrockets.navigation {
  class Navigator
}

// 한 파일 안에 여러 패키지 넣기
package bobsrockets {
  package navigation {

    // bobsrockets.navigation 패키지 안쪽
    class Navigator

    package tests {

      // bobsrockets.navigation.test 패키지 안쪽
      class NavigatorSuite
    }
  }
}
