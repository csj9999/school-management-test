package lk.zerocode.schoolmanagement.schoolmanagemnet.Model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "student_contacts")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentContact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "student_id", nullable = false)
    private Student student;

    @Column(nullable = false)
    private String district;

    @Column(nullable = false)
    private String city;

    private String street;

    @Column(name = "emergency_number")
    private String emergencyNumber;

    @Column(name = "street_no")
    private String streetNo;

    @Column(name = "postal_code")
    private String postalCode;

    private String email;
}