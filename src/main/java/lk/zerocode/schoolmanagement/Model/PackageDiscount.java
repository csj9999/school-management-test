package lk.zerocode.schoolmanagement.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "pack_discounts")
@Data
public class PackageDiscount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long disId;

    @Column(nullable = false)
    private String type;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private BigDecimal value;

    @Column(name = "applicable_to")
    private String applicableTo;

    @ManyToMany
    @JoinTable(
            name = "std_pack_discounts",
            joinColumns = @JoinColumn(name = "disId"),
            inverseJoinColumns = @JoinColumn(name = "packId")
    )
    private List<StudentPackage> studentPackageList;


}