package lk.zerocode.schoolmanagement.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "parents")
@Data

public class Parent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nic;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    private String email;

    @Column(name = "contact_number", nullable = false)
    private String contactNumber;

    private String relations;

}
