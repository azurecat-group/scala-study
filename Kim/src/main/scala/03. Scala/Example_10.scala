/**
  * Created by donghwankim on 2017. 6. 19..
  */
// 변경 가능한 (mutable) 집합을 만들고 초기화 사용하기

import scala.collection.mutable

val movieSet = Set("Hitch", "Poltergeist")
movieSet += "Shrek"
println(movieSet)