package com.mftplus.mftautomationsystemapplication.humanresource.model;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor
@Getter
@Setter
@SuperBuilder
@ToString

@Entity(name="timeShiftEntity")
@Table(name="time_shift_tbl")
public class TimeShift {
    @Id
    @SequenceGenerator(name = "timeShiftSeq",sequenceName = "time_shift_seq",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "timeShiftSeq")
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name="status")
    private String status;
}
