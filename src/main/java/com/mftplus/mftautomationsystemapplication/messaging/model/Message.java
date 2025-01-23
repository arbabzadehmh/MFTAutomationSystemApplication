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

@Entity(name="messageEntity")
@Table(name="message_tbl")
public class Message {

    @Id
    @SequenceGenerator(name = "messageSeq", sequenceName = "message_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "messageSeq")
    @Column(name = "id")
    private Long id;
}
