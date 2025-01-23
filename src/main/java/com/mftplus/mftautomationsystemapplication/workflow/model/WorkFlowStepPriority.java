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

@Entity(name="workFlowStepPriorityEntity")
@Table(name="work_flow_step_priority_tbl")
public class WorkFlowStepPriority {

    @Id
    @SequenceGenerator(name = "workFlowStepPrioritySeq", sequenceName = "work_flow_step_priority_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "workFlowStepPrioritySeq")
    @Column(name = "id")
    private Long id;
}
