/**
  * Created by donghwankim on 2017. 7. 6..
  */
/* 자바 코드
int i = 0;
boolean foundIt = false;

while (i < args.length) {
  if (args[i].startsWith("-")) {
    i = i + 1;
    countinue;
    }
  if (args[i].endsWith(".scala")) {
    foundIt = true;
    break;
    }
  }
  i = i + 1;
}
*/

// 스칼라 코드
var i = 0
var foundIt = false

while (i < args.length && !foundIt) {
  if (!args(i).startsWith("-")) {
    if(args(i).endsWith(".scala"))
      foundIt = true
  }
  i = i + 1
}
