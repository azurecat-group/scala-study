/**
  * Created by donghwankim on 2017. 6. 19..
  */
// 변경이 불가능한 (immutable) HashSet 을 만들고, 초기화하고, 사용하기

import scala.collection.immutable.HashSet

val hashSet = HashSet("Tomatoes", "chilies")
println(hashSet + "Coriander")