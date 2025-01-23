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

@Entity(name="archiveItemEntity")
@Table(name="archive_item_tbl")
public class ArchiveItem {

    @Id
    @SequenceGenerator(name = "archiveItemSeq", sequenceName = "archive_item_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "archiveItemSeq")
    @Column(name = "id")
    private Long id;
}
