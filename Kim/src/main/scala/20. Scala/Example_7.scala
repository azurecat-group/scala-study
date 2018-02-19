/**
  * Created by donghwankim on 2018. 2. 19..
  */

/*
class DogFood extends Food
class Dog extends Animal {
  type SuitableFood = DogFood
  override def eat(food: DogFood) {}
}
*/

/*
scala> val bessy = new Cow
bessy: Cow = Cow@e7bbeb

scala> val lassie = new Dog
lassie: Dog = Dog@ce38f1

scala> lassie eat (new bessy.SuitableFood)
<console>:14: error: type mismatch;
 found   : Grass
 required: DogFood
       lassie eat (new bessy.SuitableFood)
                   ^
*/

/*
scala> val bootsie = new Dog
bootsie: Dog = Dog@66db21

scala> lassie eat (new bootsie.SuitableFood)
*/

/*
class Outer {
  class Inner
}
*/

/*
val o1 = new Outer
val o2 = new Outer
*/

/*
scala> new o1.Inner
res11: o1.Inner = Outer$Inner@1df6ed6
*/

/*
scala> new Outer#Inner
<console>:7: error: Outer is not a legal prefix for
  a constructor
       new Outer#Inner
                 ^
*/