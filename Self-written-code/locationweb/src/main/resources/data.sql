use projectdb;

create table location(
id int PRIMARY KEY,
code varchar(20),
name varchar(20),
type varchar(10));

select * from location;

//if you want to delete something...
drop table location WHERE " ";