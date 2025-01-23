package com.mftplus.mftautomationsystemapplication.projectmanager.model;

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

@Entity(name="commentEntity")
@Table(name="comment_tbl")
public class Comment {

    @Id
    @SequenceGenerator(name = "commentSeq", sequenceName = "comment_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "commentSeq")
    @Column(name = "id")
    private Long id;
}
