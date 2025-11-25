package lk.zerocode.schoolmanagement.schoolmanagemnet.Model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@Entity
@Table(name = "attendance")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Attendance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String entity;

    @Column(name = "entity_id", nullable = false)
    private Long entityId;

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

    @Column(nullable = false)
    private String status;
}