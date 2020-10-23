package at.gerome.testproject.productdomain.order.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.NativeWebRequest;
import org.zalando.problem.Problem;
import org.zalando.problem.Status;
import org.zalando.problem.spring.web.advice.ProblemHandling;

public interface IllegalArgumentAdviceTrait extends ProblemHandling {

    @ExceptionHandler
    default ResponseEntity<Problem> handleIllegalArgumentException(
            final Exception exception,
            final NativeWebRequest request) {
        //return
        return create(Status.BAD_GATEWAY, exception, request);
    }
}
