use foreginkey ;

###############################
delimiter //
create procedure Cursor_demo2()
begin
declare finished int default 0;
declare name varchar(30);
declare Ssalary decimal(10,2);

declare cursor1 cursor for select empName,empSalary from employe ;
declare continue handler for not found set finished= 1;
open cursor1 ;
loop1: loop
if finished then
leave loop1 ;
end if ;
fetch cursor1 into name, Ssalary ;
select name,Ssalary ; 
end loop ;
close cursor1 ;

end //
delimiter ;

call Cursor_demo2();
 select * from employe ;
delimiter //
create procedure Cursur2()
begin
declare finished int default 0 ;
declare name varchar(30);
declare salary decimal(10,2);
declare id int ;
declare cursor2 cursor for select empName,empSalary,empId from employe ;
declare continue handler for not found set finished =1;
open cursor2 ;
loop1 : loop
if finished then
leave loop1 ;
end if;
fetch cursor2 into name, salary, id ;
update employe 
set empSalary=salary*1.10 where empId =id ;
end loop;
close cursor2 ;
end //
delimiter ;
drop procedure cursur2;
call Cursur2();


