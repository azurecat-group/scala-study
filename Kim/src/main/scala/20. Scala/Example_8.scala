/**
  * Created by donghwankim on 2018. 2. 19..
  */

/*
Animal { type SuitableFood = Grass }
*/

/*
class Pasture {
  var animals: List[Animal { type SuitableFood = Grass }] = Nil
  // ...
}
*/

/*
using(new PrintWriter("date.txt")) { writer =>
  writer.println(new Date)
}
*/

/*
using(serverSocket.accept()) { socket =>
  socket.getOutputStream().write("hello, world\n".getBytes)
}
*/

/*
  def using[T, S](obj: T)(operation: T => S) = {
    val result = operation(obj)
    obj.close()  // 타입 오류!
    result
  }
*/

/*
def using[T <: { def close(): Unit }, S](obj: T)
    (operation: T => S) = {
  val result = operation(obj)
  obj.close()
  result
}
*/