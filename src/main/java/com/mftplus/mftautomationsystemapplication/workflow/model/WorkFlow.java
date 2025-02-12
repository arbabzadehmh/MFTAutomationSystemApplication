package com.mftplus.mftautomationsystemapplication.workflow.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.ArrayList;
import java.util.List;

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

    @ManyToOne
    @JoinColumn(
            name = "wf_status_id",
            foreignKey = @ForeignKey(name = "fk_wf_status")
    )
    private WorkFlowStatus status;

    @ManyToOne
    @JoinColumn(
            name = "wf_title_id",
            foreignKey = @ForeignKey(name = "fk_wf_title")
    )
    private WorkFlowTitle title;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "wf_step_tbl",
            joinColumns = @JoinColumn(name = "work_flow_id"),
            inverseJoinColumns = @JoinColumn(name = "wf_step_id"),
            foreignKey = @ForeignKey(name = "fk_work_flow_step"),
            inverseForeignKey = @ForeignKey(name = "fk_inverse_work_flow_step")
    )
    private List<WorkFlowStep> stepList;

    @Column(name = "description")
    private String description;

    @Column(name = "deleted")
    private boolean deleted;

    public void addStep(WorkFlowStep step) {
        if (stepList == null) {
            stepList = new ArrayList<>();
        }
        stepList.add(step);
    }
}
