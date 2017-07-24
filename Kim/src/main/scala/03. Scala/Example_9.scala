/**
  * Created by donghwankim on 2017. 6. 19..
  */
// 변경 불가능한 (immutable) 집합을 만들고, 초기화하고, 사용하기

var jetSet = Set("Boeing", "Airbus")
jetSet += "Lear"
println(jetSet.contains("Cessna"))