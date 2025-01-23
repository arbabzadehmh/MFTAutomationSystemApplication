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

@Entity(name="sectionListEntity")
@Table(name="section_list_tbl")
public class SectionList {

    @Id
    @SequenceGenerator(name = "sectionListSeq", sequenceName = "section_list_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sectionListSeq")
    @Column(name = "id")
    private Long id;
}
