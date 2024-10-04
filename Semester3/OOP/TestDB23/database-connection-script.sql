drop database if exists giftDB;
create database giftDB;
use giftDB;   #remember!!!

#to create the table we need for the netbeans project
CREATE TABLE gifts_table(
	recipient varchar (255), 
	gift varchar (255), 
	URL varchar(255)
);

#test code 
INSERT INTO gifts_table VALUES("Paolo", "CD","url to whatever");
DELETE FROM gifts_table WHERE recipient ="Paolo" AND gift = "CD";
select * from gifts_table;

