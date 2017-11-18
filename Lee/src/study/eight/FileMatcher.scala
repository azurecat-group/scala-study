package study.eight

object FileMatcher {
    private def filesHere = (new java.io.File(".")).listFiles

    def filesEnding(query: String) =
        for (file <- filesHere; if file.getName.endsWith(query))
            yield file
        
    def filesContaining(query: String) =
        for (file <- filesHere; if file.getName.contains(query))
          yield file

    def filesRegex(query: String) =
      for (file <- filesHere; if file.getName.matches(query))
        yield file
    
    def main(args: Array[String]) {
      println(filesEnding("scala").toList)
      println(filesContaining("FileMatcher2").toList)
      println(filesRegex(".*Re.ex.*").toList)
    }
}