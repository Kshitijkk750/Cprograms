create database functions ;
use functions ;
select char(65,71,89,12);
select concat ("Anup","Kawade");
select Lower ("SoftPolynomials");
select Upper ("SoftPolynomials");
select trim("legend");
select substr("kshitij",4,7);
select instr("kshitij anup","Anup");
select length("Kshitij kanake");
#****Numeric Functions ****************

select mod(10,2) ;
select mod(7,2) ;
select power(10,2);
select round(193.25);

#*****Date Function*********************

select curdate();
select now();
select month(curdate());
select day (curdate());
select year(curdate());
select month ("2023-12-23 3:45:32");
select sysdate();
#functions**********************************************

delimiter //
create function Hello()
returns   varchar(50)
deterministic
begin
	return "Hello" ;
    end //
    delimiter ;
    select Hello();
    
    
    delimiter //
    create function Addition(x int,y int)
    returns int
    deterministic
    begin
		return(x+y);
        end //
        delimiter ;
        select Addition(20,10);
