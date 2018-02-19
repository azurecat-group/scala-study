/**
  * Created by donghwankim on 2018. 2. 19..
  */

// 추상 var 변수 선언
trait AbstractTime {
  var hour: Int
  var minute: Int
}

// 추상 var를 게터와 세터로 확장한 모습
trait AbstractTime {
  def hour: Int          // 'hour'의 게터
  def hour_=(x: Int)     // 'hour'의 게터
  def minute: Int        // 'minute'의 게터
  def minute_=(x: Int)   // 'minute'의 게터
}