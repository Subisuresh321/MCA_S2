use school;
create table Customer(
	custid int primary key,
    name varchar(20) not null);
create table Sales(
	custid int,
    product varchar(20) not null,
    foreign key(custid) references Customer(custid));

insert into Customer values(1,'ABC'),(2,'DEF'),(3,'GHI');
insert into Sales values(1,'pen'),(1,'pencil'),(2,'pen');

desc Sales;
select Customer.name,Sales.product from Customer join Sales on Customer.custid=Sales.custid;

drop table sales;

create table Product(
	pid int primary key,
    product varchar(20) not null);

create table Sales(
	custid int,
    productid int,
    foreign key(custid) references Customer(custid),
     foreign key(productid) references Product(pid));

desc Sales;

insert into Product values(101,'pencil'),(102,'pen'),(103,'eraser');
insert into Sales values(1,101),(1,102),(2,101);

select Product.product,count(Customer.custid) from Customer join Sales on Customer.custid=Sales.custid join Product on Sales.productid=Product.pid group by Product.pid having count(Customer.custid)>=2;
select Customer.name,Product.product from Customer join Sales on Customer.custid=Sales.custid join Product on Sales.productid=Product.pid;