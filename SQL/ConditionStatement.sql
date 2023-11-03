use foreginkey ;
select if(100<20,"100 is smaller","20 is smaller");
select * from employe;
select empName, if(empSalary>50000,"Higher Salary","Lower Salary") as Result from employe ; 


#if else condition....
delimiter //
create procedure SalaryStatus(in id int)
begin 
declare salary decimal(10,2);
declare status varchar(30);

select empSalary into salary from employe where empId=id;

if salary>50000 then
set status="Good Salary";
else
set status="less Salary";
end if;
select status as Result ;
end //
delimiter ;
#drop procedure SalaryStatus; for deleting the procedure as we cant do changes in it..
call SalaryStatus(5) ;


#switch case statement....
delimiter //
create procedure SalaryStats(in id int)
begin 
declare salary decimal(10,2);
declare status varchar(30);

select empSalary into salary from employe where empId=id;

set status=
case
when salary>60000 then "Excelent"
when salary>55000 then "Verygood"
when salary>45000 then "Good"
else"Keep going"
end ;
select status as Result;
end //
delimiter ;

call SalaryStatus(3);


#If elseif condition ....
delimiter //
create procedure SalaryStts(in id int)
begin 
declare salary decimal(10,2);
declare status varchar(30);

select empSalary into salary from employe where empId=id;

if salary>50000 then
set status="Good Salary";
elseif salary >45000 and salary <50000 then
set status="average Salary";
else 
set status="Less Salary";
end if;

select status as Result ;
end //
delimiter ;
call SalaryStts(2);

