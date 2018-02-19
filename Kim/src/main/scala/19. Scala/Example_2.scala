/**
  * Created by donghwankim on 2018. 2. 19..
  */

// private를 사용해 주 생성자 숨기기
class Queue[T] private (
                         private val leading: List[T],
                         private val trailing: List[T]
)

/*
scala> new Queue(List(1, 2), List(3))
<console>:6: error: constructor Queue cannot be accessed in
  object $iw
       new Queue(List(1, 2), List(3))
       ^
*/

/*
def this() = this(Nil, Nil)
*/

/*
def this(elems: T*) = this(elems.toList, Nil)
*/

// 동반 객체의 apply 팩토리 메소드
object Queue {
  // constructs a queue with initial elements `xs'
  def apply[T](xs: T*) = new Queue[T](xs.toList, Nil)
}

// 함수형 큐의 타입 추상화
trait Queue[T] {
  def head: T
  def tail: Queue[T]
  def enqueue(x: T): Queue[T]
}

object Queue {

  def apply[T](xs: T*): Queue[T] =
    new QueueImpl[T](xs.toList, Nil)

  private class QueueImpl[T](
                              private val leading: List[T],
                              private val trailing: List[T]
                            ) extends Queue[T] {

    def mirror =
      if (leading.isEmpty)
        new QueueImpl(trailing.reverse, Nil)
      else
        this

    def head: T = mirror.leading.head

    def tail: QueueImpl[T] = {
      val q = mirror
      new QueueImpl(q.leading.tail, q.trailing)
    }

    def enqueue(x: T) =
      new QueueImpl(leading, x :: trailing)
  }
}