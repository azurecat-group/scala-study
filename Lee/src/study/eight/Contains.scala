package study.eight

object Contains {
    /*
   	* 고차 함수를 사용하기 전 containsNeg의 함수
  	def containsNeg(nums: List[Int]): Boolean = {
    		var exists = false
    		for (num <- nums)
      		if (num < 0)
        			exists = true
      	exists
	}
  	*/

    def containsNeg(nums: List[Int]) = nums.exists(_ < 0)

    /*
     * 고차 함수를 사용하기 전 containsOdd의 함수
    def containsOdd(nums: List[Int]): Boolean = {
        var exists = false
        for (num <- nums)
            if (num % 2 == 1)
                exists = true
        exists
    }
    */

    def containsOdd(nums: List[Int]) = nums.exists(_ % 2 == 1)

    def main(args: Array[String]) {
        println(containsNeg(Nil))
        println(containsNeg(List(0, -1, -2)))
        println(containsOdd(List(2, 3, 1)))
    }
}