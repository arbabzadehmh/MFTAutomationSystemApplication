package com.mftplus.mftautomationsystemapplication.users.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;


import java.util.Set;

@NoArgsConstructor
@Getter
@Setter
@SuperBuilder
@ToString

@Entity(name="roleEntity")
@Table(name="role_tbl")
public class Role {

    @Id
    @Column(name = "name", length = 30)
    private String name;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "role_permission_tbl",
            joinColumns = @JoinColumn(name = "role_name"),
            inverseJoinColumns = @JoinColumn(name = "permission"),
            foreignKey = @ForeignKey(name = "fk_role_permission"),
            inverseForeignKey = @ForeignKey(name = "fk_inverse_role_permission")
    )
    private Set<Permission> permissionSet;
}
