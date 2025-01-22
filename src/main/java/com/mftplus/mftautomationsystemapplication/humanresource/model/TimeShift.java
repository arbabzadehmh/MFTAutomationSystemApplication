package com.mftplus.mftautomationsystemapplication.humanresource.model;
import jakarta.persistence.*;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.time.LocalTime;


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

    @Column(name = "start_time")
    private LocalTime startTime;

    @Column(name = "end_time")
    private LocalTime endTime;

    @Column(name = "attendance_minutes")
    private int attendanceMinutes;

    @Column(name = "description")
    private String description;

    @OneToOne
    @JoinColumn(
            name = "work_shift_id",
            foreignKey = @ForeignKey(name = "fk_time_shift_work_shift")
    )
    private WorkShift workShift;

    @OneToOne
    @JoinColumn(
            name = "administrative_calendar_id",
            foreignKey = @ForeignKey(name = "fk_time_shift_administrative_calendar")
    )
    private AdministrativeCalendar administrativeCalendar;

}
