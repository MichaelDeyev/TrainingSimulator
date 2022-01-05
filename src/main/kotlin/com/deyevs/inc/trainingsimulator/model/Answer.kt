package com.deyevs.inc.trainingsimulator.model

import java.util.UUID
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne

@Entity
data class Answer(
    @Id
    val id: UUID,

    @ManyToOne
    @JoinColumn(name = "question_id")
    val question: Question,

    @Column
    val text: String,

    @Column
    val isRight: Boolean
)
