package com.flight.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.flight.dao.ReservationDAO;
import com.flight.dto.ReservationUpdateRequest;
import com.flight.entities.Reservation;

@RestController
public class ReservationRestController {
	@Autowired
	private ReservationDAO reservationDAO;

	@RequestMapping("/reservations/{id}")
	public Reservation findReservation(@PathVariable("id") Long id) {
		Reservation reservation=reservationDAO.findOne(id);
		return reservation;
		
	}
	@RequestMapping("/reservations")
	public @ResponseBody Reservation updateReservation(ReservationUpdateRequest request) {
		Reservation reservation=reservationDAO.findOne(request.getId());
		//reservation.setNumberOfBags(request.getNoOfBags());
		reservation.setCheckedIn(request.getCheckedIn());
		
		Reservation updatedReservation=reservationDAO.save(reservation);
		return updatedReservation;
		
		
		

	}
}
