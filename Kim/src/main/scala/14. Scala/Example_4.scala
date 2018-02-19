/**
  * Created by donghwankim on 2018. 1. 28..
  */

/*
import junit.framework.TestCase
import junit.framework.Assert.assertEquals
import junit.framework.Assert.fail
import Element.elem

class ElementTestCase extends TestCase {

  def testUniformElement() {
    val ele = elem('x', 2, 3)
    assertEquals(2, ele.width)
    assertEquals(3, ele.height)
    try {
      elem('x', -2, 3)
      fail()
    }
    catch {
      case e: IllegalArgumentException => // 발생하리라 예상
    }
  }
}
*/

// JUnit3Suite로 JUnit 테스트 작성하기
import org.scalatest.junit.JUnit3Suite
import Element.elem

class ElementSuite extends JUnite3Suite {

  def testUniformElement() {
    val ele = elem('x', 2, 3)
    assert(ele.width === 2)
    expect(3) { ele.height }
    intercept[IllegalArgumentException] {
      elem('x', -2, 3)
    }
  }
}

/*
import org.testng.annotations.Test
import org.testng.Assert.assertEquals
import Element.elem

class ElementTest {
  @Test def verifyUniformElement() {
    val ele = elem('x', 2, 3)
    assertEquals(ele.width, 2)
    assertEquals(ele.heigh, 3)
  }
  @Test(
    expectedExceptions =
      Array(classOf[IllegalArgumentException])
  )
  def eleShouldThrowIAE() { elem('x', -2, 3) }
}
 */

// TestNGSuite로 TestNG 테스트 작성하기
import org.scalatest.testng.TestNGSuite
import org.testng.annotations.Test
import Element.elem

class ElementSuite extends TestNGSuite {

  @Test def verifyUniformElemnt() {
    val ele = elem('x', 2, 3)
    assert(ele.width === 2)
    expect(3) { ele.height }
    intercept[IllegalArgumentException] {
      elem('x', -2, 3)
    }
  }
}