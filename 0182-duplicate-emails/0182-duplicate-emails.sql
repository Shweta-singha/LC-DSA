# Write your MySQL query statement below
Select email
From person
Group by email
Having count(email)>1;