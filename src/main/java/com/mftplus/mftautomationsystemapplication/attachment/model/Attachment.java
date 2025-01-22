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

@Entity(name="attachmentEntity")
@Table(name="attachment_tbl")
public class Attachment {

    @Id
    @SequenceGenerator(name = "attachmentSeq", sequenceName = "attachment_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "attachmentSeq")
    @Column(name = "id")
    private Long id;
}
