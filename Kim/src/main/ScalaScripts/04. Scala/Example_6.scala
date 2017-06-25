/**
  * Created by donghwankim on 2017. 6. 22..
  */

import ChecksumAccumulator.calculate

object FallWinterSpringSummer extends App {
  for (season <- List("fall", "winter", "spring"))
    println(season +": " + calculate(season))
}
