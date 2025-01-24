package com.mftplus.mftautomationsystemapplication.workflow.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;

@MappedSuperclass
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@EntityListeners(AuditingEntityListener.class)
public abstract class AbstractBaseEntity
{
    @Id
    @SequenceGenerator(name = "requestPrioritySeq", sequenceName = "request_priority_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "requestPrioritySeq")
    @Column(name = "id")
    private Long id;

    @Version
    private Long version;

    @CreatedDate
    private Date createdDateAndTime;

    @LastModifiedDate
    private Date lastModifiedDateAndTime;
}