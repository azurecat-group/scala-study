/**
  * Created by donghwankim on 2017. 11. 19..
  */

class Point(val x: Int, val y: Int)

class Rectangle(val topLeft: Point, val bottomRight: Point) {
  def left = topLeft.x
  def right = bottomRight.x
  def width = right - left
  // 여러 기하 관련 메소드
}

abstract class Component {
  def topLeft: Point
  def bottomRight: Point

  def left = topLeft.x
  def right = bottomRight.x
  def width = right - left
  // 여러 기하 관련 메소드...
}

trait Rectangular {
  def topLeft: Point
  def bottomRight: Point

  def left = topLeft.x
  def right = bottomRight.x
  def width = right - left
  // 여러 기하 관련 메소드
}

/*
abstract class Component extends Rectangular {
  // 기타 메소드
}

class Rectangle(val topLeft: Point, val bottomRight: Point)
  extends Rectangular {
    // 기타 메소드
}
 */

/*
scala> val rect = new Rectangle(new Point(1, 1),
           new Point(10, 10))
rect: Rectangle = Rectangle@3536fd

scala> rect.left
res2: Int = 1

scala> rect.right
res3: Int = 10

scala> rect.width
res4: Int = 9
 */

