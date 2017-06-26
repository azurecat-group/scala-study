/**
  * Created by donghwankim on 2017. 6. 22..
  */

val hex = 0x5
val hex2 = 0x00FF
val magic = 0xcafebabe

println(hex)
println(hex2)
println(magic)

/*
val oct = 035 // 스칼라 2.11에서 8진 리터럴은 사용할 수 없다.
val nov = 0777 // 0으로 시작하는 정수 리터럴은 아예 사용 불가능하다.
val dec = 0321 // 스칼라 2.11에서 범위 밖의 값을 넣으면 타입이 맞지않음 (type mismatch)'가 발생함.

println(oct)
println(nov)
println(dec)
*/

val dec1 = 31
val dec2 = 255
val dec3 = 20

println(dec1)
println(dec2)
println(dec3)

val prog = 0XCAFEBABEL
val tower = 35L
val of = 311

println(prog)
println(tower)
println(of)

val litte: Short = 367
val litter: Byte = 38

println(litte)
println(litter)