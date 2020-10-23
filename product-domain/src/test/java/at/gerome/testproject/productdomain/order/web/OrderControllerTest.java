package at.gerome.testproject.productdomain.order.web;

import at.gerome.testproject.productdomain.order.OrderRepository;
import at.gerome.testproject.productdomain.order.OrderService;
import at.gerome.testproject.productdomain.order.mapper.OrderMapper;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.web.reactive.server.WebTestClient;
import org.springframework.test.web.servlet.MockMvc;

//import static org.springframework.http.ResponseEntity.status;
//import static reactor.core.publisher.Mono.when;
//@ExtendWith(SpringExtension.class)
//@WebFluxTest(OrderController.class)
@AutoConfigureMockMvc
@SpringBootTest
@Disabled
public class OrderControllerTest {

  @Autowired
  private MockMvc mockMvc;

  @Autowired
  private TestRestTemplate testRestTemplate;

//  @Autowired
//  private ApplicationContext context;

  //@Autowired
  private WebTestClient webclient;

  @MockBean
  private OrderMapper orderMapper;

  @MockBean
  private OrderRepository orderRepository;

  @MockBean
  private  OrderService orderService;

  @MockBean
  private OrderController orderController;

  @Test
  void canFindAllGroups() throws Exception {

//when(orderController.getGroup()).thenThrow(new Exception());
//    when(orderController.getGroup()).do
    webclient = WebTestClient
            //.bindToApplicationContext(context).configureClient().baseUrl("/").build();
            .bindToServer().baseUrl("http://localhost:8091").build();

//        WebClient.builder()
//            .baseUrl("http://localhost:8091")
//            .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
//            .build();
//
//    Mono<GroupOrderProductDto> groupOrderProductDtoMono =
//        webclient.get().uri("/getGroup")
//                .accept(MediaType.APPLICATION_JSON).exchange().expectStatus().isOk();
                //.retrieve().bodyToMono(GroupOrderProductDto.class);

//    mockMvc.perform(get("/getGroup")).andExpect(status().isOk());
//    Assertions.assertThat(groupOrderProductDtoMono).isNot(null);
  }
}
