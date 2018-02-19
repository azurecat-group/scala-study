/**
  * Created by donghwankim on 2018. 2. 19..
  */

/*
(1, "hello", Console)
*/

/*
def longestWord(words: Array[String]) = {
  var word = words(0)
  var idx = 0
  for (i <- 1 until words.length)
    if (words(i).length > word.length) {
      word = words(i)
      idx = i
    }
  (word, idx)
}
*/

/*
scala> val longest =
     |   longestWord("The quick brown fox".split(" "))
longest: (String, Int) = (quick,1)
*/

/*
scala> longest._1
res53: String = quick

scala> longest._2
res54: Int = 1
*/

/*
scala> val (word, idx) = longest
word: String = quick
idx: Int = 1

scala> word
res55: String = quick
*/

/*
scala> val word, idx = longest
word: (String, Int) = (quick,1)
idx: (String, Int) = (quick,1)
*/