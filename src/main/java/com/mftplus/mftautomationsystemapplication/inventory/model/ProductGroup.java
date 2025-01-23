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

@Entity(name="productGroupEntity")
@Table(name="productGroup_tbl")
public class ProductGroup {

    @Id
    @SequenceGenerator(name = "productGroupSeq", sequenceName = "product_group_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "productGroupSeq")
    @Column(name = "id")
    private Long id;
}
