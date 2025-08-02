-- 코드를 입력하세요
SELECT ANIMAL_TYPE, count(*) as count from animal_ins GROUP BY ANIMAL_TYPE ORDER BY ANIMAL_TYPE ASC;