/* Write your PL/SQL query statement below */
select id from weather w
where temperature > (
    select temperature from weather w2
    where w.recordDate-1 = w2.recordDate
);