package com.mftplus.mftautomationsystemapplication.meetingmanagement.model;


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

@Entity(name="topicEntity")
@Table(name="topic_tbl")
public class Topic {

    @Id
    @SequenceGenerator(name = "topicSeq", sequenceName = "topic_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "topicSeq")
    @Column(name = "id")
    private Long id;
}
