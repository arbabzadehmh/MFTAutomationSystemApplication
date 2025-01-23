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

@Entity(name="requestStatusEntity")
@Table(name="request_status_tbl")
public class RequestStatus {

    @Id
    @SequenceGenerator(name = "requestStatusSeq", sequenceName = "request_status_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "requestStatusSeq")
    @Column(name = "id")
    private Long id;
}
