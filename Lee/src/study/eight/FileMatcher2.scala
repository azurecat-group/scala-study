package study.eight

object FileMatcher2 {
    def filesHere = (new java.io.File(".")).listFiles

  def filesMatching(query: String,
      matcher: (String, String) => Boolean) = {
  
    for (file <- filesHere; if matcher(file.getName, query))
      yield file
  }

  def filesEnding(query: String) =
    filesMatching(query, _.endsWith(_))
  
  def filesContaining(query: String) =
    filesMatching(query, _.contains(_))
  
  def filesRegex(query: String) =
    filesMatching(query, _.matches(_))

  def main(args: Array[String]) {
    println(filesHere.toList)
    println(filesEnding("scala").toList)
    println(filesContaining("FileMatcher").toList)
  }
}