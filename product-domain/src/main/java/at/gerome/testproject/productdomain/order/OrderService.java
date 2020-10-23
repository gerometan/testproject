package at.gerome.testproject.productdomain.order;

import at.gerome.testproject.productdomain.order.mapper.OrderMapper;
import at.gerome.testproject.productdomain.order.model.Order;
import at.gerome.testproject.productdomain.order.model.dto.GroupOrderProductDto;
import at.gerome.testproject.productdomain.order.model.dto.PriorityOrderDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderService {

  private final OrderMapper orderMapper;
  private final OrderRepository orderRepository;

  @Transactional
  public int save(PriorityOrderDto priorityOrderDto) {
    Order order = orderMapper.toOrder(priorityOrderDto);
    orderRepository.save(order);
    return 0;
  }

  public List<GroupOrderProductDto> findAllGroupByProduct() {
    List<GroupOrderProductDto> groupOrderProductDtoList = orderRepository.findAllGroupBy();
    return groupOrderProductDtoList;
  }
}
