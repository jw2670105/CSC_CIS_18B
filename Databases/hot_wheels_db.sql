drop table EMPLOYEE;
drop table SCHEDULE;
drop table CAR;
drop table LESSON;
drop table CLIENT; 
drop table DMV_TEST;
drop table OWNS;
drop table INTERVIEW;
drop table FIRST_LESSON;

CREATE TABLE EMPLOYEE(
	I_SSN VARCHAR(11),
	LNAME VARCHAR(14),
	FNAME VARCHAR(14),
 	GENDER CHAR(1),	 
	DOB DATE,  
	TITLE VARCHAR(24),  
	SALARY NUMERIC(2, 10), 
	POSITION VARCHAR(24),  
	OF_ID VARCHAR(5),
    PRIMARY KEY (I_SSN)
);

CREATE TABLE SCHEDULE(
	INS_SSN VARCHAR(11),
	EVENT VARCHAR(30),
	DATE_ DATE,
	B_TIME DATE,
    E_TIME DATE,
	PRIMARY KEY(INS_SSN, EVENT)
);

CREATE TABLE CAR(
	VEHICLE_ID VARCHAR(7),
	INS_SSN VARCHAR(11), 
	REG_NUM VARCHAR(8),
	FAULT_COUNT NUMERIC(1,6),    
	MILAGE NUMERIC(1,7),
	DATE_ DATE,
	CONSTRAINT vin
	PRIMARY KEY(VEHICLE_ID),
);

CREATE TABLE LESSON(
	LESSON_ID NUMERIC(1,5),
	OF_ID VARCHAR(5),
	COURSE_TIME DATE,
	COURSE_MILAGE NUMERIC(1,7),
	LINS_SSN  VARCHAR(11),
	FEE NUMERIC(2, 6),  
	RED_FEE NUMERIC(2,6),
    DATE_ DATE,
	PRIMARY KEY(LESSON_ID)
);	
   
CREATE TABLE CLIENT(
	C_SSN VARCHAR(11),
	LNAME VARCHAR(14),  
	FNAME  VARCHAR(14),
	GENDER  CHAR(1),
	DOB  DATE,
	PERMIT_NUM VARCHAR(8),
	ITV_STATUS VARCHAR(12),
	LESSON_ID NUMERIC(1,5),
	ACTIVE CHAR(1),
	PRIMARY KEY(C_SSN)
);

CREATE TABLE DMV_TEST(
	TYPE VARCHAR(8),
	STATUS VARCHAR(12),
	DATE_ DATE,
	PRIMARY KEY(TYPE,STATUS)
);

CREATE TABLE OFFICE       
	(OF_ID VARCHAR(5), 
	 MGR_SSN VARCHAR(11),
	 PHONE_NUM VARCHAR(13),
	 STREET VARCHAR(120),
	 CITY VARCHAR(28),
	 ZIP_CODE VARCHAR(10),
	 CONSTRAINT oficeid PRIMARY KEY(OF_ID, MGR_SS)
);   

CREATE TABLE OWNS(
	VEHICLE_ID VARCHAR(7),
	OF_ID VARCHAR(5),
    PRIMARY KEY(VEHICLE_ID, OF_ID)
);

CREATE TABLE INTERVIEW(
	INS_SSN VARCHAR(11),
	C_SSN  VARCHAR(11),
	DETAILS VARCHAR(128),
	PERMIT_NUM VARCHAR(8),
	PRIMARY KEY(INS_SSN, C_SSN)
);

CREATE TABLE FIRST_LESSON(
	C_SSN VARCHAR(11), 
	 I_SSN VARCHAR(11), 
	LESSON_ID VARCHAR(5),
	PRIMARY KEY(C_SSN, LESSON_ID)
);  
