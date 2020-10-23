package at.gerome.testproject.productdomain.order.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class GroupOrderProductDto {
    private int quantity;
    private String productName;
    private long size;
}
