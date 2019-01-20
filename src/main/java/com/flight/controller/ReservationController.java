package com.flight.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.flight.dao.FlightDAO;
import com.flight.dto.ReservationRequest;
import com.flight.entities.Flight;
import com.flight.entities.Reservation;
import com.flight.service.ReservationService;

@Controller
public class ReservationController {
	
	@Autowired
	private FlightDAO flightDAO; 
	@Autowired
	private ReservationService reservationService;
	
	@RequestMapping("/showCompleteReservationFlights")
	public String showCompleteReservationFlights(@RequestParam("flightId") Long flightId,ModelMap modelMap) {
		Flight flight=flightDAO.findOne(flightId);
		modelMap.addAttribute("flight", flight);
		
		return "completeReservation";
		
	}
	
	
	@RequestMapping(value="/completeReservation",method=RequestMethod.POST)
	public String completeReservation(ReservationRequest request,ModelMap map) {
		Reservation reservation=reservationService.bookflight(request);
		System.out.println("In complete Reservation controller..");
		System.out.println("Reservation Id:"+reservation.getId());
		
		map.addAttribute("msg", "Reservation created successfully and id is:"+reservation.getId());
		
		return "reservationConfirmation";
		
	}

}
