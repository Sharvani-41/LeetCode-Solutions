# Write your MySQL query statement below
select id ,
CASE
when p_id is NULL
then 'Root'
WHEN ID IN (select p_id from Tree where p_id is not NULL)
then 'Inner'
else 'Leaf'
END as type
from Tree;