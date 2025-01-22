package com.mftplus.mftautomationsystemapplication.correspondence.model;

import com.mftplus.mftautomationsystemapplication.users.model.User;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
@Setter
@SuperBuilder
@ToString

@Entity(name="letterDetailEntity")
@Table(name="letter_detail_tbl")
public class LetterDetail {

    @Id
    @SequenceGenerator(name = "letterDetailSeq", sequenceName = "letter_detail_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "letterDetailSeq")
    @Column(name = "id")
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(
            name = "priority_id",
            foreignKey = @ForeignKey(name = "fk_letter_detail_priority")
    )
    private LetterPriority priority;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(
            name = "status_id",
            foreignKey = @ForeignKey(name = "fk_letter_detail_status")
    )
    private LetterStatus status;

    @Column(name = "last_update")
    private LocalDateTime lastUpdate;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(
            name = "detail_changer_id",
            foreignKey = @ForeignKey(name = "fk_letter_detail_changer")
    )
    private User detailChangeUser;
}
