package com.flight.service;

import com.flight.dto.ReservationRequest;
import com.flight.entities.Reservation;

public interface ReservationService {
	
	Reservation bookflight(ReservationRequest request);

}
