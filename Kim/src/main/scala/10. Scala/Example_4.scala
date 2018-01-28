/**
  * Created by donghwankim on 2017. 10. 24..
  */

// Element의 서브 클래스인 ArrayElement 정의
class ArrayElement(conts: Array[String]) extends Element {
  def contents: Array[String] = conts
}

/*
  ArrayElement 클래스를 Element 클래스를 확장[extend]하도록 정의했다.
  extends로 시작하는 절을 클래스 이름 뒤에 표기해 상속 관계를 나타낸다.

  ... extends Element ...

  ArrayElement는 Element에서 비공개[private]가 아닌 멤버를 모두 물려 받는다.
  또한 ArrayElement를 Element의 서브타입[subtype]으로 만든다.
  ArrayElement가 Element를 확장한 경우 ArrayElement를 Element의 서브클래스라고 한다.
  반대로 Element는 ArrayElement의 슈퍼클래스[superclass]다.

  extends : 비공개가 아닌 멤버를 모두 물려받는다.

  ArrayElement의 클래스 다이어그램
  Array[String] -> ArrayElement -> Element -> AnyRef

  상속은 슈퍼클래스의 모든 멤버는 서브 클래스의 멤버이기도 하다는 뜻이다.

  상속의 예외
  1.서브클래스는 슈퍼클래스의 비공개 멤버를 상속하지 않는다.
  2.슈퍼클래스의 멤버와 이름과 파라미터가 모두 동일한 멤버 정의가 서브클래스에 있으면 슈퍼 클래스의 것을 상속하지 않는다.


 */
