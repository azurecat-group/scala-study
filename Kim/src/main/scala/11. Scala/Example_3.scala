/**
  * Created by donghwankim on 2017. 11. 18..
  */

/*
scala> val i: Int = null
<console>:4: error: type msimatch;
 found  : Null(null)
 required: Int
 */

def error(message: String): Nothing =
  throw new RuntimeException(message)

def divied(x: Int, y: Int): Int =
  if (y != 0) x / y
  else error("can't divide by zero")