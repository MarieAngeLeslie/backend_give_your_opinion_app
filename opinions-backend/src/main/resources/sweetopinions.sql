create table clients
(
    ID serial primary key not null ,
    EMAIL varchar(50)
);

create table opinions
(
    ID serial primary key not null,
    Tell_us varchar(50),
    Type varchar(10),
    CLIENT_ID integer,
    constraint client_fk foreign key (CLIENT_ID) REFERENCES clients(ID)
);