# Write your MySQL query statement below
-- select d.name as Department, e.name as Employee, e.salary as Salary
-- from Employee e
-- join Department d
-- on e.departmentId=d.id where(
--     select count(distinct e2.salary) from Employee e2
--     where e.departmentId=e2.departmentId and e2.salary>e.salary
-- )<3;
select d.name as Department, e.name as Employee, e.salary as Salary
from (
   select e.*, dense_rank() over (partition by departmentId order by salary desc) as rnk from Employee e
) e join Department d
on e.departmentId=d.id where rnk<=3;