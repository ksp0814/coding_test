-- 코드를 작성해주세요
select concat(QUARTER(differentiation_date), 'Q') as QUARTER, count(*) as ECOLI_COUNT from ecoli_data
group by QUARTER
order by QUARTER