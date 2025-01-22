package com.mftplus.mftautomationsystemapplication.correspondence.model;


import com.mftplus.mftautomationsystemapplication.users.model.User;
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

@Entity(name = "paraphEntity")
@Table(name = "paraph_tbl")
public class Paraph {

    @Id
    @SequenceGenerator(name = "paraphSeq", sequenceName = "paraph_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "paraphSeq")
    @Column(name = "id")
    private Long id;

    @Column(name = "text")
    private String text;

    @ManyToOne
    @JoinColumn(
            name = "author_id",
            foreignKey = @ForeignKey(name = "fk_paraph_user")
    )
    private User author;
}
