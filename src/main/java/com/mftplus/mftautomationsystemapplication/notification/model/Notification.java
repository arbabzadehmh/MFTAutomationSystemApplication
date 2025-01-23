package com.mftplus.mftautomationsystemapplication.notification.model;


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

@Entity(name="notificationEntity")
@Table(name="notification_tbl")
public class Notification {

    @Id
    @SequenceGenerator(name = "notificationSeq", sequenceName = "notification_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "notificationSeq")
    @Column(name = "id")
    private Long id;
}
