1) create table admin(adminname varchar(10) primary key ,password varchar(10)not null);
2)select *from admin;
3)insert into admin values('admin','admin');
4)select *from admin;

create table doctor(DoctorId varchar(10) primary key ,
FirstName varchar(30)not null,
LastName varchar(30)not null,
ContactNo varchar(10)not null,gender varchar(10)not null,
Address varchar(100)not null,JoiningDate varchar(30),
SpecialistIn varchar(50)not null,sallary varchar(20)not null,ADate varchar(20)not null,ATime varchar(20)not null);
5) to rename the column with datatype:


create table doctor(
DoctorId int auto_increment  primary key ,
FirstName varchar(30)not null,LastName varchar(30)not null,
ContactNo varchar(10)not null,gender varchar(10)not null,
Address varchar(100)not null,JoiningDate varchar(30),
SpecialistIn varchar(50)not null,sallary varchar(20)not null,ADate varchar(20)not null,ATime varchar(20)not null
);
Alter table patient change COLUMN FirstName  FullName varchar(100);

Alter table patient change column AdmitDate AdmitDate varchar(100);