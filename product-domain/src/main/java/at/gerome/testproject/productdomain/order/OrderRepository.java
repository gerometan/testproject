package at.gerome.testproject.productdomain.order;

import at.gerome.testproject.productdomain.order.model.Order;
import at.gerome.testproject.productdomain.order.model.dto.GroupOrderProductDto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrderRepository extends CrudRepository<Order, String> {

    @Query("Select new at.gerome.testproject.productdomain.order.model.dto.GroupOrderProductDto(o.quantity, p.name, COUNT(o.quantity)) from Order o Join o.product p group by o.quantity, p.name")
    List<GroupOrderProductDto> findAllGroupBy();
}
