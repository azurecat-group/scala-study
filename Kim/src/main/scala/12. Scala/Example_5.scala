/**
  * Created by donghwankim on 2017. 11. 19..
  */

// IntQueue 추상 클래스
abstract class IntQueue {
  def get(): Int
  def put(x: Int)
}

// ArrayBuffer로 구현한 BasicIntQueue
import scala.collection.mutable.ArrayBuffer

class BasicIntQueue extends IntQueue {
  private val buf = new ArrayBuffer[Int]
  def get() = buf.remove(0)
  def put(x: Int) { buf += x }
}

/*
scala> val queue = new BasicIntQueue
queue: BasicIntQueue = BasicIntQueue@24655f

scala> queue.put(10)

scala> queue.put(20)

scala> queue.get()
res9: Int = 10

scala> queue.get()
res10: Int = 20
 */

// '쌓을 수 있는 변경'을 나타내는 Doubling 트레이트
trait Doubling extends IntQueue {
  abstract override def put(x: Int) { super.put(2 * x) }
}

/*
scala> class MyQueue extends BasicIntQueue with Doubling
defined class MyQueue

scala> val queue = new MyQueue
queue: MyQueue = MyQueue@91f017

scala> queue.put(10)
res12: Int = 20
*/

/* new를 이용해 인스턴스를 생성하면서 트레이트 믹스인하기
scala> val queue = new BasicIntQueue with Doubling
queue: BasicIntQueue with Doubling = $anon$1@5fa12d

scala> queue.put(10)

scala> queue.get()
res14: Int = 20
*/

// 쌓을 수 있는 변경 트레이트 Incrementing, Filtering
trait Incrementing extends IntQueue {
  abstract override def put(x: Int) { super.put(x + 1)}
}

trait Filtering extends IntQueue {
  abstract override def put(x: Int) {
    if (x >= 0) super.put(x)
  }
}

/*
scala> val queue = (new BasicIntQueue
           with Incrementing with Filtering)
queue: BasicIntQueue with Incrementin with Filtering...

scala> queue.put(-1); queue.put(0); queue.put(1)

scala> queue.get()
res15: Int = 1

scala> queue.get()
res16: Int = 2
*/

/*
scala> val queue = (new BasicIntQueue
           with Filtering with Incrementing)
queue: BasicIntQueue with Filtering with Incrementing...

scala> queue.put(-1); queue.put(0); queue.put(1)

scala> queue.get()
res17: Int = 0

scala> queue.get()
res18: Int = 1

scala> queue.get()
res19: Int = 2
 */