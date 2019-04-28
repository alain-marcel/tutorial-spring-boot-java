package hello;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;

/**
 * A POST request with simple response.
 * https://www.baeldung.com/spring-request-response-body
 *
 * POST http://localhost:8080/hello2       { "name: "bob" }
 */
@RestController
public class Hello2Controller {

  @PostMapping("/hello2")
  public String myHandler(@RequestBody @NotNull Person person) {
    return "You have send person=" + person.toString();
  }

}

class Person {
  private String name ;
  
  public void setName(String v) {
    this.name = v;
  }
  
  public String getName() {
      return this.name ;
  }
  
  public String toString() {
    return String.format("Person(name=%s)", this.name) ;
  } 
}
