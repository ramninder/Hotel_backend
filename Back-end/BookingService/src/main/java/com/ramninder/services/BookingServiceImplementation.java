package com.ramninder.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ramninder.models.Booking;
import com.ramninder.repos.BookingDao;

@Service
public class BookingServiceImplementation implements IBookingServices {
	
	private BookingDao bDao;
	
	@Autowired
	public BookingServiceImplementation(BookingDao bDao) {
				this.bDao = bDao;
	}

	
	public Booking saveBooking(Booking saveBookings) {
		
		return bDao.saveAndFlush(saveBookings) ;
	}

	public List<Booking> getAllBookings() {
		
		return bDao.findAll();
	}

}
