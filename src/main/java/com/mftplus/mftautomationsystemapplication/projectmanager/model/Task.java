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

@Entity(name="taskEntity")
@Table(name="task_tbl")
public class Task {

    @Id
    @SequenceGenerator(name = "taskSeq", sequenceName = "task_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "taskSeq")
    @Column(name = "id")
    private Long id;
}
