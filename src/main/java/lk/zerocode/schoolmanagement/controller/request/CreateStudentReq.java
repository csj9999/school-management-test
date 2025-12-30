package lk.zerocode.schoolmanagement.controller.request;

import jakarta.persistence.*;
import lk.zerocode.schoolmanagement.model.Enums.Gender;
import lombok.Data;
import tools.jackson.databind.PropertyNamingStrategies;
import tools.jackson.databind.annotation.JsonNaming;

import java.time.LocalDate;

@Data
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class CreateStudentReq {


    private String admissionNo;

    private String firstName;
    private String lastName;
    private String photoUrl;

    private LocalDate dateOfBirth;
    private LocalDate dateOfAdmission;

    private Gender gender;

    private String religion;
    private String nationality;
}
