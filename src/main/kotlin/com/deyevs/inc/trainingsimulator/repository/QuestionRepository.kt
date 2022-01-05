package com.deyevs.inc.trainingsimulator.repository

import com.deyevs.inc.trainingsimulator.model.Question
import org.springframework.data.jpa.repository.JpaRepository

interface QuestionRepository : JpaRepository<Question, Long>
