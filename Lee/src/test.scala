object test {
  def main(args: Array[String]): Unit = {
    var test = Map(
        "testkey1" -> "value", "testkey2" -> "value2",
        "testkey3" -> "value3", "testkey4" -> "value4",
        "testkey5" -> "value5"
        )
        
    for (i <- test) {
      println(i)
    }
  }
}