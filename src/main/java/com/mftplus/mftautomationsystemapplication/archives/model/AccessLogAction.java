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

@Entity(name="accessLogActionEntity")
@Table(name="access_log_action_tbl")
public class AccessLogAction {

    @Id
    @SequenceGenerator(name = "accessLogActionSeq", sequenceName = "access_log_action_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "accessLogActionSeq")
    @Column(name = "id")
    private Long id;
}
