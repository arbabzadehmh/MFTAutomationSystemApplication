package com.mftplus.mftautomationsystemapplication.archives.model;

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

@Entity(name="accessLogEntity")
@Table(name="access_log_tbl")
public class AccessLog {

    @Id
    @SequenceGenerator(name = "accessLogSeq", sequenceName = "access_log_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "accessLogSeq")
    @Column(name = "id")
    private Long id;
}
