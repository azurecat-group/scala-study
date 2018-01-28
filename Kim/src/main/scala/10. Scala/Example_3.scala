/**
  * Created by donghwankim on 2017. 10. 24..
  */

// 파라미터 없는 메소드 width와 height 정의
abstract class Element {
  def contents: Array[String]
  def height: Int = contents.length
  def width: Int = if (height == 0) 0 else contents(0).length
}

/*
  Element의 메소드 3개에는 모두 파라미터 목록이 없다.
  def width(): Int
  def width: Int

  해당 처럼 정의에 빈 괄호가 있는 메소드는 빈 괄호 메소드라 한다.
  어떤 메소드가 인자도 받지 않고 메소드가 속한 객체의 변경 가능한 필드를
  읽기만 하는 경우에는 파라미터 없는 메소드를 사용한다.
  이러한 관례는 필드나 메소드 중 어떤 방식으로 속성을 정의하더라도
  클라이언트 코드에 영향을 끼치지 말아야 한다는 단일 접근 원칙에 부합한다.

  width와 height를 메소드 대신 필드로 정의한다면 각 정의의 def를 val로 변경

  abstract class Element [
    def contents: Array[String]
    val height = contents.length
    val width =
      if (height == 0) 0 else contents(0).length

   필드의 장단점
   필드 장점 : 클래스가 초기화 시 값을 미리 계산해두기 때문에 매번 계산을
             수행하는 메소드 방식보다 약간 빠르다.
   필드 단점 : 각 Element 객체마다 값을 저장할 별도의 메모리 공간이 필요함

   클래스를 어떻게 사용하느냐에 따라 필드나 메소드 중 어떤 방식이 좋을지가 달라진다.
   그러나 클래스의 이용 형태는 시간이 지남에 따라 달라질 수 있다.

   가장 중요한 것은 Element 클래스를 사용하는 클라이언트가 Element의 내부 구현에
   영향을 받아서는 안된다.

   Element 클래스가 자신의 필드를 접근 함수[access function]로 변경하더라도,
   그 함수가 순수하다면[어떠한 부수 효과나 함수의 결과 값이 변경 가능한 상태에 의존하지도 않는다]
   Element의 클라이언트를 재작성할 필요가 없어야 한다.

   클라이언트는 자신이 사용하는 객체의 필드가 저장해 둔 값인지
   접근 함수인지 신경 쓸 필요가 없어야 한다.

   원칙적으로 스칼라의 함수 호출에서 빈 괄호를 모두 생략할 수도 있지만, 해당 함수 호출이
   호출 대상 객체의 프로퍼티에 접근하는 것 이상의 작업을 수행한다면 빈 괄호를 사용하길 권한다.
   예) 메소드가 I/O 작업을 수행, var 변수를 재할당, 직간접적으로 변경 가능한 객체를 통해
       호출 대상 객체의 필드 외의 var 변수를 읽는 경우

   "hello".length // 부수효과가 없으므로 () 생략
   println() // () 사용하는 편이 더 나음

   스칼라에서는 인자를 받지 않고 부수 효과도 없는 메소드는 괄호를 아예 붙이지 않는
   파라미터 없는 메소드로 정의할 것을 권장한다.
 */
