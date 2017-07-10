/**
  * Created by donghwankim on 2017. 7. 6..
  */

def gcdLoop(x: Long, y: Long): Long = {
  var a = x
  var b = y

  while ( a != 0) {
    val temp = a
    b = b%a
    b = temp
  }
  b
}
