package com.deyevs.inc.trainingsimulator.model

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.OneToMany
import javax.persistence.Table

@Entity
@Table(name = "ticket")
data class Ticket(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,

    @Column
    val number: Int,

    @OneToMany(mappedBy = "ticket")
    val questions: Set<Question>?
)
