package at.gerome.testproject.productdomain.product.model;

import at.gerome.testproject.productdomain.Audit;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Product extends Audit {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "org.hibernate.id.UUIDGenerator")
    private String id;

    @Column(nullable=false, length = 123)
    private String description;

    @Column(nullable=false, length = 255)
    private String name;



}
