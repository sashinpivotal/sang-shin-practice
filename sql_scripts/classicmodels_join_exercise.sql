-- classicmodels join exercise
use classicmodels;

-- 1.
-- Write a query to display each customer’s name 
-- (as “Customer Name”) along with the name of 
-- the employee who is responsible for that 
-- customer’s orders. The employee name should 
-- be in a single “Sales Rep” column, formatted 
-- as “lastName, firstName.” The output should be 
-- sorted alphabetically by customer name.
select c.customerName as 'Customer Name',
       concat(e.lastName, ', ', e.firstName) as 'Sales Rep'
from customers c
inner join employees e 
on (c.salesRepEmployeeNumber = e.employeeNumber)
order by c.customerName;

-- 2.
-- To determine which products are the most popular 
-- with our customers. For each product, list the total 
-- quantity ordered, along with the 
-- total sale generated (total quantity ordered * priceEach) 
-- for that product. 
-- The column headers should be “Product Name,” 
-- “Total # Ordered,” and “Total Sale.” 
-- List the products by Total Sales descending.
select p.productName as 'Product Name,',
       sum(ot.quantityOrdered) as 'Total # Ordered,',
       sum(ot.quantityOrdered * ot.priceEach) as 'Total Sale.'
from products p
inner join orderdetails ot using (productCode)
group by p.productName
order by sum(ot.quantityOrdered * ot.priceEach) desc;

-- 3.
-- Write a query that lists order status and 
-- the number of orders with that status. 
-- Column headers should be “Order Status” and 
-- “Total Orders.” Sort alphabetically by status.
select o.status as 'Order Status',
       count(status) as 'Total Orders'
from orders o
group by o.status
order by o.status;

-- 4.
-- Write a query to list, for each product line, 
-- the total number of products sold from that 
-- product line. The first column should be 
-- “Product Line” and the second should be 
-- “total Sold.” 
-- Order by the second column, descending.
select p.productLine as 'Product Line',
       sum(ot.quantityOrdered) as 'total Sold'
from products p
inner join orderdetails ot using (productCode)
group by p.productLine
order by 2 desc;

-- 5.
-- Your product team is requesting data to help them 
-- create a bar chart of monthly sales made since 
-- the company’s inception. Write a query to output 
-- the month (January, February, etc.), 4-digit year, 
-- and total sales for each month. The first column 
-- should be labeled ‘Month,’ the second column 
-- should be labeled ‘Year,’ 
-- and the third column should be labeled ‘Payments Received.’ 
-- Values in the third column should be formatted 
-- as numbers with two decimals (e.g., 694,292.68).

   
