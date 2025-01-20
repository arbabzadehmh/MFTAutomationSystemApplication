package com.mftplus.mftautomationsystemapplication.humanresource.model;

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

@Entity(name="taxEntity")
@Table(name="tax_tbl")
public class Tax {
    @Id
    @SequenceGenerator(name = "taxSeq",sequenceName = "tax_seq",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "taxSeq")
    @Column(name = "id")
    private Long id;

    @Column(name = "type")
    private String type;

    @Column(name="description")
    private String description;
}
