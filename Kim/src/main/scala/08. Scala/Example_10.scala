/**
  * Created by donghwankim on 2017. 7. 26..
  */

def echo(args: String*) =
  for (arg <- args) println(arg)
/*
scala> def echo(args: String*) =
        for (arg <- args) println(arg)
echo: (args: String*)Unit
 */

echo()
echo("one")
echo("hello", "world!")
/*
scala> echo()
scala> echo("one")
one
scala> echo("hello", "world!")
hello
world!
 */

val arr = Array("Waht's", "up", "doc?")

echo(arr)
/*
scala> val arr = Array("Waht's", "up", "doc?")
arr: Array[java.lang.String] = Array(What's, up, doc?)

scala> echo(arr)
<console>:7: error: type mismatch;
found : Array[java.lnag.String]
required: String
      echo(arr)
           ^
 */

echo(arr: _*)
/*
scala> echo(arr: _*)
What's
up
doc?
 */
