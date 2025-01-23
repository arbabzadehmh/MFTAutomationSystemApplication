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

@Entity(name="requestPriorityEntity")
@Table(name="request_priority_tbl")
public class RequestPriority {

    @Id
    @SequenceGenerator(name = "requestPrioritySeq", sequenceName = "request_priority_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "requestPrioritySeq")
    @Column(name = "id")
    private Long id;
}
