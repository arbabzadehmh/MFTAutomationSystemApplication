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

@Entity(name="archiveRoomEntity")
@Table(name="archive_room_tbl")
public class ArchiveRoom {

    @Id
    @SequenceGenerator(name = "archiveRoomSeq", sequenceName = "archive_room_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "archiveRoomSeq")
    @Column(name = "id")
    private Long id;
}
