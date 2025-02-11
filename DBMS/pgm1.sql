create database test;
use tes;

create table regions(
	region_id int,
    region_name varchar(50) not null,
    primary key(region_id)
    );
create table countries(
	country_id int primary key,
    country_name varchar(50) not null,
    region_id int not null,
    foreign key(region_id) references regions(region_id)
    );
    
    
desc regions;
desc countries;

create table jobs(
	job_id int primary key,
    job_title varchar(50) not null,
    min_salary int not null,
    max_salary int not null
    );
    
create table locations(
	location_id int,
    street_address varchar(50) not null,
    postal_code int not null,
    city varchar(30) not null,
    state_province varchar(30) not null,
    country_id int not null,
    primary key(location_id),
    foreign key(country_id) references countries(country_id)
    );
desc locations;

create table departments(
	department_id int primary key,
    department_name varchar(30) not null,
    location_id int not null,
    foreign key(location_id) references locations(location_id)
    );
desc departments;

create table employees(
	employee_id int primary key,
    first_name varchar(20) not null,
	last_name varchar(20) not null,
    email varchar(25) not null,
    phone_number varchar(10) not null,
    hire_date date not null,
    job_id int not null,
    salary int not null,
    manager_id int not null,
    department_id int not null,
    foreign key(job_id) references jobs(job_id),
    foreign key(department_id) references departments(department_id)
    );
desc employees;

create table dependents(
	dependent_id int primary key,
    first_name varchar(30) not null,
    last_name varchar(30) not null,
    relationship varchar(30) not null,
    employee_id int not null,
    foreign key(employee_id) references employees(employee_id)
    );