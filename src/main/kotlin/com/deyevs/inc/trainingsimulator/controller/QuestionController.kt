package com.deyevs.inc.trainingsimulator.controller

import com.deyevs.inc.trainingsimulator.model.Question
import com.deyevs.inc.trainingsimulator.repository.QuestionRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/question")
class QuestionController(
    private val questionRepository: QuestionRepository
) {
    @GetMapping("/all")
    fun getAllQuestions(): MutableList<Question> {
        return questionRepository.findAll()
    }

    @PostMapping
    fun createQuestion(@RequestBody question: Question): Question {
        return questionRepository.save(question)
    }
}
