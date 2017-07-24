/**
  * Created by donghwankim on 2017. 6. 22..
  */

val a = 'A'
val c ='\101'

println(a)
println(c)

val d = '\u0041' // scala 2.11에서는 8진 문자 리터럴은 사용금지.
val f = '\u0044'

println(d)
println(f)

val B\u0041\u0044 = 1

println(BAD)

val backslash = '\\'

println(backslash)