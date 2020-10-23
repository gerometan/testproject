package at.gerome.testproject.productdomain.order.model;

import at.gerome.testproject.productdomain.Audit;
import at.gerome.testproject.productdomain.product.model.Product;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Data
@Table(name = "PRODUCT_ORDER")
public class Order extends Audit {
  @Id
  @GeneratedValue(generator = "uuid")
  @GenericGenerator(name = "uuid", strategy = "org.hibernate.id.UUIDGenerator")
  private String id;

  private int quantity;

  private String owner;

  @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
  @JoinColumn(name = "PRODUCT_ID", referencedColumnName = "ID")
  private Product product;
}
