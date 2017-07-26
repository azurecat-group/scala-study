/**
  * Created by donghwankim on 2017. 7. 27..
  */

def twice(op: Double => Double, x: Double) = op(op(x))

twice(_ + 1, 5)
/*
scala> def twice(op: Double => Double, x: Double) = op(op(x))
twice: (op: (Double) => Double,x: Double)Double

scala> twice(_ + 1, 5)
res9: Double = 7.0
 */

import java.io.{File, PrintWriter}

def withPrintWriter(file: File, op: PrintWriter => Unit) {
  val writer = new PrintWriter(file)
  try {
    op(writer)
  } finally {
    writer.close()
  }
}

withPrintWriter(
  new File("date.txt"),
  writer => writer.println(new java.util.Date)
)

println("Hello, world!")
/*
scala> println("Hello, world!")
Hello, world!
 */

println{"Hello, world!"}
/*
scala> println{"Hello, world!"}
Hello, world!
 */

val g = "Hello, world!"
/*
scala> val g = "Hello, world!"
g: java.lang.String = Hello, world!

scala> g.substring { 7, 9 }
<console>:1: error: ';' expected but ',' found.
        g.substring { 7, 9 }
                       ^
 */

g.substring(7, 9)
/*
scala> g.substring(7, 9)
res12: java.alng.String = wo
 */



