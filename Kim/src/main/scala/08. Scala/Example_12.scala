/**
  * Created by donghwankim on 2017. 7. 26..
  */

def printTime(out: java.io.PrintStream = Console.out) =
  out.println("time = " + System.currentTimeMillis())

def printTime2(out: java.io.PrintStream = Console.out, divisor: Int = 1) =
  out.println("time = " + System.currentTimeMillis()/divisor)

printTime2(out = Console.err)
printTime2(divisor = 1000)