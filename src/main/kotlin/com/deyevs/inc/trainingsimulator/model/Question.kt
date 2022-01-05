package com.deyevs.inc.trainingsimulator.model

import com.fasterxml.jackson.annotation.JsonBackReference
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.EnumType
import javax.persistence.Enumerated
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne
import javax.persistence.OneToMany
import javax.persistence.Table

@Entity
@Table(name = "question")
data class Question(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,

    @Column
    @Enumerated(EnumType.STRING)
    val topic: Topic,

    @Column
    val questionText: String,

    @OneToMany(mappedBy = "question")
    @JsonBackReference
    val answers: Set<Answer>?,

    @ManyToOne
    @JoinColumn(name = "ticket_id")
    val ticket: Ticket?
)
