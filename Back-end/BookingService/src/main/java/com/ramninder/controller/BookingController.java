package com.ramninder.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ramninder.models.Booking;
import com.ramninder.services.IBookingServices;

@RestController
@RequestMapping("/bookings")
public class BookingController {
	
	private IBookingServices bookingServiceImp;
	
	@Autowired
	 public BookingController(IBookingServices bookingServiceImp) {
		 	this.bookingServiceImp = bookingServiceImp;
	 }
	
	@PostMapping
	public ResponseEntity<Booking> saveNewBooking(@RequestBody Booking b){
		return new ResponseEntity<Booking>(bookingServiceImp.saveBooking(b), HttpStatus.CREATED);	
	}
	
	@GetMapping
	public ResponseEntity<List<Booking>> findAllBookings(){
		
		return new ResponseEntity<List<Booking>>(bookingServiceImp.getAllBookings(), HttpStatus.OK);
	}

}
