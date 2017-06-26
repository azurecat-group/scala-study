/**
  * Created by donghwankim on 2017. 6. 19..
  */
// While 예제

def printArgs(args: Array[String]): Unit = {
  var i = 0
  while (i < args.length) {
    println(args(i))
    i += 1
  }
}

def printArgs2(args: Array[String]): Unit = {
  for (arg <- args)
    println(arg)
}

def printArgs3(args: Array[String]): Unit = {
  args.foreach(println)
}