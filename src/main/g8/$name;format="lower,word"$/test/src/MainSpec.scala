package $name;format="lower,word"$

import org.scalatest._
import flatspec._
import matchers._
import java.io.ByteArrayOutputStream

class ExampleSpec extends AnyFlatSpec with should.Matchers {
  "Main.main()" should "print Hello World" in {
    val out = new ByteArrayOutputStream()
    Console.withOut(out) {
      Main.main(Array())
    }
    out.toString should be ("Hello $name$\n")
  }
}