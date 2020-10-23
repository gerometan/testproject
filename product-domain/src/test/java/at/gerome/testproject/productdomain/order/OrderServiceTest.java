package at.gerome.testproject.productdomain.order;

import at.gerome.testproject.productdomain.order.model.dto.PriorityOrderDto;
import at.gerome.testproject.productdomain.product.model.dto.ProductDto;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

@Disabled
public class OrderServiceTest extends AbstractOrderTest{

  @Autowired private OrderService orderService;

  @Test
  void canSaveOrders() {
    PriorityOrderDto priorityOrderDto = new PriorityOrderDto();
    priorityOrderDto.setQuantity(2);

    ProductDto productDto = new ProductDto();
    productDto.setDescription("Description");

    priorityOrderDto.setProductDto(productDto);

    Assertions.assertThat(orderService.save(priorityOrderDto)).isEqualTo(0);
  }

  @Test
  void canDisplayGroups() {
    PriorityOrderDto priorityOrderDto = new PriorityOrderDto();
    priorityOrderDto.setQuantity(2);

    ProductDto productDto = new ProductDto();
    productDto.setDescription("Description 1");
    productDto.setName("Name");
    priorityOrderDto.setProductDto(productDto);

    orderService.save(priorityOrderDto);
    priorityOrderDto = new PriorityOrderDto();
    priorityOrderDto.setQuantity(2);

    productDto = new ProductDto();
    productDto.setDescription("Description 2");
    productDto.setName("Name");
    priorityOrderDto.setProductDto(productDto);

    orderService.save(priorityOrderDto);

    priorityOrderDto = new PriorityOrderDto();
    priorityOrderDto.setQuantity(3);

    productDto = new ProductDto();
    productDto.setDescription("Description 3");
    productDto.setName("Name");
    priorityOrderDto.setProductDto(productDto);

    orderService.save(priorityOrderDto);

    priorityOrderDto = new PriorityOrderDto();
    priorityOrderDto.setQuantity(3);

    productDto = new ProductDto();
    productDto.setDescription("Description 4");
    productDto.setName("Name");
    priorityOrderDto.setProductDto(productDto);

    orderService.save(priorityOrderDto);

    Assertions.assertThat(orderService.findAllGroupByProduct().size()).isEqualTo(2);
  }
}
