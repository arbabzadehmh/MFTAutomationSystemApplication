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

@Entity(name="assetStatusEntity")
@Table(name="asset_status_tbl")
public class AssetStatus {

    @Id
    @SequenceGenerator(name = "assetStatusSeq", sequenceName = "asset_status_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "assetStatusSeq")
    @Column(name = "id")
    private Long id;
}
