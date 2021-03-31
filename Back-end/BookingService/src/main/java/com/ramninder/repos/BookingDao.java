package com.ramninder.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ramninder.models.Booking;

@Repository
public interface BookingDao extends JpaRepository<Booking, Integer> {

}
