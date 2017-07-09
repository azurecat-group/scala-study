/**
  * Created by donghwankim on 2017. 7. 9..
  */
import scala.io.Source

object LongLines {

  def processFile(filename: String, width: Int): Unit = {
    val source = source.fromFile(filename)
    for (line <- source.getLines())
  }
  private def processLine(filename: String, width: Int, line: String): Unit = {
    if (line.length > width)
      println(filename + ": " + line.trim)
  }
}

object FindLongLines {
  def main(args: Array[String]): Unit = {
    val width = args(0).toInt
    for (arg <- args.drop(1))
      LongLines.processFile(arg, width)
  }
}