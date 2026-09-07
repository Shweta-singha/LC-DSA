# Write your MySQL query statement below
Select e.name, b.bonus
From Employee e Left Join Bonus b 
On e.empId = b.empId 
where b.bonus is Null or b.bonus <1000