# Write your MySQL query statement below
Select u.unique_id,e.name
From Employees e Left Join EmployeeUNI u 
ON e.id = u.id

