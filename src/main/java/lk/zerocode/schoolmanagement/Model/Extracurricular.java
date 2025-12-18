package lk.zerocode.schoolmanagement.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Table(name = "extracurriculars")
@Data
public class Extracurricular {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String type;

    @Column(nullable = false)
    private String name;

    private String description;

    private BigDecimal fee;


}