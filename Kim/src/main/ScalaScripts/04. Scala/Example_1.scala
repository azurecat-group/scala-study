/**
  * Created by donghwankim on 2017. 6. 22..
  */

class ChecksumAccumulator1 {
  var sum = 0
}

val acc = new ChecksumAccumulator
val csa = new ChecksumAccumulator

println("acc : " + acc.sum)
println("cas : " + csa.sum)

acc.sum = 3

println("acc : " + acc.sum)
println("cas : " + csa.sum)