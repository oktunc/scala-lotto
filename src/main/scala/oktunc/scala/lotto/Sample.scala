package oktunc.scala.lotto

object Sample extends App {

  override def main(args: Array[String]) {
    println("Hello World says Sample!")
    tj()
  }

  def tj(): Unit = {
    println("sample method tj")
  }

  def tj2(): Unit = {
    tj();

  }

}