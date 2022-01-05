package com.deyevs.inc.trainingsimulator.controller

import com.deyevs.inc.trainingsimulator.model.Ticket
import com.deyevs.inc.trainingsimulator.repository.TicketRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/ticket")
class TicketController(
    private val ticketRepository: TicketRepository
) {

    @GetMapping("/all")
    fun getAllTickets(): MutableList<Ticket> {
        return ticketRepository.findAll()
    }

    @PostMapping
    fun createTicket(@RequestBody ticket: Ticket): Ticket {
        return ticketRepository.save(ticket)
    }
}
