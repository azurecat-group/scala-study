/**
  * Created by donghwankim on 2017. 10. 24..
  */

// 추상 메소드와 추상 클래스 정의
abstract class Element {
  def contents: Array[String]
}
/*
   contents는 Element 클래스의 추상 멤버이다
   추상 멤버가 있는 클래스는 추상 클래스로 선언해야만 한다.

   추상 클래스를 인스턴스로 만들 수 없다.
   메소드의 경우 구현이 없으면 추상 메소드이다
   메소드 구현이 있다면 구체 메소드(구상 메소드)라고 한다.
   선언[declaration] : contents를 선언
   정의[definition] : contents를 구체 메소드를 정의하지 않는다
*/

