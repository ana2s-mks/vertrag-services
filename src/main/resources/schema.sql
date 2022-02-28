DROP TABLE IF EXISTS KUNDE;
DROP TABLE IF EXISTS BANKVERBINDUNG;
DROP TABLE IF EXISTS ANSCHRIFT;

CREATE TABLE KUNDE
(
    ID                INT PRIMARY KEY,
    NAME              varchar(250) not null,
    VERSICHERUNGS_NR  varchar(250) not null,
    VORNAME           varchar(250) not null,
    ANSCHRIFT_ID      INT,
    BANKVERBINDUNG_ID INT
);

CREATE TABLE ANSCHRIFT
(
    ID      INT PRIMARY KEY,
    HAUS_NR varchar(250) not null,
    LAND    varchar(250) not null,
    ORT     varchar(250) not null,
    PLZ     varchar(250) not null,
    STRASSE varchar(250) not null
);

CREATE TABLE BANKVERBINDUNG
(
    ID INT PRIMARY KEY,
    BIC varchar(250) not null,
    BLZ varchar(250) not null,
    IBAN varchar(250) not null,
    INSTITUT varchar(250) not null,
    KONTO_NR varchar(250) not null
);

insert into KUNDE(ID, NAME, VERSICHERUNGS_NR, VORNAME, ANSCHRIFT_ID, BANKVERBINDUNG_ID)
VALUES (1,'name1', '123456789', 'vorname1', 2, 3);

insert into ANSCHRIFT(ID, HAUS_NR, LAND, ORT, PLZ, STRASSE)
VALUES (2, '1', 'Deutschland', 'Dortmund', '44225', 'strasse');

insert into BANKVERBINDUNG(ID, BIC, BLZ, IBAN, INSTITUT, KONTO_NR)
VALUES (3, '1234567890', '12345678', '1325467899218', 'Sparkasse', '2832918');

insert into KUNDE(ID, NAME, VERSICHERUNGS_NR, VORNAME, ANSCHRIFT_ID, BANKVERBINDUNG_ID)
VALUES (4, 'name2', '987654321', 'vorname2', 5, 6);

insert into ANSCHRIFT(ID, HAUS_NR, LAND, ORT, PLZ, STRASSE)
VALUES (5, '2', 'Deutschland', 'Bochum', '44225', 'strasse');

insert into BANKVERBINDUNG(ID, BIC, BLZ, IBAN, INSTITUT, KONTO_NR)
VALUES (6, '1987654321', '87654321', '5625467899123', 'PostBank', '2832918');