package com.deyevs.inc.trainingsimulator.controller

import com.deyevs.inc.trainingsimulator.model.Answer
import com.deyevs.inc.trainingsimulator.repository.AnswerRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/answer")
class AnswerController(
    private val answerRepository: AnswerRepository
) {
    @GetMapping("/all")
    fun getAllQuestions(): MutableList<Answer> {
        return answerRepository.findAll()
    }

    @PostMapping
    fun createQuestion(@RequestBody answer: Answer): Answer {
        return answerRepository.save(answer)
    }
}
