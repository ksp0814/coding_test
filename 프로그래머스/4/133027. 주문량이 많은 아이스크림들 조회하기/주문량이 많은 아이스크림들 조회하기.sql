-- 코드를 입력하세요
select a.flavor from first_half as a join july as b on a.flavor=b.flavor group by a.flavor order by sum(a.total_order + b.total_order) desc limit 3