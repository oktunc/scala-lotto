package oktunc.scala.lotto;
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping


@Controller
class HelloWorldController {
  @RequestMapping(Array("/hello.html"))
  def showHello = "helloPage"
}