/**
  * Created by donghwankim on 2018. 2. 19..
  */

/*
class Food
abstract class Animal {
  def eat(food: Food)
}
*/

/*
class Grass extends Food
class Cow extends Animal {
  override def eat(food: Grass) {} // This won't compile
}
*/

/*
BuggyAnimals.scala:7: error: class Cow needs to be
abstract, since method eat in class Animal of type
    (Food)Unit is not defined
class Cow extends Animal {
      ^
BuggyAnimals.scala:8: error: method eat overrides nothing
  override def eat(food: Grass) {}
               ^
*/

/*
class Food
abstract class Animal {
  def eat(food: Food)
}
class Grass extends Food
class Cow extends Animal {
  override def eat(food: Grass) {} // 컴파일할 수 없다.
}                                  // 하지만, 만약 컴파일할 수 있다면...
class Fish extends Food
val bessy: Animal = new Cow
bessy eat (new Fish)     // ... 물고기를 소에게 먹일 수 있었을 것이다.
*/

// 음식을 추상 타입으로 더 잘 모델링하기
class Food
abstract class Animal {
  type SuitableFood <: Food
  def eat(food: SuitableFood)
}

// 서브클래스에서의 추상 타입 구현
class Grass extends Food
class Cow extends Animal {
  type SuitableFood = Grass
  override def eat(food: Grass) {}
}

/*
scala> class Fish extends Food
defined class Fish

scala> val bessy: Animal = new Cow
bessy: Animal = Cow@2e3919

scala> bessy eat (new Fish)
<console>:12: error: type mismatch;
 found   : Fish
 required: bessy.SuitableFood
       bessy eat (new Fish)
                  ^
*/