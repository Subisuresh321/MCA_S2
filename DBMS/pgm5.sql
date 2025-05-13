create database subi;
use subi;
call test(-1);
call is_palindrome("subi");
call is_palindrome("malayalam");
call even_odd(2);
call even_odd(5);
call grade(60);
call grade(95);
call grade(42);
call day(5);
call day(23);
call week_day('2003-03-25');
call factorial(5);

use school;
create view v1 as select Course_name,Course_number from course;
select * from v1;

create database store;
use store;

create table customer(name varchar(20), cid int primary key); 
insert into customer values
("thahira",100),
("arsha",101),
("devika",102),
("nazrin",103);
select * from customer;

create table product(pname varchar(20), pid int primary key, stock int); 
insert into product values
("pen",201,50),
("pencil",202,25);

create table sales(
			cid int, 
            pid int, 
            quantity int,
            foreign key(cid) references customer(cid),
            foreign key(pid) references product(pid)
            );


create trigger t2 
after insert on sales
for each row
update product set stock=stock-new.quantity where pid=new.pid;


insert into sales values
(102,201,10),
(103,202,5),
(102,202,3);

select * from sales;
select * from product;
select * from customer;



insert into sales values
(101,201,40);


delete from customer where cid=102;

create table record(
	pid int,
    pre_stock int,
    post_stock int,
    foreign key(pid) references product(pid)
    );
update product set stock=50 where pid=201;
update product set stock=25 where pid=202;

insert into sales values
(101,201,20),
(103,201,8),
(100,202,30);

select * from record;



