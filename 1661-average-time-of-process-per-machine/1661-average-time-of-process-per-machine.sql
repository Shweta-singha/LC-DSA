# Write your MySQL query statement below
select start_table.machine_id, ROUND(AVG(end_table.timestamp - start_table.timestamp),3) AS processing_time
From Activity start_table Join Activity end_table 
On start_table.machine_id = end_table.machine_id and 
start_table.process_id = end_table.process_id and 
start_table.activity_type = "start" and 
end_table.activity_type = "end" 
group by start_table.machine_id