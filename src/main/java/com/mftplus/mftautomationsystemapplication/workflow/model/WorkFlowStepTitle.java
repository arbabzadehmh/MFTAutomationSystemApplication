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

@Entity(name="workFlowStepTitleEntity")
@Table(name="work_flow_step_title_tbl")
public class WorkFlowStepTitle {

    @Id
    @SequenceGenerator(name = "workFlowStepTitleSeq", sequenceName = "work_flow_step_title_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "workFlowStepTitleSeq")
    @Column(name = "id")
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "deleted")
    private boolean deleted;
}
