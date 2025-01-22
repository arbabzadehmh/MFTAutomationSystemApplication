package com.mftplus.mftautomationsystemapplication.humanresource.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@SuperBuilder
@ToString

@Entity(name = "contractEntity")
@Table(name = "contract_tbl")
public class Contract {
    @Id
    @SequenceGenerator(name = "contractSeq", sequenceName = "contract_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "contractSeq")
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "contract_insurance_tbl",
            joinColumns = @JoinColumn(name = "contract_id"),
            inverseJoinColumns = @JoinColumn(name = "insurance_id"),
            foreignKey = @ForeignKey(name = "fk_contract_insurance"),
            inverseForeignKey = @ForeignKey(name = "fk_inverse_contract_insurance")
    )
    private List<Insurance> insuranceList;

    @OneToOne
    @JoinColumn(
            name = "contract_type_id",
            foreignKey = @ForeignKey(name = "fk_contract_contract_type")
    )
    private ContractType contractType;

    @OneToOne
    @JoinColumn(
            name = "tax_id",
            foreignKey = @ForeignKey(name = "fk_contract_tax")
    )
    private Tax tax;


}
