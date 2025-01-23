package com.mftplus.mftautomationsystemapplication.inventory.model;

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

@Entity(name="inventoryTransactionEntity")
@Table(name="inventory_transaction_tbl")
public class InventoryTransaction {

    @Id
    @SequenceGenerator(name = "inventoryTransactionSeq", sequenceName = "inventory_transaction_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "inventoryTransactionSeq")
    @Column(name = "id")
    private Long id;
}
