/**
  * Created by donghwankim on 2017. 11. 18..
  */

trait CharSequence {
  def charAt(index: Int): Char
  def length: Int
  def subSequence(start: Int, end: Int): CharSequence
  def toString(): String
}
