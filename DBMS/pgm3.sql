
create database school;
use school;

create table student(
	Sid int primary key, 
    Name varchar(20),
    Class int not null,
    Major varchar(5));
alter table student drop column Sid;
alter table student add column Student_name int primary key;
alter table student rename column Student_name to Student_number;
desc student;
create table course(
	Course_name varchar(30),
    Course_number varchar(15),
    Credit_hours int,
    Department varchar(8),
    primary key(Course_number));

create table section(
	Section_identifier int primary key,
    Course_number varchar(15),
    Semester varchar(15),
    Year int,
    Instructor varchar(20),
    foreign key(Course_number) references course(Course_number)
    );
desc section;

create table grade_report(
	Student_number int,
    Section_identifier int,
    Grade varchar(3),
    foreign key(Student_number) references student(Student_number),
    foreign key(Section_identifier) references section(Section_identifier));

create table prerequisite(
	Course_number varchar(15),
	Prerequisite_number varchar(15),
    foreign key(Course_number) references course(Course_number),
    foreign key(Prerequisite_number) references course(Course_number)
    );
desc prerequisite;

insert into student values("Smith",1,"CS",17),("Brown",2,"CS",8);

INSERT INTO COURSE (Course_name, Course_number, Credit_hours, Department) VALUES
('Intro to Computer Science', 'CS1310', 4, 'CS'),
('Data Structures', 'CS3320', 4, 'CS'),
('Discrete Mathematics', 'MATH2410', 3, 'MATH'),
('Database', 'CS3380', 3, 'CS');

INSERT INTO SECTION (Section_identifier, Course_number, Semester, Year, Instructor) VALUES
(85, 'MATH2410', 'Fall', 07, 'King'),
(92, 'CS1310', 'Fall', 07, 'Anderson'),
(102, 'CS3320', 'Spring', 08, 'Knuth'),
(112, 'MATH2410', 'Fall', 08, 'Chang'),
(119, 'CS1310', 'Fall', 08, 'Anderson'),
(135, 'CS3380', 'Fall', 08, 'Stone');

INSERT INTO GRADE_REPORT (Student_number, Section_identifier, Grade) VALUES
(17, 112, 'B'),
(17, 119, 'C'),
(8, 85, 'A'),
(8, 92, 'A'),
(8, 102, 'B'),
(8, 135, 'A');

INSERT INTO PREREQUISITE (Course_number, Prerequisite_number) VALUES
('CS3380', 'CS3320'),
('CS3380', 'MATH2410'),
('CS3320', 'CS1310');
-- 1) Retrieve the list of all courses and grades of “Smith”.
select COURSE.Course_name,GRADE_REPORT.Grade from STUDENT  join GRADE_REPORT on STUDENT.Student_number=GRADE_REPORT.Student_number join SECTION on GRADE_REPORT.Section_identifier=SECTION.Section_identifier join COURSE on SECTION.Course_number=COURSE.Course_number where STUDENT.Name='Smith'; 

-- 2) List the names of students who took the section of ‘Database’ course offered in fall 2008 and their grades in that section.

select STUDENT.Name, GRADE_REPORT.GRADE from STUDENT  join GRADE_REPORT on STUDENT.Student_number=GRADE_REPORT.Student_number join SECTION on GRADE_REPORT.Section_identifier=SECTION.Section_identifier join COURSE on SECTION.Course_number=COURSE.Course_number where COURSE.Course_name='database' and SECTION.Semester='Fall' and SECTION.year=08;

-- 3) List the prerequisites of the ‘Database’ course.

select PREREQUISITE.prerequisite_number, COURSE.Course_name from COURSE join PREREQUISITE on COURSE.Course_number=PREREQUISITE.Course_number where COURSE.Course_name='database' ;