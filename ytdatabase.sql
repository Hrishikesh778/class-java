
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
drop table dept;

create table teacher(
id int primary key,
name varchar(50),
dept_id int,
foreign key (dept_id) references dept (id)
);

-- cascading on delete and update
use college;


create table teacher(
id int primary key,
name varchar(50),
dept_id int,
foreign key (dept_id) references dept (id)
on update cascade
on delete cascade
); 

drop table teacher;
insert into teacher values (101,"adam",101), (102,"Eve",102);

insert into dept values (101,"english"), (102,"it");



update dept set id=103 where id = 102;
update dept set id=111 where id = 101;

delete from dept where id =103 and id=111;

-- alter table

alter table student add column age int; -- to add column
alter table student drop column age; -- to drop column

-- alter examples
alter table student add column age int not null default 19; -- to add column
alter table student modify column age varchar(2); -- to modify datatype etc

alter table student change age stu_age int; -- to change name and give new datatype
alter table student drop column stu_age;-- to drop column

alter table student rename to stu;
alter table stu rename to student;

insert into student (rollno,name ,marks,stu_age) values (107,"gargi",68,100); 

-- truncate table
truncate table student;

-- practice question queries
alter table student change name full_name varchar(50);
SET SQL_SAFE_UPDATES = 0; -- then we can delete or change the values
delete from student where marks<80;
alter table student drop column grade;

-- joins
create table student2(
id int primary key,
name varchar(50)
);

insert into student2(id,name) values (101,"adam"),(102,"bob"),(103,"casey");

create table course(
id int primary key,
course varchar(50)
);

insert into course(id,course) values (102,"english"),(105,"math"),(103,"science"),(107,"science");

-- inner join
select * from student2 inner join course on student2.id=course.id;
-- inner join with alias
select * from student2 as a inner join course as b on a.id=b.id;
-- left join
select * from student2 as a left join course as b on a.id=b.id;
-- right join
select * from student2 as a right join course as b on a.id=b.id;

-- full join
select * from student2 as a left join course as b on a.id=b.id
union
select * from student2 as a right join course as b on a.id=b.id;

-- left exclusive join
select * from student2 as a left join course as b on a.id=b.id where b.id is null;

-- right exclusive join
select * from student2 as a right join course as b on a.id=b.id where a.id is null;

-- full exclusive join
select * from student2 as a left join course as b on a.id=b.id where b.id is null
union
select * from student2 as a right join course as b on a.id=b.id where a.id is null;

-- self join

create table employee(
id int primary key,
name varchar(50),
manager_id int
);

insert into employee (id,name,manager_id) values (101,"adam",103),(102,"bob",104),(103,"casey",null),(104,"donald",103);

select * from employee as a
join employee as b
on a.id = b.manager_id;

select a.name as manager_name,b.name from employee as a
join employee as b
on a.id = b.manager_id;

-- union

select name from employee
union 
select name from employee;

-- union all
select name from employee
union all
select name from employee;



select * from employee;
select * from student2; 
select * from course; 
use college;  
select * from dept;
select * from teacher;
select * from student; 




 










