package at.gerome.testproject.productdomain.order.mapper;

import at.gerome.testproject.productdomain.order.model.Order;
import at.gerome.testproject.productdomain.order.model.dto.PriorityOrderDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface OrderMapper {

    @Mapping(target = "product", source = "priorityOrderDto.productDto")
    Order toOrder(PriorityOrderDto priorityOrderDto);
}
