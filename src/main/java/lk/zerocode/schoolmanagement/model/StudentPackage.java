package lk.zerocode.schoolmanagement.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "student_packages")
@Data
public class StudentPackage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;

    private BigDecimal baseAmount;

    @ManyToMany
    @JoinTable(
            name = "package_extracurriculars",
            joinColumns = @JoinColumn(name = "package_id"),
            inverseJoinColumns = @JoinColumn(name = "extra_id")
    )
    private List<Extracurricular> extracurriculars;

    @ManyToMany
    @JoinTable(
            name = "package_allowed_discounts",
            joinColumns = @JoinColumn(name = "package_id"),
            inverseJoinColumns = @JoinColumn(name = "discount_id")
    )
    private List<StudentPackageDiscount> allowedDiscounts;
}