package lk.zerocode.schoolmanagement.schoolmanagemnet.Model;


import jakarta.persistence.*;
import lk.zerocode.schoolmanagement.schoolmanagemnet.Model.Enums.AttendanceType;
import lombok.Data;
import java.time.LocalDate;

@Entity
@Table(name = "attendance")
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

    @Column(name = "session_type")
    private String sessionType;

    private String reason;

    private String type;

    @Enumerated(EnumType.STRING)
    private AttendanceType status;
}