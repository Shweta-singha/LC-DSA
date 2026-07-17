# Write your MySQL query statement below
SELECT(Select Distinct salary
From Employee 
Order By salary DESC
LIMIT 1 OFFSET 1
) AS SecondHighestSalary;