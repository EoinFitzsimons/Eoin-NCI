drop database if exists giftDB;
create database giftDB;
use giftDb;


CREATE TABLE gifts_table(
    recipient varchar (255),
    gift varchar(255),
    URL varchar(255)
);

insert into gifts_table values ("name", "gift", "url");
select * from gifts_table;