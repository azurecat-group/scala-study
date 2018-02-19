/**
  * Created by donghwankim on 2018. 1. 28..
  */

// 패키지 객체
// bobsdelights/package.scala 파일
package object bobsdelights {
  def showFruit(fruit: Fruit): Unit = {
    import fruit._
    println(name +"s are"+ color)
  }
}

// PrintMenu.scala 파일
package printmenu
import bobsdelights.Fruits
import bobsdelights.showFruit

object PrintMenu {
  def main(args: Array[String]): Unit = {
    for (fruit <- Fruits.menu) {
      showFruit(fruit)
    }
  }
}