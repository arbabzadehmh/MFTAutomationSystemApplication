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

@Entity(name="inventoryProductEntity")
@Table(name="inventory_product_tbl")
public class InventoryProduct {

    @Id
    @SequenceGenerator(name = "inventoryProductSeq", sequenceName = "inventory_product_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "inventoryProductSeq")
    @Column(name = "id")
    private Long id;
}
