create database company;
use company;
create table jobs (job_id varchar(10) primary key, job_title varchar(50), min_salary
double(10,2),max_salary double(10,2));
create table regions(region_id varchar(10) primary key,region_name varchar(50));
create table countries(country_id varchar(10) primary key, country_name varchar(50), region_id
varchar(10) ,foreign key (region_id) references regions(region_id));
create table locations(location_id varchar(10) primary key, street_address varchar(50), postal_code
varchar(50), city varchar(50),state_province varchar(50),country_id varchar(10), foreign key
(country_id) references countries(country_id));
create table departments(department_id varchar(10) primary key, department_name varchar(50),
location_id varchar(10),foreign key (location_id)references locations(location_id));
create table employees(employee_id varchar(10) primary key, first_name varchar(50),last_name
varchar(50),email varchar(50),phone_number varchar(50), hire_date date,job_id varchar(10), salary
double(10,2), manager_id varchar(10), department_id varchar(10),foreign key (department_id)
references departments(department_id),foreign key(job_id)references jobs (job_id), foreign
key(manager_id)references employees(employee_id));
create table dependents(dependent_id varchar(10),first_name varchar(50),last_name
varchar(50),relationship varchar(50), employee_id varchar(10),foreign key (employee_id)references
employees(employee_id));

desc employees;
alter table departments rename dept;
alter table employees modify column salary SMALLINT;
alter table employees add commission varchar(50);

INSERT INTO regions(region_id,region_name) VALUES ('1','Europe'), ('2','Americas'), ('3','Asia'),
('4','Middle East and Africa');

INSERT INTO countries (country_id,country_name,region_id) VALUES
('AR','Argentina','2'), ('AU','Australia','3'), ('BE','Belgium','1'), ('BR','Brazil','2'),
('CA','Canada','2'), ('CH','Switzerland','1'), ('CN','China','3'), ('DE','Germany','1'),
('DK','Denmark','1'), ('EG','Egypt','4'), ('FR','France','1'), ('HK','HongKong','3'),
('IL','Israel','4'), ('IN','India','3'), ('IT','Italy','1'), ('JP','Japan','3'), ('KW','Kuwait','4'),
('MX','Mexico','2'), ('NG','Nigeria','4'), ('NL','Netherlands','1'), ('SG','Singapore','3'),
('UK','United Kingdom','1'), ('US','United States of America','2'), ('ZM','Zambia','4'),
('ZW','Zimbabwe','4');

INSERT INTO locations(location_id,street_address,postal_code,city,state_province,country_id)
VALUES ('1400','2014 Jabberwocky Rd','26192','Southlake','Texas','US'), ('1500','2011 Interiors
Blvd','99236','South San Francisco','California','US'), ('1700','2004 Charade Rd', '98199',' Seattle',
'Washington','US'), ('1800','147 Spadina Ave','M5V 2L7', 'Toronto', 'Ontario', 'CA'), ('2400','8204
Arthur St',NULL,'London',NULL,'UK'), ('2500','Magdalen Centre, The Oxford Science Park',
'OX99ZB','Oxford','Oxford','UK'), ('2700','Schwanthalerstr. 7031','80925','Munich','Bavaria','DE');

INSERT INTO jobs(job_id,job_title,min_salary,max_salary) VALUES ('1','Public Accountant',
4200.00,9000.00), ('2','Accounting Manager',8200.00,16000.00), ('3','Administration Assistant',
3000.00,6000.00), ('4','President',20000.00,40000.00), ('5','Administration Vice President',
15000.00,30000.00), ('6','Accountant',4200.00,9000.00), ('7','Finance Manager',8200.00,16000.00),
('8','Human Resources Representative',4000.00,9000.00), ('9','Programmer',4000.00,10000.00),
('10','Marketing Manager',9000.00,15000.00), ('11','Marketing Representative',4000.00,9000.00),
('12','Public Relations Representative',4500.00,10500.00), ('13','Purchasing Clerk',2500.00,5500.00),
('14','Purchasing Manager',8000.00,15000.00), ('15','Sales Manager',10000.00,20000.00), ('16','Sales
Representative',6000.00,12000.00), ('17','Shipping Clerk',2500.00,5500.00), ('18','Stock Clerk',
2000.00,5000.00), ('19','Stock Manager',5500.00,8500.00);

