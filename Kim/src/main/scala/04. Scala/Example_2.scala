/**
  * Created by donghwankim on 2017. 6. 22..
  */

class ChecksumAccumulator2 {
  private var sum = 0
  def add(b: Byte): Unit = {
    sum += b
  }
  def checksum(): Int = {
    return ~(sum & 0xFF) + 1
  }
}

class ChecksumAccumulator3 {
  private var sum = 0
  def add(b: Byte) { sum += b }
  def checksum(): Int = ~(sum & 0xFF) + 1
}