package lk.zerocode.schoolmanagement.model;

import jakarta.persistence.*;
import lk.zerocode.schoolmanagement.model.Enums.PaymentType;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "payments")
@Data
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate date;
    private LocalTime time;
    private BigDecimal amount;

    @Enumerated(EnumType.STRING)
    private PaymentType type;

    @ManyToOne
    private Student student;

    @ManyToOne
    private Admission admission;

    @ManyToOne
    private StudentPackageSubscription packageSubscription;
}
