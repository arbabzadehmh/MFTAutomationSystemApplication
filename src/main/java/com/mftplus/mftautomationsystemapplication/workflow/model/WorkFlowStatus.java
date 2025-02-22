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

@Entity(name="workFlowStatusEntity")
@Table(name="work_flow_status_tbl")
public class WorkFlowStatus {

    @Id
    @SequenceGenerator(name = "workFlowStatusSeq", sequenceName = "work_flow_status_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "workFlowStatusSeq")
    @Column(name = "id")
    private Long id;

    @Column(name = "status")
    private String status;

    @Column(name = "deleted")
    private boolean deleted;
}
