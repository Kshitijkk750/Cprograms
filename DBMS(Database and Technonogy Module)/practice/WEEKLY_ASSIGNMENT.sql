#ASSIGNMENT
create database assignment ;
use assignment ;
create table Post_Office(
po_id int primary key,
po_name varchar(35) not null,
po_address varchar(35) not null,
po_city varchar(35) not null,
po_state varchar(2),
po_pincode bigInt ) ;
select * from Post_Office;

#que 1.B) Write insert query for the above table (Post_Office). Enter 5 rows in the table

 insert into Post_Office(po_id,po_name,po_address,po_city,po_state,po_pincode)
 values 
 (01,"Sitabuldi","Sitabuldi main road Nagpur","Nagpur","MH",75081),
 (02,"Dharampeth","Dharampeth colony Nagpur","Nagpur","MH",75080),
 (03,"Panaji","Panaji road Goa","Panaji","GA",75082),
 (04,"malkapur","Tahsil Road Malkapur","Malkapur","AP",75079),
 (05,"Deccan GPO","Deccan Road","Hyderabad","TS",75078);
 select * from Post_Office;
 
#que1:C)Write a query that will display all the Post Office records of a State. Display the address of
#..Post Office in a same city.
select po_address,po_city from Post_Office where po_state ="MH" ;

#que1 : d).In which city having maximum number of post office,show the pincodes of those cities.
##select po_pincode, po_city from Post_Office where po_city = (select max(count(po_city)) from Post_Office) ;
Select po_pincode, po_city from Post_Office where 
po_city=(select po_city from Post_Office group by po_city order by count(po_city)desc limit 1);



#que2 :Create a store procedure that receives the first name of the person table as input and the
#last name as output.
create table Person(
name varchar(20), surname varchar(20));
insert into Person(name,surname) values ("Kshitij","Kanake"),("Naved","Sheikh");
select * from Person ;
delimiter //
create procedure Getlastname(out srname varchar(50))
begin
 select surname as srname from Person where name ="Kshitij";
 end //
 delimiter ;
 drop procedure Getlastname ;
 call Getlastname (@m);
 
 #que3:Create a query to show the account number and customerid from the customer table for
 #the customer without sales orders.
 create table Customer(
 cust_id int,
 acc_nu bigInt not null ,
 cust_name varchar(20),
 sales_order int 
 );
 insert into Customer(cust_id,acc_nu,cust_name,sales_order) values 
 (01,10001,"Customer01",12),(02,10003,"Customer02",23),(03,10014,"Customer03",15),
 (04,10022,"Customer04",11),(05,10011,"Customer05",36),(06,10005,"Customer06",17),
 (01,10007,"Customer07",15),(08,10076,"Customer08",null),(01,10066,"Customer09",25),
 (17,10033,"Customer10",22),(04,10232,"Customer11",33),(04,10029,"Customer12",null),
 (13,10044,"Customer13",null),(14,10089,"Customer14",21),(15,10089,"Customer14",21),(16,10089,"Customer14",21) ;
 select * from Customer ;
 drop table Customer ;
 select acc_nu,cust_id from Customer where sales_order is null;
 
 #Q4. Create a query to show the top 10 customerIDs of users with more Orders.
 
select cust_id, count(distinct sales_order) from Customer
group by 1
order by 2 desc limit 10 ;

#Q5. Creating procedure without parameters
delimiter //
create procedure Without_parameter()
begin
declare n int ;
set n=20 ;
select n as Result ;
end //
delimiter ;
call Without_parameter();

#Q6..Creating Procedure with (IN/OUT/INOUT) Parameters
delimiter //
create procedure parameter(inout ds varchar(20), in ls varchar(25))
begin
set ds = 'Student kshitij';
set ls = 'Last name';
end //
delimiter ;
drop procedure parameter ;
call parameter(@s,1);
select @s as Student_Name;

#Q7.Write a MySQL stored procedure that takes an integer parameter representing a
#student's score. Based on the score, the procedure should return one of the following
#grades using IF-ELSE:

DELIMITER //
CREATE PROCEDURE Grade(IN score INT)
BEGIN
  DECLARE grade VARCHAR(10);
  IF score >= 90 THEN
    SET grade = 'A';
  ELSEIF score >= 80 THEN
    SET grade = 'B';
  ELSEIF score >= 70 THEN
    SET grade = 'C';
  ELSEIF score >= 60 THEN
    SET grade = 'D';
  ELSE
    SET grade = 'Fail';
  END IF;
  SELECT grade;
END //
DELIMITER ;
call Grade(65);

#Q8. Write a MySQL stored procedure that uses a loop to iterate through a list of numbers
#from 1 to 20.

delimiter \\
create procedure number()
begin
	declare num int default 1;
    declare result varchar(100) default '';
    set num = 1;
    set result = '';
    while num <= 20 do
		set result = concat(result,num, ',');
		set num = num+1;
    end while;
    select result;
end \\
delimiter ;
call number();

#Q9.Create a stored procedure named CalculateFactorial that accepts a single integer
#parameter, n.Inside the procedure, use a loop to calculate the factorial of n.

delimiter //
create procedure factorial()
begin
	declare n int default 5; 
    declare m int default 1;
    declare a int;
    declare str varchar(50);
    set a = 1;
    while m<=n do
    set a = a*m;
    set m = m+1;
    end while;
    select a as result;
end //
delimiter ;
drop procedure factorial;
call factorial();

#Q10. Create a stored procedure named GenerateFibonacciSequence that accepts
#a single integer parameter, n, representing the number of terms in the Fibonacci
#sequence.

Delimiter //
create procedure Fibbonicci(in n int,out result varchar(100))
begin
	declare num int default 0;
    declare num1 int default 1;
    declare num2 int default 0;
    declare counter int default 0;
    set result = '';
    repeat
      set  result = concat(result,num,',');
      set num2=num+num1;
      set num=num1;
      set num1=num2;
      set counter=counter+1;
      until counter>n
      end repeat;
end //
delimiter ;
call Fibbonicci(10,@result);
select @result;



