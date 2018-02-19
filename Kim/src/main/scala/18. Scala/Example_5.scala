/**
  * Created by donghwankim on 2018. 2. 19..
  */

// Simulation 클래스
abstract class Simulation {

  type Action = () => Unit

  case class WorkItem(time: Int, action: Action)

  private var curtime = 0
  def currentTime: Int = curtime

  private var agenda: List[WorkItem] = List()

  private def insert(ag: List[WorkItem],
                     item: WorkItem): List[WorkItem] = {

    if (ag.isEmpty || item.time < ag.head.time) item :: ag
    else ag.head :: insert(ag.tail, item)
  }

  def afterDelay(delay: Int)(block: => Unit) {
    val item = WorkItem(currentTime + delay, () => block)
    agenda = insert(agenda, item)
  }

  private def next() {
    (agenda: @unchecked) match {
      case item :: rest =>
        agenda = rest
        curtime = item.time
        item.action()
    }
  }

  def run() {
    afterDelay(0) {
      println("*** simulation started, time = "+
        currentTime +" ***")
    }
    while (!agenda.isEmpty) next()
  }
}

/*
type Action = () => Unit
*/

/*
private var curtime: Int = 0
*/

/*
def currentTime: Int = curtime
*/

/*
case class WorkItem(time: Int, action: Action)
*/

/*
private var agenda: List[WorkItem] = List()
*/

/*
def afterDelay(delay: Int)(block: => Unit) {
  val item = WorkItem(currentTime + delay, () => block)
  agenda = insert(agenda, item)
}
*/

/*
afterDelay(delay) { count += 1 }
*/

/*
private def insert(ag: List[WorkItem],
    item: WorkItem): List[WorkItem] =  {

  if (ag.isEmpty || item.time < ag.head.time) item :: ag
  else ag.head :: insert(ag.tail, item)
}
*/

/*
def run() {
  afterDelay(0) {
    println("*** simulation started, time = "+
        currentTime +" ***")
  }
  while (!agenda.isEmpty) next()
}
*/

/*
private def next() {
  (agenda: @unchecked) match {
    case item :: rest =>
      agenda = rest
      curtime = item.time
      item.action()
  }
}
*/

/*
Simulator.scala:19: warning: match is not exhaustive!
missing combination            Nil

    agenda match {
    ^
one warning found
*/