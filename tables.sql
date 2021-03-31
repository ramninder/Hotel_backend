drop schema if exists services cascade;

create schema services;
set schema 'services';

create table bookings (
	
	booking_id serial primary key,
	cutomer_name text not null,
	checkin_date timestamp not null,
	checkout_date timestamp not null
);

INSERT INTO bookings
(cutomer_name, checkin_date, checkout_date)
VALUES('Guru', '2015-01-10', '2015-05-10');