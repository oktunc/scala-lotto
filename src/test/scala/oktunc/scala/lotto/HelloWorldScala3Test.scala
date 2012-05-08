package oktunc.scala.lotto
import org.junit.Assert._
import org.junit.Test
import org.junit.Before
import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class HelloWorldScala3Test extends FlatSpec with ShouldMatchers {

  "this programe" should "display a message" in {
    val message = "Hello World"
    message should equal ("Hello World")
    println("test 3 works!")
  }
  
}