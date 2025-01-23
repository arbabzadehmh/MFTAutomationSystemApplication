package com.mftplus.mftautomationsystemapplication.massaging.model;


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

@Entity(name="messageAttachmentEntity")
@Table(name="message_attachment_tbl")
public class MessageAttachment {

    @Id
    @SequenceGenerator(name = "messageAttachmentSeq", sequenceName = "message_attachment_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "messageAttachmentSeq")
    @Column(name = "id")
    private Long id;
}
