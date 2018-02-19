/**
  * Created by donghwankim on 2018. 2. 19..
  */

// Ordered 트레이트를 혼합하는 Person 클래스
class Person(val firstName: String, val lastName: String)
  extends Ordered[Person] {

  def compare(that: Person) = {
    val lastNameComparison =
      lastName.compareToIgnoreCase(that.lastName)
    if (lastNameComparison != 0)
      lastNameComparison
    else
      firstName.compareToIgnoreCase(that.firstName)
  }

  override def toString = firstName +" "+ lastName
}

/*
scala> val robert = new Person("Robert", "Jones")
robert: Person = Robert Jones

scala> val sally = new Person("Sally", "Smith")
sally: Person = Sally Smith

scala> robert < sally
res0: Boolean = true
*/

// 상위 바운드를 사용한 병합 정렬
def orderedMergeSort[T <: Ordered[T]](xs: List[T]): List[T] = {
  def merge(xs: List[T], ys: List[T]): List[T] =
    (xs, ys) match {
      case (Nil, _) => ys
      case (_, Nil) => xs
      case (x :: xs1, y :: ys1) =>
        if (x < y) x :: merge(xs1, ys)
        else y :: merge(xs, ys1)
    }
  val n = xs.length / 2
  if (n == 0) xs
  else {
    val (ys, zs) = xs splitAt n
    merge(orderedMergeSort(ys), orderedMergeSort(zs))
  }
}

/*
scala> val people = List(
     |   new Person("Larry", "Wall"),
     |   new Person("Anders", "Hejlsberg"),
     |   new Person("Guido", "van Rossum"),
     |   new Person("Alan", "Kay"),
     |   new Person("Yukihiro", "Matsumoto")
     | )
people: List[Person] = List(Larry Wall, Anders Hejlsberg,
  Guido van Rossum, Alan Kay, Yukihiro Matsumoto)
*/

/*
scala> val sortedPeople = orderedMergeSort(people)
sortedPeople: List[Person] = List(Anders Hejlsberg, Alan Kay,
  Yukihiro Matsumoto, Guido van Rossum, Larry Wall)
*/

/*
scala> val wontCompile = orderedMergeSort(List(3, 2, 1))
<console>:5: error: inferred type arguments [Int] do
   not conform to method orderedMergeSort's type
     parameter bounds [T <: Ordered[T]]
       val wontCompile = orderedMergeSort(List(3, 2, 1))
                         ^
*/