package lk.zerocode.schoolmanagement.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "admissions")
@Data
public class Admission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer academicYear;

    private BigDecimal baseFee;
    private BigDecimal finalFee;

    @OneToOne
    @JoinColumn(name = "student_id", nullable = false)
    private Student student;

    @ManyToOne
    private PaymentPlan paymentPlan;

    @OneToMany(mappedBy = "admission", cascade = CascadeType.ALL)
    private List<StudentAdmissionDiscount> discounts;

    @OneToOne(mappedBy = "admission", cascade = CascadeType.ALL)
    private AdmissionWaveOff waveOff;

    @OneToMany(mappedBy = "admission")
    private List<Payment> payments;
}

