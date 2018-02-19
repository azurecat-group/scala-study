/**
  * Created by donghwankim on 2018. 2. 19..
  */

// 반공변 출력 채널
trait OutputChannel[-T] {
  def write(x: T)
}

// Function1의 반공변성과 공변성
trait Function1[-S, +T] {
  def apply(x: S): T
}

// 함수 타입 파라미터의 변성을 보여주는 예
class Publication(val title: String)
class Book(title: String) extends Publication(title)

object Library {
  val books: Set[Book] =
    Set(
      new Book("Programming in Scala"),
      new Book("Walden")
    )
  def printBookList(info: Book => AnyRef) {
    for (book <- books) println(info(book))
  }
}

object Customer extends Application {
  def getTitle(p: Publication): String = p.title
  Library.printBookList(getTitle)
}

/*
Library.printBookList(getTitle)
*/
