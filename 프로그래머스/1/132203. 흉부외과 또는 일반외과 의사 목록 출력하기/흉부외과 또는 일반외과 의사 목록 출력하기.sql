-- 코드를 입력하세요
SELECT dr_name, dr_id, mcdp_cd, date_format(HIRE_YMD,'%Y-%m-%d') as HIRE_YMD from doctor
where mcdp_cd = 'CS'OR mcdp_cd = "GS"
order by hire_ymd desc, dr_name;