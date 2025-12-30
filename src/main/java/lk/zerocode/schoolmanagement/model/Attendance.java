package lk.zerocode.schoolmanagement.model;


import jakarta.persistence.*;
import lk.zerocode.schoolmanagement.model.Enums.AttendanceStatus;
import lk.zerocode.schoolmanagement.model.Enums.AttendanceType;
import lombok.Data;
import java.time.LocalDate;

@Entity
@Table(name = "attendances")
@Data
public class Attendance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private LocalDate date;

    @Column(name = "time_marked")
    private String timeMarked;

    @Column(name = "marked_by")
    private String markedBy;

    @Enumerated(EnumType.STRING)
    private AttendanceType sessionType;

    @Enumerated(EnumType.STRING)
    private AttendanceStatus status;

    private String reason;


}