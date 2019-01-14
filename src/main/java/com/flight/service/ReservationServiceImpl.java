package com.flight.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.flight.dao.FlightDAO;
import com.flight.dao.PassengerDAO;
import com.flight.dao.ReservationDAO;
import com.flight.dto.ReservationRequest;
import com.flight.entities.Flight;
import com.flight.entities.Passenger;
import com.flight.entities.Reservation;

public class ReservationServiceImpl implements ReservationService {
	 @Autowired
	 private FlightDAO flightDAO;
	 
	 @Autowired
	 PassengerDAO passengerDAO;
	 @Autowired
	 ReservationDAO reservationDAO;

	@Override
	public Reservation bookflight(ReservationRequest request) {
		
		Long flightId=request.getFlightId();
		Flight flight=flightDAO.findOne(flightId);
		
		Passenger passenger=new Passenger();
		passenger.setFirstname(request.getPassengerFirstName());
		passenger.setLastname(request.getPassengerLastName());
		passenger.setEmail(request.getPassengerEmail());
		passenger.setPhone(request.getPassengerPhone());
		
		Passenger savedPassenger=passengerDAO.save(passenger);
		
		Reservation reservation=new Reservation();
	   reservation.setFlight(flight);
	   reservation.setPassenger(savedPassenger);
	   reservation.setCheckedIn(false);
	  
		
		
		

		return null;
	}

}
