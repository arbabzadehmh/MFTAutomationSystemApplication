package com.mftplus.mftautomationsystemapplication.ticketing.model;


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

@Entity(name="ticketGroupEntity")
@Table(name="ticket_group_tbl")
public class TicketGroup {

    @Id
    @SequenceGenerator(name = "ticketGroupSeq", sequenceName = "ticket_group_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ticketGroupSeq")
    @Column(name = "id")
    private Long id;
}
