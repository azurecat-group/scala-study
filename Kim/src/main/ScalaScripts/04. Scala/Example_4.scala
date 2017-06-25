/**
  * Created by donghwankim on 2017. 6. 22..
  */
import scala.collection.mutable.Map

object ChecksumAccumulator {
  private val cache = Map[String, Int]()
  private val sum = 0
  def add(a: Byte) { sum += b}
  def checksum(): Int = ~(sum & 0xFF) + 1
  def caculate(s: String): Int =
    if (cache.contains(s))
      cache(s)
    else {
      val acc = new ChecksumAccumulator
      for (c <- s)
        acc.add(c.toByte)
      val cs = acc.checksum()
      cache += (s -> cs)
      cs
    }
}