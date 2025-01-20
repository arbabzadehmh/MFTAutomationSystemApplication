package com.mftplus.mftautomationsystemapplication.humanresource.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@SuperBuilder
@ToString

@Entity(name="timeSheetEntity")
@Table(name="time_sheet_tbl")
public class TimeSheet {
    @Id
    @SequenceGenerator(name = "timeSheetSeq",sequenceName = "time_sheet_seq",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "timeSheetSeq")
    @Column(name = "id")
    private Long id;

    @Column(name = "date")
    private Date Date;

    @Column(name = "entry")
    private LocalDateTime entry;

    @Column(name = "exit")
    private LocalDateTime exit;

    @OneToMany
    private List<TimeShift> timeShiftList;

    @OneToMany
    private List<Mission> missionList;

    @OneToMany
    private List<Leave> leaveList;
}
