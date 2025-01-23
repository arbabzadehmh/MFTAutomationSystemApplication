package com.mftplus.mftautomationsystemapplication.messaging.model;

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

@Entity(name="statusUpdateEntity")
@Table(name="status_update_tbl")
public class StatusUpdate {

    @Id
    @SequenceGenerator(name = "statusUpdateSeq", sequenceName = "status_update_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "statusUpdateSeq")
    @Column(name = "id")
    private Long id;
}
