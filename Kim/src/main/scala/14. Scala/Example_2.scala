/**
  * Created by donghwankim on 2018. 1. 28..
  */

// Suite를 확장해 테스트 메소드 작성하기
import org.scalatest.Suite
import Element.elem

class ElementSuite extends Suite {

  def testUniformElement() {
    val ele = elem('x', 2, 3)
    assert(ele.width == 2)
  }
}

/*
scala> (new ElementSuite).execute()
Test Starting - ElementSuite.testUniformElement
Test Succeeded - ElementSuite.testUniformElement
*/

// FunSuite로 테스트 함수 작성하기
import org.scalatest.FunSuite
import Element.elem

class ElementSuite extends FunSuite {
  test("elem result should have passed width") {
    val ele = elem('x', 2, 3)
    assert(ele.width == 2)
  }
}