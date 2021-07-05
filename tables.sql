drop schema if exists services cascade;

create schema services;
set schema 'services';

create table bookings (
	
	booking_id serial primary key,
	cutomer_name text not null,
	checkin_date timestamp not null,
	checkout_date timestamp not null
);
CREATE TABLE USER 
(
ID INT NOT NULL AUTO_INCREMENT,
FIRST_NAME VARCHAR(20),
LAST_NAME VARCHAR(20),
EMAIL VARCHAR(20),
PASSWORD VARCHAR(256), 
PRIMARY KEY (ID),
UNIQUE KEY (EMAIL)
);

CREATE TABLE ROLE 
(
ID INT NOT NULL AUTO_INCREMENT,
NAME VARCHAR(20),
PRIMARY KEY (ID)
);

CREATE TABLE USER_ROLE(
USER_ID int,
ROLE_ID int,
FOREIGN KEY (user_id) REFERENCES USER(id),
FOREIGN KEY (role_id) REFERENCES ROLE(id)
);


INSERT INTO bookings
(cutomer_name, checkin_date, checkout_date)
VALUES('Guru', '2015-01-10', '2015-05-10');