package at.gerome.testproject.productdomain.infrastructure.exception;

import org.zalando.problem.AbstractThrowableProblem;

import java.net.URI;

import static java.lang.String.format;
import static org.zalando.problem.Status.BAD_GATEWAY;

public class PersonNotFoundException extends AbstractThrowableProblem {

  private static final URI TYPE = URI.create("https://testing.com/genericException");

  public PersonNotFoundException(final String personId) {
    super(TYPE, "Person not found", BAD_GATEWAY, format("Person [%s] is not found", personId));
  }

}
