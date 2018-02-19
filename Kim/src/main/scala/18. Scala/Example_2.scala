/**
  * Created by donghwankim on 2018. 2. 19..
  */

/*
var hour = 12
*/

// 공개 var가 있는 클래스
class Time {
  var hour = 12
  var minute = 0
}

// 공개 var가 게터와 세터 메소드로 어떻게 확장되는지 보여주는 예
class Time {

  private[this] var h = 12
  private[this] var m = 0

  def hour: Int = h
  def hour_=(x: Int) { h = x }

  def minute: Int = m
  def minute_=(x: Int) { m = x }
}

// 게터와 세터를 직접 정의하기
class Time {

  private[this] var h = 12
  private[this] var m = 0

  def hour: Int = h
  def hour_= (x: Int) {
    require(0 <= x && x < 24)
    h = x
  }

  def minute = m
  def minute_= (x: Int) {
    require(0 <= x && x < 60)
    m = x
  }
}

// 연관된 필드 없이 게터나 세터 정의하기
class Thermometer {

  var celsius: Float = _

  def fahrenheit = celsius * 9 / 5 + 32
  def fahrenheit_= (f: Float) {
    celsius = (f - 32) * 5 / 9
  }
  override def toString = fahrenheit +"F/"+ celsius +"C"
}

/*
var celsius: Float
*/

/*
scala> val t = new Thermometer
t: Thermometer = 32.0F/0.0C

scala> t.celsius = 100

scala> t
res3: Thermometer = 212.0F/100.0C

scala> t.fahrenheit = -40

scala> t
res4: Thermometer = -40.0F/-40.0C
*/