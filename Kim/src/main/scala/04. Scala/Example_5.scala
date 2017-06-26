/**
  * Created by donghwankim on 2017. 6. 22..
  */

import ChecksumAccumulator.calculate

object Summer {
  def main(args: Array[String]): Unit = {
    for (arg <- args)
      println(arg + ":" + calculate(arg))
  }
}