package study.five.ex1

class Rational(n: Int, d: Int) {
  println("Created " + n + "/" + d)
}

object Main {
  def main(args: Array[String]) {
    new Rational(1, 2)
  }
}
