package lk.zerocode.schoolmanagement.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Data
@Table(name  = "course_fees")
public class CourseFee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long course_id;

    private String name;

    private LocalDate year;

    private BigDecimal price;

    @OneToOne
    @JoinColumn(
            name = "grade_id",
            referencedColumnName = "id" //gradeID
    )
    private Grade grade;


}
