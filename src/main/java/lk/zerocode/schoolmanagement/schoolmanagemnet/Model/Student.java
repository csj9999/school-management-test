package lk.zerocode.schoolmanagement.schoolmanagemnet.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

    @Entity
    @Table(name = "students")
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
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

        private String gender;

        private String religion;

        private String nationality;

        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "class_id")
        private Class classEntity;

        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "extracurricular_id")
        private Extracurricular extracurricular;

        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "student_package_id")
        private StudentPackage studentPackage;

        @ManyToMany
        @JoinTable(
                name = "student_parent",
                joinColumns = @JoinColumn(name = "student_id"),
                inverseJoinColumns = @JoinColumn(name = "parent_id")
        )
        private List<Parent> parents = new ArrayList<>();

        @OneToMany(mappedBy = "student", cascade = CascadeType.ALL, orphanRemoval = true)
        private List<StudentContact> contacts = new ArrayList<>();

        @OneToMany(mappedBy = "student", cascade = CascadeType.ALL, orphanRemoval = true)
        private List<Sibling> siblings = new ArrayList<>();

        @Column(name = "created_at", updatable = false)
        private LocalDateTime createdAt;

        @PrePersist
        protected void onCreate() {
            createdAt = LocalDateTime.now();
        }
    }

