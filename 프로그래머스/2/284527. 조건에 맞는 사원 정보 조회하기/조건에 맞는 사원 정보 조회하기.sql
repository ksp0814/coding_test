-- 코드를 작성해주세요
select sum(a.score) as SCORE, b.emp_no, b.emp_name, b.position, b.email from hr_grade as a join hr_employees as b on a.emp_no = b.emp_no
group by a.emp_no
order by score desc
limit 1