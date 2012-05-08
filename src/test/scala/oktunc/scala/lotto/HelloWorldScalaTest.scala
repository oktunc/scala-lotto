package oktunc.scala.lotto
import org.junit.Assert._
import org.junit.Test
import org.junit.Before
import org.scalatest.junit.JUnitSuite

class HelloWorldScalaTest extends JUnitSuite {

  @Before def initialize(){
    
  }
  
  @Test
  def showHelloTest() {
    println("here we go")
    assert(true)
  }
}