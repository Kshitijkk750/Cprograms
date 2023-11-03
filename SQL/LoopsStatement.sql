#While Loop......

delimiter //

create procedure While_loop()
begin
 declare num int default 1;
 declare Result varchar(120) default '';
 #on behalf of default value we can use set num=1; set result='';
 while num<10 do
 set result=concat(result,num,',');
 set num=num+1;
 end while ;
 select result ;
end //
delimiter ;
#drop procedure While_loop ;
call While_loop();

#Loop ...............................
delimiter //
create procedure LoopDemo()
begin

	declare x int;
    declare str varchar(20);
    set x=1;
    set str='';
    
   loop_label : loop
    if x>10 then 
    leave loop_label ;
    end if ;
    set x=x+1;
    if (x mod 2) then 
    iterate loop_label ;
    else
		set str=concat(str,x,',');
        end if;
    end loop;
		select str as Result;
end //
delimiter ;
call  LoopDemo ;

#Repeat loop .........................................

delimiter //
create procedure RepeatLoop()
begin
declare num int default 1;
declare result varchar(20) default '';

repeat
	set result=concat(result,num,',') ;
    set num=num*5 ;
    until
    num>1000
    end repeat ;
    select result ;


end //
delimiter ;
call RepeatLoop();