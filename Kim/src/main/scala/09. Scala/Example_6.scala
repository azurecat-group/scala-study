import java.io.{File, PrintWriter}

/**
  * Created by donghwankim on 2017. 7. 27..
  */

def withPrintWriter(file: File)(op: PrintWriter => Unit): Unit = {
  val writer = new PrintWriter(file)
  try {
    op(writer)
  } finally {
    writer.close()
  }
}

val file = new File("data.txt")

withPrintWriter(file) {
  writer => writer.println(new java.util.Date)
}