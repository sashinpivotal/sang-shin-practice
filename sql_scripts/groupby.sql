SELECT 
    creditLimit, COUNT(*)
FROM
    customers
GROUP BY creditLimit;


select DISTINCT(country) from customers;

SELECT status, count(*) FROM orders GROUP BY status;

SELECT 
    orderNumber, SUM(quantityOrdered * priceEach) AS total
FROM
    orderdetails
GROUP BY orderNumber;

select * from orderdetails where orderNumber=10101;

SELECT 
    Month(orderDate) AS month3, COUNT(orderNumber)
FROM
    orders
WHERE year(orderDate)=2004
GROUP BY month3;