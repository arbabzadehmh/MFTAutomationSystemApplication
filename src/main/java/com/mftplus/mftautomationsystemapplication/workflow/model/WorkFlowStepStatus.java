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

@Entity(name="workFlowStepStatusEntity")
@Table(name="work_flow_step_status_tbl")
public class WorkFlowStepStatus {

    @Id
    @SequenceGenerator(name = "workFlowStepStatusSeq", sequenceName = "work_flow_step_status_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "workFlowStepStatusSeq")
    @Column(name = "id")
    private Long id;

    @Column(name = "status")
    private String status;

    @Column(name = "deleted")
    private boolean deleted;
}
