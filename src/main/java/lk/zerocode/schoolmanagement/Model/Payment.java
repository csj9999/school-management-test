package lk.zerocode.schoolmanagement.Model;

import jakarta.persistence.*;
import lk.zerocode.schoolmanagement.Model.Enums.PaymentType;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Data
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long paymentId;

    private LocalDate date;

    private LocalTime time;

    @Enumerated(EnumType.STRING)
    private PaymentType type;
}
