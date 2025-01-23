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

@Entity(name="documentEntity")
@Table(name="document_tbl")
public class Document {

    @Id
    @SequenceGenerator(name = "documentSeq", sequenceName = "document_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "documentSeq")
    @Column(name = "id")
    private Long id;
}
