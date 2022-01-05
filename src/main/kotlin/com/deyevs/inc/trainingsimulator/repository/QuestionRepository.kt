package com.deyevs.inc.trainingsimulator.repository

import com.deyevs.inc.trainingsimulator.model.Question
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface QuestionRepository : JpaRepository<Question, Long>
