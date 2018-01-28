/**
  * Created by donghwankim on 2017. 11. 18..
  */

// Philosophical 트레이트 정의
trait Philosophical
  def Philosophize() {
    println("I consume memory, therefore I am!")
  }
}

// extends 키워드를 이용해 트레이트를 믹스인한 클래스
class Frog extends Philosophical {
  override def toString = "green"
}

/*
scala> val frog = new Frog
frog: Frog = green

scala> frog.philosophize()
I consume memory, therefore I am!
*/

/*
scala> val phil: Philosophical = frog
phil: Philosophical = green

scala> phil.Philosophize()
I consume memory, therefore I am!
*/

/* with를 이용한 트레이트 믹스인
class Animal

class Frog extends Animal with Philosophical {
  override def toString = "green"
}
*/

/* 여러 트레이트의 믹스인
class Animal
trait HasLegs

class Frog extends Animal with Philosophical with HasLegs {
  override def toString = "green"
}
*/

/*
class Animal

class Frog extends Animal with Philosophical {
  override def toString = "green"
  override def philosophize() {
    println("It ain't easy being "+ toString +"!")
    }
}
*/

/*
scala> val phrog: Philosophical = new Frog
phrog: Philosophical = green

scala> phrog.Philosophize()
It ain't easy being green!
*/

class Point(x: Int, y: Int)

trait NoPoint(x: Int, y: Int) // 컴파일 할 수 없다.