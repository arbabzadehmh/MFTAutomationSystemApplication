package com.mftplus.mftautomationsystemapplication.workflow.model;


import com.mftplus.mftautomationsystemapplication.users.model.User;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

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

    @ManyToOne
    @JoinColumn(
            name = "wf_step_status_id",
            foreignKey = @ForeignKey(name = "fk_wf_step_status")
    )
    private WorkFlowStepStatus status;

    @ManyToOne
    @JoinColumn(
            name = "wf_step_title_id",
            foreignKey = @ForeignKey(name = "fk_wf_step_title")
    )
    private WorkFlowStepTitle title;

    @ManyToOne
    @JoinColumn(
            name = "wf_step_parent_id",
            foreignKey = @ForeignKey(name = "fk_wf_step_parent")
    )
    private WorkFlowStep parentStep;

    @OneToMany(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE}, mappedBy = "parentStep")
    @JoinTable(
            name = "work_flow_step_child_tbl",
            joinColumns = @JoinColumn(name = "wf_step_parent_id"),
            inverseJoinColumns = @JoinColumn(name = "wf_step_child_id"),
            foreignKey = @ForeignKey(name = "fk_step_parent_child"),
            inverseForeignKey = @ForeignKey(name = "fk_inverse_parent_child")
    )
    private List<WorkFlowStep> childStepList;

    @ManyToOne
    @JoinColumn(
            name = "wf_step_approver",
            foreignKey = @ForeignKey(name = "fk_wf_step_user")
    )
    private User approver;

    @Column(name = "action_date")
    private LocalDateTime actionDate;

    @Column(name = "description")
    private String description;

    @Column(name = "deleted")
    private boolean deleted;

    public void addChildStep(WorkFlowStep childStep) {
        if (childStepList == null) {
            childStepList = new ArrayList<>();
        }
        childStepList.add(childStep);
    }

}
