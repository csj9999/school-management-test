package lk.zerocode.schoolmanagement.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "package_discounts")
@Data
public class PackageDiscount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name; // e.g., Early Bird, Sibling Discount

    @Column(nullable = false)
    private BigDecimal value; // e.g., 10, 50

    @Column(nullable = false)
    private Boolean percentage; // true = %, false = fixed amount

    private String description; // optional description

    // Packages where this discount is allowed
    @ManyToMany
    @JoinTable(
            name = "package_allowed_discounts",
            joinColumns = @JoinColumn(name = "discount_id"),
            inverseJoinColumns = @JoinColumn(name = "package_id")
    )
    private List<StudentPackage> allowedPackages = new ArrayList<>();

    // Actual student applications (for reporting)
    @OneToMany(mappedBy = "discount")
    private List<StudentPackageDiscount> appliedDiscounts = new ArrayList<>();
}
