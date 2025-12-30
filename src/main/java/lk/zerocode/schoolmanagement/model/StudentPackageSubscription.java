package lk.zerocode.schoolmanagement.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "student_package_subscriptions")
@Data
public class StudentPackageSubscription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer academicYear;
    private BigDecimal finalAmount;

    @ManyToOne
    private Student student;

    @ManyToOne
    private StudentPackage studentPackage;

    @ManyToOne
    private PaymentPlan paymentPlan;

    @OneToMany(mappedBy = "subscription", cascade = CascadeType.ALL)
    private List<StudentPackageDiscount> discounts;

    @OneToOne(mappedBy = "subscription", cascade = CascadeType.ALL)
    private PackageWaveOff waveOff;

    @OneToMany(mappedBy = "packageSubscription")
    private List<Payment> payments;
}
