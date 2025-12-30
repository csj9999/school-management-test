package lk.zerocode.schoolmanagement.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Table(name = "student_package_discounts")
@Data
public class StudentPackageDiscount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "subscription_id")
    private StudentPackageSubscription subscription;

    @ManyToOne
    @JoinColumn(name = "discount_id")
    private PackageDiscount discount;

    private BigDecimal appliedValue;
}

