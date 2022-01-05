package com.deyevs.inc.trainingsimulator.repository

import com.deyevs.inc.trainingsimulator.model.Ticket
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface TicketRepository : JpaRepository<Ticket, Long>
