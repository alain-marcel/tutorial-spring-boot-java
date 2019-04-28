package hello;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;

/**
 * A POST request with case class response.
 *
 * POST http://localhost:8080/hello3       { "name: "bob" }
 */
@RestController
public class Hello3Controller {

  @PostMapping("/hello3")
  public Greeting myHandler(@RequestBody @NotNull Person3 person) {
    String greet = "Hello " + person.getName();
    Greeting greeting = new Greeting();
    greeting.setGreet(greet);
    return greeting;
  }

}

class Person3 {
  private String name;

  public void setName(String v) {
    this.name = v;
  }

  public String getName() {
    return this.name;
  }

  public String toString() {
    return String.format("Person(name=%s)", this.name);
  }
}

class Greeting {
  private String greet;

  public void setGreet(String v) {
    this.greet = v;
  }

  public String getGreet() {
    return this.greet;
  }

  public String toString() {
    return String.format("Greeting(greet=%s)", this.greet);
  }
}
