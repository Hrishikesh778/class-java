
-- drop database temp1
drop database xyz_company;

-- create database college

use college;  

create table student(
id int primary key,
name varchar(50),
age int not null
);



insert into student values(1,"aman",26);
insert into student values(2,"hrishikesh",24);

select * from student;

create database if not exists college;

drop database if exists temp1;

show databases;

show tables;

create table student2(
rollno int primary key,
name varchar(50)
);

select * from student2;

insert into student2 (rollno,name) values (101,"karan"),(102,"arjun"),(103,"ram");

insert into student2  values (104,"shyam");

-- for practice question-----------------------------------------------------------------
create database xyz_company;

use xyz_company;

create table employee(
id int primary key,
name varchar(100),
salary int

);

insert into employee(id,name,salary) values(1,"adam",25000),(2,"bob",30000),(3,"casey",40000);

select * from employee;


-- over
-- constraints
use college;

select * from temp1;

create table temp1(
id int unique
); 
 

insert into temp1 values(101);

insert into temp1 values(101);

-- default constraint

create table emp(
id int ,
salary int default 25000
);
 
insert into emp (id) values(101);

select * from emp;

-- eg:

create database college;
use college;

create table student(
rollno int primary key,
name varchar(50),
marks int not null,
grade varchar(1),
city varchar(20)
);



insert into student (rollno,name,marks,grade,city) values 
(101,"anil",78,"C","Pune"),
(102,"bhumika",93,"A","Mumbai"),
(103,"chetan",85,"B","Mumbai"),
(104,"dhruv",96,"A","Delhi"),
(105,"emanuel",12,"F","Delhi"),
(106,"farah",82,"B","Delhi");

select * from student; 

select name, marks from student;

select distinct city from student;

select * from student where marks >80;
select * from student where city = "mumbai";
select * from student where marks >80 and city = "mumbai";

-- operators
select * from student where marks + 10 >100;
select * from student where marks = 93;
select * from student where marks >90 and city = "kalyan";
select * from student where marks >90 or city = "mumbai";
select * from student where marks between 80 and 90;
select * from student where city in ("delhi","mumbai","varap");
select * from student where city not in ("delhi","mumbai");

-- limit clause
select * from student limit 3;
select * from student where marks > 75 limit 3;

-- order by
select * from student order by city asc;
select * from student order by marks desc limit 3;

-- aggregate functions
select max(marks) from student;
select min(marks) from student;
select avg(marks) from student;
select count(rollno) from student;

-- group by 
select city from student group by city;
select city ,count(rollno) from student group by city;
select city,name ,count(rollno) from student group by city, name;
select city ,avg(marks) from student group by city;
select city, avg(marks) from student group by city order by avg(marks) desc;
select grade, count(rollno) from student group by grade order by grade;

-- having caluse
select city, count(rollno) from student group by city having max(marks)>90;

-- general order
select city
from student
where grade ="a"
group by city
having max(marks)>=93
order by city asc;

-- table related queries
set sql_safe_updates=0;
-- update
 update student set grade="O" where grade="A"; 
 update student set marks =82 where rollno =105;
 update student set grade="B" where marks between 80 and 90;
 update student set marks= marks+1;
 update student set marks= 12 where rollno=105;
 update student set grade="F" where rollno=105;
-- delete
delete from student where marks<33;

-- foreign key
create table dept(
id int primary key,
name varchar(50)
);

create table teacher(
id int primary key,
name varchar(50),
dept_id int,
foreign key (dept_id) references dept (id)
);

select * from student;

 










