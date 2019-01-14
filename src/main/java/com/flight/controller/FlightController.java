package com.flight.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.flight.dao.FlightDAO;
import com.flight.entities.Flight;

@Controller
public class FlightController {
	@Autowired
	private FlightDAO flightDAO;
	
	@RequestMapping(value="/findFlights")
	public String findFlights(@RequestParam("from") String from,@RequestParam("to") String to,@RequestParam("departureDate")
	@DateTimeFormat(pattern="MM-dd-yyyy") Date departureDate, ModelMap modelMap) {
		
		List<Flight> flights=flightDAO.fingFlights(from, to, departureDate);
		modelMap.addAttribute("flights",flights);
		
		System.out.println(flights.size());
		return "displayFlights";
	}

}
