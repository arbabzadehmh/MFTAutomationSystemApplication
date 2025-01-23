package com.mftplus.mftautomationsystemapplication.attachment.model;

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

@Entity(name="attachmentTypeEntity")
@Table(name="attachment_type_tbl")
public class AttachmentType {

    @Id
    @SequenceGenerator(name = "attachmentTypeSeq", sequenceName = "attachment_type_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "attachmentTypeSeq")
    @Column(name = "id")
    private Long id;
}
