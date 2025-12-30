package lk.zerocode.schoolmanagement.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "package_wave_offs")
@Data
public class PackageWaveOff {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private BigDecimal amount;
    private String reason;
    private LocalDate grantedDate;

    @OneToOne
    @JoinColumn(name = "subscription_id")
    private StudentPackageSubscription subscription;
}
