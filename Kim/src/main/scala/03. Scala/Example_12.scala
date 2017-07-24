/**
  * Created by donghwankim on 2017. 6. 19..
  */
// 변경이 가능한 (mutable) 맵을 만들고 초기화하고, 사용하기

import scala.collection.mutable.Map

val treasureMap = Map[Int, String]()
treasureMap += (1 -> "Go to island.")
treasureMap += (2 -> "Find big X on ground.")
treasureMap += (3 -> "Dig.")
println(treasureMap(2))
