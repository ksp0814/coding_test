-- 코드를 입력하세요
SELECT HOUR(datetime) as HOUR, COUNT(*) as COUNT from animal_outs
where hour(datetime) >= 9 and hour(datetime) <= 19
group by hour(datetime)
order by hour(datetime)