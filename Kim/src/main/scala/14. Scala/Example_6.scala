/**
  * Created by donghwankim on 2018. 1. 28..
  */

// ScalaCheck로 프로퍼티 기반 테스트 작성하기
import org.scalatest.WordSpec
import org.scalatest.prop.Checkers
import org.scalacheck.Prop._
import Element.elem

class ElementSpec extends WordSpec with Checkers {

  "elem result" must {
    "have passed width" in {
      check((w: Int) => w > 0 ==> (elem('x', w, 3).width == w))
    }
    "have passed height" in {
      check((h: Int) => h > 0 ==> (elem('x', 2, h).height == h))
    }
  }
}

/*
w > 0 ==> (elem('x', w, 3).width == w)
 */