package com.mftplus.mftautomationsystemapplication.archives.model;


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

@Entity(name="archiveItemTypeEntity")
@Table(name="archive_item_type_tbl")
public class ArchiveItemType {
    @Id
    @SequenceGenerator(name = "archiveItemTypeSeq", sequenceName = "archive_item_type_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "archiveItemTypeSeq")
    @Column(name = "id")
    private Long id;
}
