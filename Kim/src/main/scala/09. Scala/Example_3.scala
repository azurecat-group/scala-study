/**
  * Created by donghwankim on 2017. 7. 26..
  */

def containsNeg(nums: List[Int]): Boolean = {
  var exites = false
  for (num <- nums)
    if (num < 0)
      exites = true
  exites
}

containsNeg(List(1,2,3,4))

containsNeg(List(1,2,-3,4))

/*
scala> containsNeg(List(1,2,3,4))
res0: Boolean = false

scala> containsNeg(List(1,2,-3,4))
res1: Boolean = true
 */

def containsNeg2(nums: List[Int]) = nums.exists(_ < 0)

containsNeg2(Nil)

containsNeg2(List(0, -1, -2))
/*
scala> containsNeg2(Nil)
res2: Boolean = false

scala> containsNeg2(List(0, -1, -2))
res3: Boolean = true
 */

def containsOdd(nums: List[Int]): Boolean = {
  var exists = false
  for (num <- nums)
    if (num % 2 == 1)
      exists =true
  exists
}

def containsOdd2(nums: List[Int]) = nums.exists(_ % 2 == 1)