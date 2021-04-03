CREATE TABLE oppDetails
(
oppId SERIAL PRIMARY KEY,
oppTitle varchar(500) NOT NULL,
oppDescription varchar(5000) NOT NULL,
oppStartDate varchar(100) NOT NULL,
oppEndDate varchar(100) NOT NULL,
oppDailyHrs varchar(100) NOT NULL,
oppLocationArea varchar(2000) NOT NULL,
oppLocationCity varchar(1000) NOT NULL,
oppLocationState varchar(500) NOT NULL,
oppCreatorEmail varchar(100) NOT NULL,
	

);


CREATE TABLE volunteerDetails
(
	regId SERIAL PRIMARY KEY,
	oppId varchar(100) NOT NULL,
	volEmail varchar(500),
	volMobile varchar(500),
	volHrs varchar(100),
	volReason varchar(2000)
);