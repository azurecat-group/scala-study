object IteratorDemo {
  def main(args: Array[String]): Unit = {
    // case 1: args.foreach(arg => println(arg))
    // case 2: args.foreach((arg: String) => println(arg))
    // case 3 args.foreach(println)
    
    // case 4
    for (arg <- args)
      println(arg)
      
      //모두 다 같은 결과를 표현함, 단 case 2번의 경우 문자열이 강제됨
  }
}