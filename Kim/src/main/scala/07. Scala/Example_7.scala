/**
  * Created by donghwankim on 2017. 7. 6..
  */

val fileHere = (new java.io.File(".")).listFiles

for (file <- fileHere)
  println(file)

/* 스칼라에서는 일반적이지 않다.
val fileHere = (new java.io.File(".")).listFiles

for (i <- 0 to filesHere.length -1)
  println(filesHere(i))
 */