/**
  * Created by donghwankim on 2018. 1. 28..
  */

// 잎포트 준비가 된 밥의 과일 클래스들
package bobsdelights

abstract class Fruit(
  val name: String,
  val color: String,
)

object Fruits {
  object Apple extends Fruit("apple", "red")
  object Orange extends Fruit("orange", "orange")
  object Pear extends Fruit("pear", "yellowish")
  val menu = List(Apple, Orange, Pear)
}

/*
// Fruit에 간단하게 접근
import bobsdelights.Fruit

// bobsdelights의 모든 멤버에 간단하게 접근
import bobsdelights._

// Fruits의 모든 멤버에 간단하게 접근
import bobsdelights.Fruits._
*/

// 일반 객체(싱글톤이 아닌)의 멤버 임포트
def showFruit(fruit: Fruit) {
  import fruit._
  println(name +"s are"+ color)
}

// 패키지 이름 불러오기
import java.util.regex

class AStarB {
  // java.util.regex.Pattern 접근하기
  val pat = regex.Pattern.compile("a*b")
}

/*
// Fruits 객체에 있는 Apple과 Orange만을 불러온다.
import Fruits.{Apple, Orange}

// Fruits 객체 내부에 있는 두 멤버를 불러온다 그러나 Apple 객체는 McIntosh로 이름을 변경한다
import Fruits.{Apple => McIntosh, Orange}

// SQL Date 클래스를 SDate로 불러온다
import java.sql.{Date => SDate}

// java.sql 패키지를 S로 이름을 바꿔 불러온다.
import java.{sql => s}

// Fruits 객체로 부터 모든 멤버를 불러온다.
import Fruits.{_}

// Fruits 객체의 모든 멤버를 불러오나 Apple의 이름을 McIntosh로 바꾼다.
import Fruits.{Apple => McIntosh,_}

// '<어떤이름> => _' 절은 불러올 이름 중에서 <어떤이름>만 제외하는 효과가 있다.
// Fruits에서 Pear를 제외한 모든 멤버를 불러온다.
import Fruits.{Pear => _, _}

// Notebooks의 모든 멤버와 Apple을 제외한 Fruits의 모든 멤버를 불러온다.
import Notebooks._
import Fruits.{Apple => _, _}
*/