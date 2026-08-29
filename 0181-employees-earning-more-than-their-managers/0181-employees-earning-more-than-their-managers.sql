# Write your MySQL query statement belowse
select emp.name as Employee from Employee emp
join Employee mang on emp.managerId=mang.id
where emp.salary>mang.salary;