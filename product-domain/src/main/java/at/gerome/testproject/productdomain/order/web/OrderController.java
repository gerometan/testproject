package at.gerome.testproject.productdomain.order.web;

import at.gerome.testproject.productdomain.order.OrderService;
import at.gerome.testproject.productdomain.order.model.dto.GroupOrderProductDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class OrderController {

  private final OrderService orderService;

  @GetMapping("/getGroup")
  public Mono<List<GroupOrderProductDto>> getGroup() {

    return Mono.just(orderService.findAllGroupByProduct());
  }

  @GetMapping("/ewan")
  public String getGroupss() throws Exception {
    //throw new IllegalArgumentException("Gerome");
    return "Gerome";
  }
}
