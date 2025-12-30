package lk.zerocode.schoolmanagement.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "grades")
@Data
public class Grade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String gradeName;
    private String description;

    @OneToOne(mappedBy = "grade")
    private CourseFee courseFee;

}