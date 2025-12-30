package lk.zerocode.schoolmanagement.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "payment_plans")
@Data
public class PaymentPlan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name; // Monthly / Term / One-Time
    private Integer installments;
}
