package $name;format="lower,word"$.test

import collection.mutable.Stack
import org.scalatest._
import flatspec._
import matchers._

// mercilessly ripped from scalatest docs just to test it's working
class ExampleSpec extends AnyFlatSpec with should.Matchers {
  "Main.main()" should "print Hello World" in {
    val out = new ByteArrayOutputStream()
    Console.withOut(out) {
      Main.main(List())
    }
    out.toString should be ("Hello World\n")
  }
}