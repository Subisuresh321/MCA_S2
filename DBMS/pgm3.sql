create database school;
use school;

create table student(
	Sid int primary key, Name varchar(20),
    Class int not null, Major varchar(5));