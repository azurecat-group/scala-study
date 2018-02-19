/**
  * Created by donghwankim on 2018. 2. 19..
  */

// BasicCircuitSimulation 클래스의 앞부분
package org.stairwaybook.simulation

abstract class BasicCircuitSimulation extends Simulation {

  def InverterDelay: Int
  def AndGateDelay: Int
  def OrGateDelay: Int

  class Wire {

    private var sigVal = false
    private var actions: List[Action] = List()

    def getSignal = sigVal

    def setSignal(s: Boolean) =
      if (s != sigVal) {
        sigVal = s
        actions foreach (_ ())
      }

    def addAction(a: Action) = {
      actions = a :: actions
      a()
    }
  }

  def inverter(input: Wire, output: Wire) = {
    def invertAction() {
      val inputSig = input.getSignal
      afterDelay(InverterDelay) {
        output setSignal !inputSig
      }
    }
    input addAction invertAction
  }
  // 리스트 18.10에서 계속 이어나감...

// BasicCircuitSimulation 클래스의 뒷부분
// 리스트 18.9로부터 이어짐...
def andGate(a1: Wire, a2: Wire, output: Wire) = {
  def andAction() = {
    val a1Sig = a1.getSignal
    val a2Sig = a2.getSignal
    afterDelay(AndGateDelay) {
      output setSignal (a1Sig & a2Sig)
    }
  }
  a1 addAction andAction
  a2 addAction andAction
}

  def orGate(o1: Wire, o2: Wire, output: Wire) {
    def orAction() {
      val o1Sig = o1.getSignal
      val o2Sig = o2.getSignal
      afterDelay(OrGateDelay) {
        output setSignal (o1Sig | o2Sig)
      }
    }
    o1 addAction orAction
    o2 addAction orAction
  }

  def probe(name: String, wire: Wire) {
    def probeAction() {
      println(name +" "+ currentTime +
        " new-value = "+ wire.getSignal)
    }
    wire addAction probeAction
  }
}

/*
class Wire {

  private var sigVal = false
  private var actions: List[Action] = List()

  def getSignal = sigVal

  def setSignal(s: Boolean) =
    if (s != sigVal) {
      sigVal = s
      actions foreach (_ ())
    }

  def addAction(a: Action) = {
    actions = a :: actions
    a()
  }
}
*/

/*
def inverter(input: Wire, output: Wire) = {
  def invertAction() {
    val inputSig = input.getSignal
    afterDelay(InverterDelay) {
      output setSignal !inputSig
    }
  }
  input addAction invertAction
}
*/

/*
def andGate(a1: Wire, a2: Wire, output: Wire) = {
  def andAction() = {
    val a1Sig = a1.getSignal
    val a2Sig = a2.getSignal
    afterDelay(AndGateDelay) {
      output setSignal (a1Sig & a2Sig)
    }
  }
  a1 addAction andAction
  a2 addAction andAction
}
*/

/*
def probe(name: String, wire: Wire) {
  def probeAction() {
    println(name +" "+ currentTime +
        " new-value = "+ wire.getSignal)
  }
  wire addAction probeAction
}
*/

// CircuitSimulation 클래스
package org.stairwaybook.simulation

abstract class CircuitSimulation
  extends BasicCircuitSimulation {

  def halfAdder(a: Wire, b: Wire, s: Wire, c: Wire) {
    val d, e = new Wire
    orGate(a, b, d)
    andGate(a, b, c)
    inverter(c, e)
    andGate(d, e, s)
  }

  def fullAdder(a: Wire, b: Wire, cin: Wire,
                sum: Wire, cout: Wire) {

    val s, c1, c2 = new Wire
    halfAdder(a, cin, s, c1)
    halfAdder(b, s, sum, c2)
    orGate(c1, c2, cout)
  }
}

/*
scala> import org.stairwaybook.simulation._
import org.stairwaybook.simulation._
*/

/*
scala> object MySimulation extends CircuitSimulation {
     |   def InverterDelay = 1
     |   def AndGateDelay = 3
     |   def OrGateDelay = 5
     | }
defined module MySimulation
*/

/*
scala> import MySimulation._
import MySimulation._
*/

/*
scala> val input1, input2, sum, carry = new Wire
input1: MySimulation.Wire =
    BasicCircuitSimulation$Wire@111089b
input2: MySimulation.Wire =
    BasicCircuitSimulation$Wire@14c352e
sum: MySimulation.Wire =
    BasicCircuitSimulation$Wire@37a04c
carry: MySimulation.Wire =
    BasicCircuitSimulation$Wire@1fd10fa

scala> probe("sum", sum)
sum 0 new-value = false

scala> probe("carry", carry)
carry 0 new-value = false
*/

/*
scala> halfAdder(input1, input2, sum, carry)
*/

/*
scala> input1 setSignal true

scala> run()
*** simulation started, time = 0 ***
sum 8 new-value = true

scala> input2 setSignal true

scala> run()
*** simulation started, time = 8 ***
carry 11 new-value = true
sum 15 new-value = false
*/