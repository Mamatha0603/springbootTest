package com.flight.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flight.entities.Reservation;

public interface ReservationDAO extends JpaRepository<Reservation, Long> {

}
