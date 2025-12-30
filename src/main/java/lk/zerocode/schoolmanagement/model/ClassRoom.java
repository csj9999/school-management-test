package lk.zerocode.schoolmanagement.model;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "classes")
@Data
public class ClassRoom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Integer year;

    @ManyToOne
    private Grade grade;



}
