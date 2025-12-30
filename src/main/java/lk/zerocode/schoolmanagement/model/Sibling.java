package lk.zerocode.schoolmanagement.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Sibling {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String relation;



}
