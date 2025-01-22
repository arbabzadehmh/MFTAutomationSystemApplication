package com.mftplus.mftautomationsystemapplication.humanresource.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.time.Duration;
import java.time.LocalDate;
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
    private LocalDate Date;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "time_sheet_mission_tbl",
            joinColumns = @JoinColumn(name = "time_sheet_id"),
            inverseJoinColumns = @JoinColumn(name = "mission_id"),
            foreignKey = @ForeignKey(name = "fk_time_sheet_mission"),
            inverseForeignKey = @ForeignKey(name = "fk_inverse_time_sheet_mission")
    )
    private List<Mission> missionList;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "time_sheet_leave_tbl",
            joinColumns = @JoinColumn(name = "time_sheet_id"),
            inverseJoinColumns = @JoinColumn(name = "leave_id"),
            foreignKey = @ForeignKey(name = "fk_time_sheet_leave"),
            inverseForeignKey = @ForeignKey(name = "fk_inverse_time_sheet_leave")
    )
    private List<Leave> leaveList;

    @OneToOne
    @JoinColumn(
            name = "employment_id",
            foreignKey = @ForeignKey(name = "fk_time_sheet_employment")
    )
    private Employment employment;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "time_sheet_time_shift_tbl",
            joinColumns = @JoinColumn(name = "time_sheet_id"),
            inverseJoinColumns = @JoinColumn(name = "time_shift_id"),
            foreignKey = @ForeignKey(name = "fk_time_sheet_time_shift"),
            inverseForeignKey = @ForeignKey(name = "fk_inverse_time_sheet_time_shift")
    )
    private List<TimeShift> timeShiftList;

    @OneToMany(mappedBy = "timeSheet", fetch = FetchType.EAGER)
    private List<TimeEntry> timeEntries;

    @Column(name = "total_work_minutes")
    private int totalWorkMinutes;

    public void calculateTotalWorkMinutes() {
        this.totalWorkMinutes = timeEntries.stream()
                .mapToInt(entry -> Duration.between(entry.getEntryTime(), entry.getExitTime()).toMinutesPart())
                .sum();
    }

    public int calculateOvertimeMinutes(List<TimeSheet> timeSheets, int standardWorkMinutes) {
        int totalMinutesWorked = timeSheets.stream()
                .mapToInt(TimeSheet::getTotalWorkMinutes)
                .sum();
        return Math.max(0, totalMinutesWorked - standardWorkMinutes);
    }

    public int calculateTotalMissionMinutes() {
        return missionList.stream()
                .filter(mission -> mission.getEntryTime() != null && mission.getExitTime() != null)
                .mapToInt(mission -> {
                    long minutes = Duration.between(mission.getEntryTime(), mission.getExitTime()).toMinutes();
                    return (int) minutes;
                })
                .sum();
    }
        public int calculateTotalLeaveMinutes() {
        return leaveList.stream()
                .filter(leave -> leave.getStartTime() != null && leave.getEndTime() != null)
                .mapToInt(leave -> {
                    long minutes = Duration.between(leave.getStartTime(), leave.getEndTime()).toMinutes();
                    return (int) minutes;
                })
                .sum();
    }


}
