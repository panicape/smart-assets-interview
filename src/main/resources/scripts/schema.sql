create user TEST_USER PASSWORD 'TEST_USER';
CREATE SCHEMA SMART_ASSETS AUTHORIZATION TEST_USER;
create table BRAND (
    BRAND_ID int,
    NAME varchar(255),
    DATE_CREATE varchar(10),
    DATE_UPDATE varchar(10),
    PRIMARY KEY (BRAND_ID)
);

create table CREATIVE (
    ID int,
    NAME varchar(255),
    DATE_CREATE varchar(10),
    DATE_UPDATE varchar(10),
    C1_BRAND_ID int,
    PRIMARY KEY (ID),
    FOREIGN KEY (C1_BRAND_ID) REFERENCES BRAND(BRAND_ID)
);

create table CAMPAIGN (
    ID int,
    NAME varchar(255),
    DATE_CREATE varchar(10),
    DATE_UPDATE varchar(10),
    C2_BRAND_ID int,
    PRIMARY KEY (ID),
    FOREIGN KEY (C2_BRAND_ID) REFERENCES CREATIVE(ID)
);