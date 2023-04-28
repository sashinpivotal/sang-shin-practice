-- banking database Join exercise 
use Banking;

-- 1.
-- For each product, show the product name 
-- "Product" and the product type name "Type"
select p.NAME as Product, pt.NAME as Type
from product p
inner join product_type pt using (PRODUCT_TYPE_CD);

-- 2.
-- For each branch, list the branch name and city, 
-- plus the last name and title of each employee 
-- who works in that branch.
select b.NAME, b.CITY, e.LAST_NAME, e.TITLE
from branch b
inner join employee e on b.BRANCH_ID = e.ASSIGNED_BRANCH_ID;

-- 3.
-- Show a list of each unique employee title.
select DISTINCT title
from employee;

-- 4.
-- Show the last name and title of each employee, 
-- along with the last name and title of that 
-- employee's boss.
select e.LAST_NAME, e.TITLE, m.LAST_NAME, m.TITLE
from employee e
inner join employee m on e.SUPERIOR_EMP_ID = m.EMP_ID;



-- 5. 
-- For each account, show the name of the 
-- account's product, the available balance, 
-- and the customer's last name.
select p.name, a.avail_balance, i.last_name
from product p 
inner join account a using (PRODUCT_CD)
inner join customer c using (CUST_ID)
inner join individual i using (CUST_ID);

-- 6.
-- List all account transaction details 
-- for individual customers whose last name 
-- starts with 'T'.
select at.amount, i.last_name
from acc_transaction at
inner join account a using (account_id)
inner join customer c using (CUST_ID)
inner join individual i using (CUST_ID)
where i.LAST_NAME like 'T%';