INSERT INTO dept(department_id,department_name,location_id) VALUES
('1','Administration','1700'), ('2','Marketing','1800'), ('3','Purchasing','1700'), ('4','Human Resources',
'2400'), ('5','Shipping','1500'), ('6','IT','1400'), ('7','Public Relations','2700'), ('8','Sales','2500'),
('9','Executive','1700'), ('10','Finance','1700'), (11,'Accounting',1700);


INSERT INTO employees(employee_id,first_name,last_name,email,phone_number,hire_date,
job_id, salary,manager_id,department_id) VALUES (100,'Steven','King',
'steven.king@sqltutorial.org','515.123.4567','1987-06-17',4,24000.00,NULL,9),
(101,'Neena','Kochhar','neena.kochhar@sqltutorial.org','515.123.4568','1989-09-21', 5,17000.00,
100,9), (102,'Lex','DeHaan','lex.de haan@sqltutorial.org','515.123.4569','1993-01-13',5,17000.00,
100,9), (103,'Alexander','Hunold','alexander.hunold@sqltutorial.org','590.423.4567','1990-01-03'
,9,9000.00,102,6), (104,'Bruce','Ernst','bruce.ernst@sqltutorial.org','590.423.4568','1991-05-21'
,9,6000.00,103,6), (105,'David','Austin','david.austin@sqltutorial.org','590.423.4569','1997-06-25'
,9,4800.00,103,6), (106,'Valli','Pataballa','valli.pataballa@sqltutorial.org','590.423.4560','1998-02-05'
,9,4800.00,103,6), (107,'Diana','Lorentz','diana.lorentz@sqltutorial.org','590.423.5567','1999-02-07'
,9,4200.00,103,6), (108,'Nancy','Greenberg','nancy.greenberg@sqltutorial.org',
'515.124.4569','1994-08-17',7,12000.00,101,10), (109,'Daniel','Faviet',
'daniel.faviet@sqltutorial.org','515.124.4169','1994-08-16',6,9000.00,108,10),
(110,'John','Chen','john.chen@sqltutorial.org','515.124.4269','1997-09-28',6,8200.00,108,10);



INSERT INTO dependents(dependent_id,first_name,last_name,relationship,employee_id) VALUES
(1,'Penelope','Gietz','Child',104), (2,'Nick','Higgins','Child',103), (3,'Ed','Whalen','Child',106),
(4,'Jennifer','King','Child',100), (5,'Johnny','Kochhar','Child',101), (6,'Bette','De Haan','Child',102),
(7,'Grace','Faviet','Child',109), (8,'Matthew','Chen','Child',110), (9,'Joe','Sciarra','Child',105),
(10,'Christian','Urman','Child',109), (11,'Zero','Popp','Child',107), (12,'Karl','Greenberg','Child',108);

select country_name from countries;-- 1
select email,phone_number from employees;-- 2
insert into employees(employee_id,first_name,last_name,email,phone_number,hire_date,
job_id, salary,manager_id,department_id)values(111,'John','CJay','john.@sqltutorial.org','515.124.4269','1997-10-28',6,8200.00,108,10);

UPDATE employees
SET last_name = 'CFay'
WHERE employee_id = 111;
SET SQL_SAFE_UPDATES=0;
UPDATE employees
SET last_name = 'Whalen'
WHERE employee_id = 110;
select * from employees where last_name like '%Fay';-- 3
select * from employees;
select hire_date from employees where last_name IN ('Grant','Whalen');-- 4
update employees set department_id=8 where employee_id IN (104,106);
select * from employees where department_id=8; -- 5
select department_name from dept order by department_name;-- 6
select * from employees where last_name like 'K%';-- 7

select first_name from employees where hire_date between '1995-01-01' and '1997-12-31'; -- 8 important date!!! and has to date datatype and query should be string

select job_title from jobs where max_salary<=5000; -- 9
select lower(email) from employees; -- 10

select first_name,last_name from employees where hire_date like '1999-%-%'; -- 11
-- or 
select first_name,last_name from employees where hire_date between '1999-01-01' and '1999-12-31'; -- 11

insert into employees(employee_id,first_name,last_name,email,phone_number,hire_date,
job_id, salary,manager_id,department_id)values(112,'Paul','Newtine','paul.@sqltutorial.org','515.224.4269','1999-10-28',6,8200.00,108,11); -- 12

delete from dept where department_id=5; -- 13

select first_name from employees where dayofweek(hire_date)=5; -- 14
--









