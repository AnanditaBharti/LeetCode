/* Write your PL/SQL query statement below */
select e.name as Employee
from Employee e
where salary > (select x.salary from Employee x where e.managerId=x.id);