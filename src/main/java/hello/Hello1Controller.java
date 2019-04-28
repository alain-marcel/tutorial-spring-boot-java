package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * A GET request.
 *
 * GET/POST http://localhost:8080/hello1
 */
@RestController
public class Hello1Controller {

  @RequestMapping("/hello1")
  public String myHandler() {
    return "Greetings from Spring Boot !";
  }

}
