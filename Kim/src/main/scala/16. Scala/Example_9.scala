/**
  * Created by donghwankim on 2018. 1. 31..
  */

/*
scala> (List(10, 20), List(3, 4, 5)).zipped.map(_ * _)
res63: List[Int] = List(30, 80)
*/

/*
scala> (List("abc", "de"), List(3, 2)).zipped.
     \|   forall(_.length == _)
res64: Boolean = true

scala> (List("abc", "de"), List(3, 2)).zipped.
     \|   exists(_.length != _)
res65: Boolean = false
*/