package com.mftplus.mftautomationsystemapplication.properties.model;


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

@Entity(name="assetEntity")
@Table(name="asset_tbl")
public class Asset {

    @Id
    @SequenceGenerator(name = "assetSeq", sequenceName = "asset_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "assetSeq")
    @Column(name = "id")
    private Long id;
}
