package com.flight.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.flight.entities.Flight;


public interface FlightDAO extends JpaRepository<Flight, Long> {
	
	
	@Query("from Flight where departurecity=:departurecity and arrivalCity=:arrivalCity and dateOfDeparture=:dateOfDeparture ")
	List<Flight> fingFlights(@Param("departurecity") String from,@Param("arrivalCity") String to, @Param("dateOfDeparture") Date departureDate);

	
}
