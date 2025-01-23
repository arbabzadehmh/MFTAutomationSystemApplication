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

@Entity(name="archiveItemStatusEntity")
@Table(name="archive_item_status_tbl")
public class ArchiveItemStatus {

    @Id
    @SequenceGenerator(name = "archiveItemStatusSeq", sequenceName = "archive_item_status_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "archiveItemStatusSeq")
    @Column(name = "id")
    private Long id;
}
