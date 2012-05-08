package oktunc.scala.lotto
import org.junit.Assert._
import org.junit.Test
import org.junit.Before
import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers
import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class HelloWorldScala2Test extends FunSuite {

  test("should print hello world"){
    println("hello world")
    assert(true)
  }
}