/**
  * Created by donghwankim on 2017. 6. 26..
  */

1 > 2

1 < 2

1.0 <= 1.0

3.5f >= 3.6f

'a' >= 'A'

val thisIsBoring = !true

!thisIsBoring

val toBe = true

val question = toBe || !toBe // 논리합 (or)

val paradox = toBe && !toBe // 논리곱 (and)

def salt() = { println("salt"); false }

def pepper() = { println("pepper"); true }

// 쇼트 서킷

pepper() && salt() // pepper, salt 호출

salt() && pepper() // salt 만 호출