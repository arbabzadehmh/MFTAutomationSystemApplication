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

@Entity(name="assetRoomEntity")
@Table(name="asset_room_tbl")
public class AssetRoom {

    @Id
    @SequenceGenerator(name = "assetRoomSeq", sequenceName = "asset_room_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "assetRoomSeq")
    @Column(name = "id")
    private Long id;
}
