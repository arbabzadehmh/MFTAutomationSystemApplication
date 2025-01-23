package com.mftplus.mftautomationsystemapplication.document.model;

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

@Entity(name="documentGroupEntity")
@Table(name="document_group_tbl")

public class DocumentGroup {

    @Id
    @SequenceGenerator(name = "documentGroupSeq", sequenceName = "document_group_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "documentGroupSeq")
    @Column(name = "id")
    private Long id;
}
