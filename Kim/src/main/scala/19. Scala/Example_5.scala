/**
  * Created by donghwankim on 2018. 2. 19..
  */

// 하위 바운드가 있는 타입 파라미터
class Queue[+T] (private val leading: List[T],
                 private val trailing: List[T] ) {
  def enqueue[U >: T](x: U) =
    new Queue[U](leading, x :: trailing) // ...
}