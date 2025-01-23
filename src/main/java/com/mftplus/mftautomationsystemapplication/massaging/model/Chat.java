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

@Entity(name="chatEntity")
@Table(name="chat_tbl")
public class Chat {

    @Id
    @SequenceGenerator(name = "chatSeq", sequenceName = "chat_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "chatSeq")
    @Column(name = "id")
    private Long id;
}
