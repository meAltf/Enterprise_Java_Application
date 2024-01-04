create database customerdb

use customerdb

create table customer(
id int PRIMARY KEY AUTO_INCREMENT
cname varchar(40)
cemail varchar(30)
)

select * from customer