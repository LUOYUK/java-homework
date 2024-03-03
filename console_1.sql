create table cqupt_student(
    studentid varchar(10),
    name      varchar(20),
    sex       varchar(2),
    age       int,
    Fee       decimal(10,2),
    address   varchar(50),
    memo      varchar(300)
) comment'题目1';
desc cqupt_student;

create table CourseAa(
    Aa1  varchar(20),
    Aa2  int,
    Aa3  decimal(10)
)comment '题目2';
desc CourseAa;

create table chooseBb(
    Bb1  varchar(30),
    Bb2  int,
    Bb3  decimal(6)
)comment '题目3';
alter table chooseBb add Bb4 varchar(20) not null ;
alter table chooseBb add Bb5 varchar(10) primary key ;
desc chooseBb;



create table test (
    Name varchar(20),
    age int,
    score numeric(10,2),
    address varchar(60)
) comment '题目十';

insert into test (Name, age, score, address)
values ('赵一',20,580.00,'重邮宿舍 12-3-5'),('钱二',19,540.00,'南福苑 5-2-9'),('孙三',21,555.50,'学生新区 21-5-15'),
       ('李四',22,505.00,'重邮宿舍 8-6-22'),('周五',20,495.50,'学生新区 23-4-8'),('吴六',19,435.00,'南福苑 2-5-12');

select * from test;


create table test_temp(
    name varchar(20),
    age int,
    score numeric(10,2),
    address varchar(60)
) comment '12';

insert into test_temp(name, age, score, address) values ('郑七',21,490.50,'重邮宿舍 11-2-1'),('张八',120,560.00,'南福苑 3-3-3'),('王九',10,515.00,'学生新区 19-7-1');
insert into test select * from test_temp;
update test set score =score+5 where age<=20;
update test set age =age-1 where name in('钱二','吴六','张八');
delete from test where age>=21 and score>=500;
delete from test where score<550 and address like '重邮宿舍%';
select * from test;


create table student(
    sno varchar(20),
    name varchar(10),
    age int,
    college varchar(30)
)comment '19';

create table course(
    courseID varchar(15),
    courseName varchar(30),
    courseBeforeID varchar(15)
)comment '20';

create table choose(
    sno varchar(20),
    courseID varchar(30),
    score decimal(5,2)
)comment '21';

insert into student values ('S00001','张三',20,'计算机学院'),('S00002','李四',19,'通信学院'),('S00003','王五',21,'计算机学院');
insert into course  values ('C1','计算机引论','空值（NULL）'),('C2','C语言','C1'),('C3','数据结构','C2');
insert into  choose values ('S00001','C1',95),('S00001','C2',80),('S00001','C3',84),('S00002','C1',80),('S00002','C2',85),('S00003','C1',78),('S00003','C3',70);
update course set courseBeforeID =  null where courseID = 'C1';
select * from course;

select sno,name from student where college = '计算机学院';
select * from student where age between 20 and 23;
select  max(score) from choose;
select  min(score) from choose;
select  sum(score) from choose;
select  avg(score) from choose;
select courseID,courseName from course where courseBeforeID is null;






