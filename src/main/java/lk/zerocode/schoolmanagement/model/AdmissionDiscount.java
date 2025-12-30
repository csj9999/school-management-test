package lk.zerocode.schoolmanagement.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Table(name = "admission_discounts")
@Data
public class AdmissionDiscount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private BigDecimal value;

    @Column(nullable = false)
    private Boolean percentage;
}
