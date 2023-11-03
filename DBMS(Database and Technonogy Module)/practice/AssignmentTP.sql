#create procedure evenodd #fibbonicci #factorial
#even odd find.
create database Assignment ;
use Assignment ;
delimiter //
create procedure EvenOdd()
begin
declare n int default 22;
declare str varchar(20);
if(n%2=0) then
set str='Number is even';
else
set str='Number us odd';
end if ;
select str as Result ;

end //
delimiter ;
#drop procedure EvenOdd ;
call EvenOdd();
#****************************************************************

delimiter //
create procedure Facto()
begin
declare n int default 5;
declare m int default 1;
declare a int  ;
declare str varchar(20);
set a=1;
while m<=n do 
 set a=a*m;
 set m=m+1;
end while ;
select a as Result ;
end //
delimiter ;
call Facto();
#fibbonicci series**************************************************************************
delimiter //
create procedure Fibbo()
begin
declare n int default 5;
declare a int default 1;
declare t int default 0;
declare b int ;
declare i int default 1;

while i<=n do
set b= t+a;
set t=a;
set a=b;
end while ;
select b as Result ;


end //
delimiter ;
call Fibbo ();




