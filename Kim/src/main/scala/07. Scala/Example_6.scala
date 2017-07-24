/**
  * Created by donghwankim on 2017. 7. 6..
  */

def gcd(x: Long, y: Long): Long =
  if (y == 0) x else gcd(y, x % y)