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

@Entity(name="messageNotificationEntity")
@Table(name="mesaage_notification_tbl")
public class MessageNotification {

    @Id
    @SequenceGenerator(name = "messageNotificationSeq", sequenceName = "message_notification_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "messageNotificationSeq")
    @Column(name = "id")
    private Long id;
}
