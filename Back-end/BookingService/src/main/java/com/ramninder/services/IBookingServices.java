package com.ramninder.services;

import java.util.List;

import com.ramninder.models.Booking;

public interface IBookingServices {

		public Booking saveBooking(Booking saveBookings);
		public List<Booking> getAllBookings();
}
