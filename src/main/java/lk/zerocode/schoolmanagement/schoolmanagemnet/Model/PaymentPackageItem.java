package lk.zerocode.schoolmanagement.schoolmanagemnet.Model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "payment_package_items")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PaymentPackageItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String period;

    @Column(name = "due_period")
    private String duePeriod;

    private String description;

    @Column(name = "base_amount", nullable = false)
    private BigDecimal baseAmount;

    @Column(name = "due_date")
    private LocalDate dueDate;

    private String status;

    @Column(name = "billing_type", nullable = false)
    private String billingType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "extracurricular_id")
    private Extracurricular extracurricular;
}