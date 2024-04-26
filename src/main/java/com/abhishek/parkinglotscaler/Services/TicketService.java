package com.abhishek.parkinglotscaler.Services;

import com.abhishek.parkinglotscaler.Exceptions.InvalidGateIDException;
import com.abhishek.parkinglotscaler.Models.*;
import com.abhishek.parkinglotscaler.Repositories.GateRepository;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;

@Service
public class TicketService {

    private GateRepository gateRepository;
    public TicketService(GateRepository gateRepository) {
        this.gateRepository = gateRepository;
    }

    public Ticket generateTicket(Long gateId, VehicleType vehicleType, String vehicleNumber, String vehicleOwner) throws  InvalidGateIDException {
        Ticket ticket = new Ticket();
//        private String number; //
//        private Date entryTime;
//        private VehicleOwner vehicleOwner;
//        private Vehicle vehicle;
//        private Operator operator; //
//        private Gate entryGate; //
//        private ParkingSpot parkingSpot;
        Optional<Gate> optionalGate = gateRepository.findById(gateId);
        if (optionalGate.isEmpty()){
            throw new InvalidGateIDException("Invalid Gate ID Passed !");
        }
        ticket.setEntryGate(optionalGate.get());
        ticket.setNumber(vehicleNumber);
        ticket.setOperator(ticket.getEntryGate().getOperator());

        // Create a vehicle repository

        /// check if vehicle is present in the db or not
        // if not throw some error
        //
        return ticket;
    }
}
