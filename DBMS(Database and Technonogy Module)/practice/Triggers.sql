use foreginkey;
show tables ;
select* from employe ;
#******************INSSERT TRIGGER***********************************
create table user(
id int primary key auto_increment,
name varchar(50),
email varchar(100)
);

create table audit_log(
event_type varchar(40),
event_description varchar(150)
);
delimiter //
create trigger after_user_insert 
after insert on user
for each row
begin
	insert into audit_log(event_type, event_description)
    values ('Insert',concat('New user inserted : Id',new.id,',Name', new.name,',email',new.email));
end //
delimiter ;
drop trigger after_user_insert;

insert into user(name,email)values("Ramesh","Ram@gmail.com");
insert into user(name,email)values("Suresh","Suresh@gmail.com");

select * from user;

#*******************DELETE**************************
delimiter //
create trigger before_user_delete
before delete on user
for each row
begin
insert into audit_log(event_type, event_description)
    values ('Delete',concat('New user inserted : Id',old.id,',Name', old.name,',email',old.email));
end //
delimiter ;
delete from user where id=6;
select * from audit_log;

#************************UPDATE***********************

delimiter //
create trigger after_user_update
after update on user
for each row
begin
	insert into audit_log(event_type, event_description)
    values ('Update',concat(' user Update : Id',new.id,',Name', new.name,',email',new.email));
    
end //
delimiter ;

update user set email="Ramesh@gmail.com"
 where id=5;
 select * from user;
 select * from employe;
 delimiter //
create trigger before_salary_insert
before insert on employe
for each row
begin
	if new.empSalary<0 then
	set new.empSalary=5000;
    end if;
end //
delimiter ;
drop trigger before_salary_insert;
insert into employe values(9,"Pratiksha",'-12000',102);