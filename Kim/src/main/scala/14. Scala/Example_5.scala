/**
  * Created by donghwankim on 2018. 1. 28..
  */

// ScalaTest의 FlatSpec을 사용한 동작 명시와 테스트
import org.scalatest.FlatSpec
import org.scalatest.Matchers
import Element.elem

class ElementSpec extends FlatSpec with Matchers {

  "A UniformElement" should
    "have a width equal to the passed value" in {
    val ele = elem('x', 2, 3)
    ele.width should be (2)
  }

  it should "have a height equal to the passed value" in {
    val ele = elem('x', 2, 3)
    ele.height should be (3)
  }

  it should "throw an IAE if passed a negative width" in {
    an [IllegalArgumentException] should be thrownBy {
      elem('x', -2, 3)
    }
  }
}

/*
scala> (new ElementSpec).execute()
A UniformElement
- should have a width equal to the passed value
- should have a height equal to the passed value
- should throw an IAE if passed a negative width
 */

/*
result must be >= 0
map must contain key 'c'
 */

/*
Map('a' -> 1, 'b' -> 2) did not contain key 'c'
 */

// specs 프레임워크로 동작을 명세화하고 테스트하기
import org.specs._
import Element.elem

object ElementSpecification extends Specification {
  "A UniformElement" should {
    "have a width equal to the passed value" in {
      val ele = elem('x', 2, 3)
      ele.width must be_==(2)
    }
    "have a height equal to the passed value" in {
      val ele = elem('x', 2, 3)
      ele.height must be_==(3)
    }
    "throw an IAE if passed a negative width" in {
      elem('x', -2, 3) must
        throwA[IllegalArgumentException]
    }
  }
}
