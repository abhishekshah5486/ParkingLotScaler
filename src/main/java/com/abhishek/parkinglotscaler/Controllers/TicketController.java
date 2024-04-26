package com.abhishek.parkinglotscaler.Controllers;

import com.abhishek.parkinglotscaler.Dtos.IssueTicketRequestDto;
import com.abhishek.parkinglotscaler.Dtos.IssueTicketResponseDto;
import com.abhishek.parkinglotscaler.Exceptions.InvalidGateIDException;
import com.abhishek.parkinglotscaler.Models.Ticket;
import com.abhishek.parkinglotscaler.Services.TicketService;
import org.springframework.stereotype.Controller;

@Controller
public class TicketController {
    private TicketService ticketService;
    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }
    public IssueTicketResponseDto generateTicket(IssueTicketRequestDto issueTicketRequestDto) throws InvalidGateIDException {
        Ticket ticket =  ticketService.generateTicket(issueTicketRequestDto.getId(), issueTicketRequestDto.getVehicleType(), issueTicketRequestDto.getVehicleNumber(), issueTicketRequestDto.getVehicleOwner());
        IssueTicketResponseDto issueTicketResponseDto = new IssueTicketResponseDto();

        return issueTicketResponseDto;
    }
}
