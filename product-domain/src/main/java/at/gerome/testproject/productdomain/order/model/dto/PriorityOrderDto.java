package at.gerome.testproject.productdomain.order.model.dto;


import at.gerome.testproject.productdomain.product.model.dto.ProductDto;
import lombok.Data;

@Data
public class PriorityOrderDto {
  private int quantity;
  private ProductDto productDto;
}
