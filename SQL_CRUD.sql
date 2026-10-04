create database Nisha_tech;

use Nisha_tech;
-- create table query 
   create table info(name varchar(50), age int, dept varchar(50), salary int);
   
-- insert the data
   insert into info values ("Nisha", 20, 'ECE', 50000);
   insert into info values ("Poorna",21, 'AI', 55000);
   insert into info values ("Gowthami", 22, 'CSE', 60000);
   insert into info values ("Pradeep", 23, 'IT', 50000);
   
-- update the data 
    set SQL_SAFE_UPDATES = 0;
    update info set dept = "EEE" where name = "Nisha" ;
    
-- view the table
 select * from info;
 
 -- delete the data
   delete from info where salary = 550000;

-- select column wise
  select name,salary info;
  
-- select row wise
   select *from info where name = "Nisha";
   
-- add the column 
    alter table info add column city varchar(50);
    update info set city = "salem";
    
    -- delete the column
    alter table info drop column city;
    
    
    
    

  
   
   
  
  
  
  
   
 
 
 
   
   
   
   