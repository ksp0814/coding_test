-- 코드를 입력하세요
SELECT a.animal_id, a.animal_type, a.name from animal_ins as a join animal_outs as b on a.animal_id = b.animal_id where a.sex_upon_intake != b.sex_upon_outcome order by a.animal_id