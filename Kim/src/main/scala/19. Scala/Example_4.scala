/**
  * Created by donghwankim on 2018. 2. 19..
  */

/*
class StrangeIntQueue extends Queue[Int] {
  override def enqueue(x: Int) = {
    println(math.sqrt(x))
    super.enqueue(x)
  }
}
*/

/*
val x: Queue[Any] = new StrangeIntQueue
x.enqueue("abc")
*/

/*
class Queue[+T] {
  def enqueue(x: T) =
   ...
}
*/

/*
Queues.scala:11: error: covariant type T occurs in
contravariant position in type T of value x
  def enqueue(x: T) =
             ^
*/

/*
abstract class Cat[-T, +U] {
  def meow[W-](volume: T-, listener: Cat[U+, T-]-)
    : Cat[Cat[U+, T-]-, U+]+
}
*/
