/**
  * Created by donghwankim on 2017. 7. 6..
  */

val fileHere = (new java.io.File(".").listFiles)

def scalaFiles =
  for {
    file <- fileHere
    if file.getName.endsWith(".scala")
  } yield  file