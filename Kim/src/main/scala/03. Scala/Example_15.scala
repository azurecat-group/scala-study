/**
  * Created by donghwankim on 2017. 6. 19..
  */

def formatArgs(args: Array[String]) = args.mkString("\n")

println(formatArgs(args))

val res = formatArgs(Array("zero", "one", "two"))
assert(res == "zero\none\ntwo")