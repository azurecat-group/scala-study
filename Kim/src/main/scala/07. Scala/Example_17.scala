/**
  * Created by donghwankim on 2017. 7. 6..
  */

import java.io.FileReader

val file = new FileReader("input.txt")
try {
  // 파일을 사용한다.
} finally {
  file.close() // 파일을 확실하게 닫는다.
}
