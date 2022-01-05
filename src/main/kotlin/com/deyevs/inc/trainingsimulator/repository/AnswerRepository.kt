package com.deyevs.inc.trainingsimulator.repository

import com.deyevs.inc.trainingsimulator.model.Answer
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface AnswerRepository : JpaRepository<Answer, Long>
