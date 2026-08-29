# Write your MySQL query statement below
select dpt.name as Department, emp.name as Employee, emp.salary as Salary
from Employee emp
join Department dpt
on emp.departmentId=dpt.id
having salary=(select max(e.salary) from Employee e where e.departmentId=emp.departmentId);