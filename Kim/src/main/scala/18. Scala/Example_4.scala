/**
  * Created by donghwankim on 2018. 2. 19..
  */

/*
val a = new Wire
val b = new Wire
val c = new Wire
*/

/*
val a, b, c = new Wire
*/

/*
def inverter(input: Wire, output: Wire)
def andGate(a1: Wire, a2: Wire, output: Wire)
def orGate(o1: Wire, o2: Wire, output: Wire)
*/

// 반가산기를 구현한 halfAdder 메소드
def halfAdder(a: Wire, b: Wire, s: Wire, c: Wire) {
  val d, e = new Wire
  orGate(a, b, d)
  andGate(a, b, c)
  inverter(c, e)
  andGate(d, e, s)
}

// 전가산기를 구현한 fullAdder 메소드
def fullAdder(a: Wire, b: Wire, cin: Wire,
              sum: Wire, cout: Wire) {

  val s, c1, c2 = new Wire
  halfAdder(a, cin, s, c1)
  halfAdder(b, s, sum, c2)
  orGate(c1, c2, cout)
}
