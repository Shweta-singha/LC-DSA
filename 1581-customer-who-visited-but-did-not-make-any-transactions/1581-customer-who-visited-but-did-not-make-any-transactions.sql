# Write your MySQL query statement below
Select v.customer_id, count(v.visit_id) as count_no_trans
From Visits v Left Join Transactions t 
on v.visit_id = t.visit_id
where t.transaction_id is Null 
group by v.customer_id
