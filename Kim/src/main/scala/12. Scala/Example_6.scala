/**
  * Created by donghwankim on 2017. 11. 19..
  */

/* 다중 상속에 대한 실험
val q = new BasicIntQueue with Incrementing with Doubling
q.put(42)
*/

/* 다중 상속에 대한 사고 실험
trait MyQueue extends BasicIntQueue
    with Incrementing with Doubling {

  def put(x: Int) {
    Incrementing.super.put(x) // (스칼라 코드 아님)
    Doubling.super.put(x)
  }
}
*/

class Animal
trait Furry extends Animal
trait HasLegs extends Animal
trait  FourLegged extends HasLegs
class Cat extends Animal with Furry with FourLegged