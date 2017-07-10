/**
  * Created by donghwankim on 2017. 7. 6..
  */

import java.io.FileReader
import java.io.FileNotFoundException
import java.io.IOException

try {
  val f = new FileReader("input.txt") // 파일을 사용하고 닫는다.
} catch {
  case ex: FileNotFoundException =>
  case ex: IOException =>
}
