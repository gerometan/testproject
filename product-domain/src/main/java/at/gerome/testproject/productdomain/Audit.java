package at.gerome.testproject.productdomain;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.time.OffsetDateTime;

@MappedSuperclass
@Data
public abstract class Audit implements Serializable {

  @CreationTimestamp
  @Column(updatable = false, nullable = false)
  protected OffsetDateTime inserted;

  @Column(updatable = false, nullable = false)
  protected String insertedBy= "system";

  @UpdateTimestamp
  @Column(nullable = false)
  protected OffsetDateTime updated;

  @Column(nullable = false)
  protected String updatedBy = "system";
}
