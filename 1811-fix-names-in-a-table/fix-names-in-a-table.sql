# Write your MySQL query statement below
select user_id ,concat(Upper(left(name,1)),Lower(substring(name,2))) as name FROM Users order by user_id;