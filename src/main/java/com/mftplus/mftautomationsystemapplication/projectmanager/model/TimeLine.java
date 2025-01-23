package com.mftplus.mftautomationsystemapplication.projectmanager.model;


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

@Entity(name="timeLineEntity")
@Table(name="time_line_tbl")
public class TimeLine {

    @Id
    @SequenceGenerator(name = "timeLineSeq", sequenceName = "time_line_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "timeLineSeq")
    @Column(name = "id")
    private Long id;
}
