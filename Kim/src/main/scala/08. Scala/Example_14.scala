/**
  * Created by donghwankim on 2017. 7. 26..
  */

// 재귀 호출 후에 연산을 수행하면 꼬리 재귀가 아님
def boom(x: Int): Int =
  if (x == 0) throw new Exception("boom!")
  else boom(x - 1) + 1

boom(3)
/*
scala> boom(3)
java.lang.Exception: boom!
      at .boom(<console>:5)
      at .boom(<console>:6)
      at .boom(<console>:6)
      at .boom(<console>:6)
      at .<init>(<console>:6)
 */

def bang(x: Int): Int =
  if (x == 0) throw new Exception("bang!")
  else bang(x - 1)

bang(5)
/*
scala> bang(5)
java.lang.Exception: bang!
      at .bang(<console>:5)
      at .<init>(<console>:6) ...
 */

-g:notailcalls // 꼬리 재귀 최적화 사용안함

bang(5)
/*
scala> bang(5)
java.lang.Exception: bang!
      at .bang(<console>:5)
      at .bang(<console>:5)
      at .bang(<console>:5)
      at .bang(<console>:5)
      at .bang(<console>:5)
      at .<init>(<console>:6) ...
 */