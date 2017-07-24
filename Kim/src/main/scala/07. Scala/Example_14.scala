/**
  * Created by donghwankim on 2017. 7. 6..
  */

val fileHere = (new java.io.File(".").listFiles)

def fileLines(file: java.io.File) =
  scala.io.Source.fromFile(file).getLines().toList

val forLineLengths =
  for {
    file <- fileHere
    if file.getName.endsWith(".scala")
    line <- fileLines(file)
    trimmed = line.trim
    if trimmed.matches(".*for.*")
  } yield trimmed.length
