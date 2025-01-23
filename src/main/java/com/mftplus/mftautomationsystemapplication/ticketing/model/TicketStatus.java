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

@Entity(name="ticketStatusEntity")
@Table(name="ticket_status_tbl")
public class TicketStatus {

    @Id
    @SequenceGenerator(name = "ticketStatusSeq", sequenceName = "ticket_status_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ticketStatusSeq")
    @Column(name = "id")
    private Long id;
}
