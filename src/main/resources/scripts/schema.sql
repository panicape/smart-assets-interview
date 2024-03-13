create user TEST_USER PASSWORD 'TEST_USER';
CREATE SCHEMA SMART_ASSETS AUTHORIZATION TEST_USER;
create table BRAND (
    ID int,
    NAME varchar(255),
    DATE_CREATE varchar(10),
    DATE_UPDATE varchar(10),
    PRIMARY KEY (ID)
);

create table CREATIVE (
    C1_ID int,
    NAME varchar(255),
    DATE_CREATE varchar(10),
    DATE_UPDATE varchar(10),
    C1_BRAND_ID int,
    PRIMARY KEY (C1_ID),
    FOREIGN KEY (C1_BRAND_ID) REFERENCES BRAND(ID)
);

create table CAMPAIGN (
    C2_ID int,
    NAME varchar(255),
    DATE_CREATE varchar(10),
    DATE_UPDATE varchar(10),
    C2_BRAND_ID int,
    PRIMARY KEY (C2_ID),
    FOREIGN KEY (C2_BRAND_ID) REFERENCES BRAND(ID)
);