package com.deyevs.inc.trainingsimulator.model

import org.hibernate.annotations.GenericGenerator
import java.util.UUID
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.EnumType
import javax.persistence.Enumerated
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne
import javax.persistence.OneToMany

@Entity
data class Question(
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    val id: UUID,

    @Column
    @Enumerated(EnumType.STRING)
    val topic: Topic,

    @OneToMany(mappedBy = "question")
    val answers: Set<Answer>,

    @ManyToOne
    @JoinColumn(name = "ticket_id")
    val ticket: Ticket
)
