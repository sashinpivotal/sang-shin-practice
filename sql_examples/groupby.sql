

SELECT 
    CONCAT(contactFirstName, ' ', contactLastName) as c,
    UPPER(c) AS Fullname
FROM
    customers;