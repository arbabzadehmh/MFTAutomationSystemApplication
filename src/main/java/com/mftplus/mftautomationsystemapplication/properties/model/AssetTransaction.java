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

@Entity(name="assetTransactionEntity")
@Table(name="asset_transaction_tbl")
public class AssetTransaction {

    @Id
    @SequenceGenerator(name = "assetTransactionSeq", sequenceName = "asset_transaction_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "assetTransactionSeq")
    @Column(name = "id")
    private Long id;
}
