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

@Entity(name="workFlowStepEntity")
@Table(name="work_flow_step_tbl")
public class WorkFlowStep {

    @Id
    @SequenceGenerator(name = "workFlowStepSeq", sequenceName = "work_flow_step_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "workFlowStepSeq")
    @Column(name = "id")
    private Long id;
}
