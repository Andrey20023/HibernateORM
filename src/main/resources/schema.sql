create schema newtest;

create table newtest.PERSONS
(
    name           varchar(50) NOT NULL,
    surname        varchar(50) NOT NULL,
    age            int         NOT NULL,
    primary key (name, surname, age),
    phone_number   DECIMAL,
    city_of_living varchar(90)
);


