package study.two

import scala.io.Source

object countchars1 {
  def main(args: Array[String]): Unit = {
    if (args.length > 0) {
  
    for (line <- Source.fromFile(args(0)).getLines())
      println(line.length + " " + line)
  }
  else
    Console.err.println("Please enter filename")
  }
}