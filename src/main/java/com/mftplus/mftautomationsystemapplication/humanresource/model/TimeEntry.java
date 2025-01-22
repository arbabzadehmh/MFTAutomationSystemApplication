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

@Entity(name = "timeEntryEntity")
@Table(name = "time_entry_tbl")
public class TimeEntry {
    @Id
    @SequenceGenerator(name = "timeEntrySeq", sequenceName = "time_entry_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "timeEntrySeq")
    @Column(name = "id")
    private Long id;

    @Column(name = "entry_time")
    private LocalTime entryTime;

    @Column(name = "exit_time")
    private LocalTime exitTime;

    @ManyToOne
    @JoinColumn(
            name = "time_sheet__id",
            foreignKey = @ForeignKey(name = "fk_time_entry_time_sheet")
    )
    private TimeSheet timeSheet;
}

