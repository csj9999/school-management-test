package lk.zerocode.schoolmanagement.model;

import jakarta.persistence.*;
import lk.zerocode.schoolmanagement.model.Enums.Gender;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "students")
@Data
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String admissionNo;

    private String firstName;
    private String lastName;
    private String photoUrl;

    private LocalDate dateOfBirth;
    private LocalDate dateOfAdmission;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    private String religion;
    private String nationality;

    @ManyToOne
    private Parent parent;

    @ManyToOne
    private ClassRoom class_room;

    @OneToOne(mappedBy = "student")
    private Admission admission;

    @OneToMany(mappedBy = "student")
    private List<StudentPackageSubscription> packageSubscriptions;

//    @ManyToOne
//    @JoinColumn(name = "payment_id")
//    private Payment payment;

//    @ManyToMany
//    @JoinTable(
//            name = "student_siblings",
//            joinColumns = @JoinColumn(name = "id"),
//            inverseJoinColumns = @JoinColumn(name = "id")
//    )
//    private List<Sibling> siblingList;


}