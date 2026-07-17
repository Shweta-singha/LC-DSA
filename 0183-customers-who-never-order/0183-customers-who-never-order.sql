# Write your MySQL query statement below
SELECT c.name AS Customers
From Customers c
Left JOIN Orders o
ON c.id = o.customerId
where o.id is NULL;