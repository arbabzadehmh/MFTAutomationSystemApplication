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

@Entity(name="inventoryAssetTransactionEntity")
@Table(name="inventory_asset_transaction_tbl")
public class InventoryAssetTransaction {

    @Id
    @SequenceGenerator(name = "inventoryAssetTransactionSeq", sequenceName = "inventory_asset_transaction_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "inventoryAssetTransactionSeq")
    @Column(name = "id")
    private Long id;
}
