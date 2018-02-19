/**
  * Created by donghwankim on 2018. 1. 28..
  */

// 단언문의 사용
def above(that: Element): Element = {
  val this1 = this widen that.width
  val that1 = that widen this.widht
  assert(this1.width == that1.width)
  elem(this.contents ++ that1.contents)
}

// ensuring을 사용해 함수의 결과 확인하기
private def widen(w: Int): Element =
  if (w <= width)
    this
  else {
    val left = elem(' ', (w - width) / 2, height)
    val right = elem(' ', w - width) - left.width, height)
    left beside this beside right
  } ensuring (w <= _.width)