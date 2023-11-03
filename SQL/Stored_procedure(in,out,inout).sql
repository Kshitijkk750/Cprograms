use foreginkey;

Delimiter //
create procedure findMaxSalary(out highestsalary decimal(10,2))
begin
	select max(empSalary) into highestSalary from employe;
    end //
    delimiter ;
    call findMaxSalary(@m);
    select @m as highest ;
    #*****************************************
    
    Delimiter //
    create procedure getSingleEmployee(in id int)
    begin
		select empname from employe where empid=id;
        end //
        delimiter ;
        
        call getSingleEmployee(1);
        
        Delimiter //
	create procedure  getAllEmployee()
        begin
			select empname from employe;
            end //
            Delimiter ;
            
            call getAllEmployee();
            
#****************************************************
            Delimiter //
create procedure findSalary(in id int, out Salary decimal(10,2))
begin
	select empSalary into Salary from employe where empid=id;
    end //
    delimiter ;
    call findSalary(3,@m);
    select @m as highest ;
#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
Delimiter //
create procedure updateSalary(inout sal decimal(10,2), in id int)
begin
	select empsalary into sal from employe where empId=id;
    set sal=sal*1.10;
    update employe set empSalary=sal where empId=id;
    end //
    Delimiter ;
    call updateSalary(@s,6);
    select @s;
    