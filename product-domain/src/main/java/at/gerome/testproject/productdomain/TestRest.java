package at.gerome.testproject.productdomain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController

public class TestRest {
  @Value("${product.name}")
  private String testMsg;

  @GetMapping("/iloveyou")
  public String ewan() {
    return testMsg;
  }
}
