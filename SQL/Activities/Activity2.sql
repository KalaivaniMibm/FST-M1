REM   Script: Session 01-Activity2
REM   Activity2

CREATE TABLE salesman;

CREATE TABLE salesman ( 
    salesman_id int, 
    salesman_name varchar2(32), 
    salesman_city varchar2(32), 
    commission int 
);

Describe salesman


Insert into salesman(james,chennai,10);

Insert into salesman(1,james,chennai,10);

Insert into salesman(1,"james","chennai",10);

Insert into salesman values(1,"james","chennai",10);

Insert into salesman values(1,'james','chennai',10);

Insert into salesman values(1,'james','chennai',10);

INSERT ALL 
    INTO salesman VALUES(5005, 'Pit Alex', 'London', 11) 
    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14) 
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12) 
SELECT 1 FROM DUAL;

SELECT * FROM salesman;
