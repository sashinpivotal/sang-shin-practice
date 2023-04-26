use classicmodels;

SELECT orderNumber, SUM(priceEach * quantityOrdered) as total
FROM orderdetails
INNER JOIN orders USING (orderNumber)
GROUP BY orderNumber HAVING total > 60000;

SET GLOBAL sql_mode=(SELECT REPLACE(@@sql_mode,'ONLY_FULL_GROUP_BY',''));

SELECT 
    customerNumber,
    customerName,
	orderNumber,
    orderDate,
 	productCode,
--  productName,
    SUM(priceEach * quantityOrdered) as total
FROM customers
INNER JOIN orders USING (customerNumber)
INNER JOIN orderdetails USING (orderNumber)
INNER JOIN products USING (productCode)
GROUP BY productCode
LIMIT 5;
