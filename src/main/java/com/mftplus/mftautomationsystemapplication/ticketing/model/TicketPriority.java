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

@Entity(name="ticketPriorityEntity")
@Table(name="ticket_priority_tbl")
public class TicketPriority {

    @Id
    @SequenceGenerator(name = "ticketPrioritySeq", sequenceName = "ticket_priority_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ticketPrioritySeq")
    @Column(name = "id")
    private Long id;
}
