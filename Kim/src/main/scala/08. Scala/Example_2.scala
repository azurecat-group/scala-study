/**
  * Created by donghwankim on 2017. 7. 9..
  */

import scala.io.Source

def processFile(filename: String, width: Int): Unit = {
  def processLine(filename: String, width: Int, line: String): Unit = {
    if (line.length > width)
      println(filename + ": " + line)
  }

  val source = Source.fromFile(filename)
  for (line <- source.getLines()) {
    processLine(filename, width, line)
  }
}
