package lk.zerocode.schoolmanagement.Model;

import jakarta.persistence.*;
import lk.zerocode.schoolmanagement.Model.Enums.Gender;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "students")
@Data
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "photo_url")
    private String photoUrl;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "admission_no", unique = true, nullable = false)
    private String admissionNo;

    @Column(name = "date_of_birth", nullable = false)
    private LocalDate dateOfBirth;

    @Column(name = "date_of_admission", nullable = false)
    private LocalDate dateOfAdmission;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    private String religion;

    private String nationality;

    @ManyToOne
    @JoinColumn(name = "class_id")
    private Class classes;

    @ManyToOne
    @JoinColumn(name = "parent_id")
    private Parent parent;

    @ManyToOne
    @JoinColumn(name = "payment_id")
    private Payment payment;



}