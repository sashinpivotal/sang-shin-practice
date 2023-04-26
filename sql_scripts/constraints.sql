CREATE TABLE department (
    id INT(10) PRIMARY KEY AUTO_INCREMENT NOT NULL,
    dname VARCHAR(20) NOT NULL DEFAULT 'pending'
);

CREATE TABLE employee (
    empId INT(10) PRIMARY KEY AUTO_INCREMENT,
    eName VARCHAR(10) NOT NULL,
    depID INT(10),
    FOREIGN KEY (depID) 
    REFERENCES department(id)
     ON DELETE CASCADE
);

insert into department
values
(2, 'marketing');

insert into employee
values
(100, 'sang', 1),
(101, 'jon', 2),
(102, 'robert', 1);

select * from employee;

delete from department where id = 2;

select * from department;



 