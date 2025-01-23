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

@Entity(name="workFlowEntity")
@Table(name="work_flow_tbl")
public class WorkFlow {

    @Id
    @SequenceGenerator(name = "workFlowSeq", sequenceName = "work_flow_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "workFlowSeq")
    @Column(name = "id")
    private Long id;
}
