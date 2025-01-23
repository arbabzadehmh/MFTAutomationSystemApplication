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

@Entity(name="personListEntity")
@Table(name="person_list_tbl")
public class PersonList {

    @Id
    @SequenceGenerator(name = "personListSeq", sequenceName = "person_list_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "personListSeq")
    @Column(name = "id")
    private Long id;
}
