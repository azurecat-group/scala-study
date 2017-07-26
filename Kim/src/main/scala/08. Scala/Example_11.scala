/**
  * Created by donghwankim on 2017. 7. 26..
  */

def speed(distance: Float, time: Float): Float =
  distance / time
speed(100, 10)
/*
scala> def speed(distance: Float, time: Float): Float =
        distance / time
speed: (distance: Float,time: Float)Float
scala> speed(100, 10)
res28: Float= 10.0
*/

speed(distance =  10, time = 10)
/*
scala> speed(distance =  10, time = 10)
res29: Float = 10.0
 */

speed(time = 10, distance = 100)
/*
scala> speed(time = 10, distance = 100)
res30: Float = 10.0
 */