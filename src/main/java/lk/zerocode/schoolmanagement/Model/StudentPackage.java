package lk.zerocode.schoolmanagement.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "student_packages")
@Data
public class StudentPackage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long packId;

    @Column(nullable = false)
    private String name;

    private String description;

    @Column(name = "total_amount", nullable = false)
    private BigDecimal totalAmount;

    @ManyToMany(mappedBy = "studentPackageList")
    private List <PackageDiscount> packageDiscountList;
}