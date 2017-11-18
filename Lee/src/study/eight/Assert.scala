package study.eight

object Assert {
    var assertionsEnabled = true

    def myAssert(predicate: () => Boolean) =
        if (assertionsEnabled && !predicate())
            throw new AssertionError

    def byNameAssert(predicate: => Boolean) =
        if (assertionsEnabled && !predicate)
            throw new AssertionError

    def main(args: Array[String]) {
        try {
            myAssert(() => 5 > 3)
            println("5 > 3")
            myAssert(() => 5 < 3)
        } catch {
            case ex: AssertionError => println("ex [" + ex + "]")
        }

        try {
            byNameAssert(5 > 3)
            println("5 > 3")
            byNameAssert(5 < 3)
        } catch {
            case ex: AssertionError => println("ex [" + ex + "]")
        }
    }
}