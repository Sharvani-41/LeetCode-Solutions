# Write your MySQL query statement below
SELECT e.name as Employee FROM EMPLOYEE as e
join employee as m on e.managerId=m.id where e.salary>m.salary;