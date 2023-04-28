use SBA_MOCKUP;

-- Exercise #1
-- Create a query to return all orders made 
-- by users with the first name of “Marion”
select ot.order_id, o.user_id, s.store_id
from users u
inner join orders o using (user_id)
inner join order_items ot using (order_id)
inner join stores s using (store_id)
where u.first_name='Marion'
limit 1,2;

-- Exercise #2
-- Create a query to select all users that 
-- have not made an order
select u.user_id, u.first_name, u.last_name, u.city
from users u
left join orders o using (user_id)
where o.order_id is null;

-- Exercise #3
-- Create a Query to select the names and 
-- prices of all items that have been part 
-- of 2 or more separate orders.
select i.name, i.price
from items i
inner join order_items using(item_id)
group by i.name
having count(*) >= 2;

-- Exercise #4
-- Create a query to return the Order Id, 
-- Item name, Item Price, and Quantity from orders 
-- made at stores in the city “New York”. 
-- Order by Order Id in ascending order.
select o.order_id, i.name, i.price, oi.quantity
from orders o
inner join order_items oi using (order_id)
inner join items i using (item_id)
inner join stores s using (store_id)
where s.city = 'New York'
order by o.order_id;

-- Exercise #5
-- Your boss would like you to create a query 
-- that calculates the total revenue generated 
-- by each item. Revenue for an item can be 
-- found as (Item Price * Total Quantity Ordered). 
-- Please return the first column as ‘ITEM_NAME’ 
-- and the second column as ‘REVENUE’.
select i.name as ITEM_NAME, 
       sum(i.price * oi.quantity) as REVENUE
from items i
inner join order_items oi using (item_id)
group by i.name
order by REVENUE desc;

-- Exercise #6
--   column1: store name
--   cloumn2: The number of times an order 
--            has been made in this store
--   column3: 
--         - If the store has been involved in 
--           more than 3 orders, mark as ‘High’
select s.name as NAME, 
       count(*) as ORDER_QUANTITY,
CASE
   WHEN count(*) > 3 THEN "High"
   WHEN count(*) > 1 THEN "Medium"
ELSE "Low" END
from stores s
inner join orders o using (store_id)
group by (s.name)
order by ORDER_QUANTITY desc;



