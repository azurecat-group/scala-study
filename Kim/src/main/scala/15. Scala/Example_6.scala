/**
  * Created by donghwankim on 2018. 1. 31..
  */

/*
scala> val capitals =
     |   Map("France" -> "Paris", "Japan" -> "Tokyo")
capitals: scala.collection.immutable.Map[java.lang.String,
java.lang.String] = Map(France -> Paris, Japan -> Tokyo)

scala> capitals get "France"
res23: Option[java.lang.String] = Some(Paris)

scala> capitals get "North Pole"
res24: Option[java.lang.String] = None
*/

/*
scala> def show(x: Option[String]) = x match {
     |   case Some(s) => s
     |   case None => "?"
     | }
show: (x: Option[String])String

scala> show(capitals get "Japan")
res25: String = Tokyo

scala> show(capitals get "France")
res26: String = Paris

scala> show(capitals get "North Pole")
res27: String = ?
*/