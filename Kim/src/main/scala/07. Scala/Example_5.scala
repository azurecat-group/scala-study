/**
  * Created by donghwankim on 2017. 7. 6..
  */

def greet() {println("hi")}

greet() == ()

/*
var line = ""
while ((line = readLine()) != "") // scala에 경우 해당 부분에서 에러가 발생함.
//이유는 Unit 타입과 문자열은 같을수가 없기 때문입니다
  println("Read: " + line)
 */