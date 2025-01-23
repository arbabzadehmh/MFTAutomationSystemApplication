package com.mftplus.mftautomationsystemapplication.workflow.model;


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

@Entity(name="workFlowPriorityEntity")
@Table(name="work_flow_priority_tbl")
public class WorkFlowPriority {

    @Id
    @SequenceGenerator(name = "workFlowPrioritySeq", sequenceName = "work_flow_priority_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "workFlowPrioritySeq")
    @Column(name = "id")
    private Long id;
}
