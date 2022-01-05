package com.deyevs.inc.trainingsimulator.model

import java.util.UUID
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.OneToMany

@Entity
data class Ticket(
    @Id
    val id: UUID,

    @Column
    val number: Int,

    @OneToMany(mappedBy = "ticket")
    val questions: Set<Question>
)
