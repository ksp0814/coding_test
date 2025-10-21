-- 코드를 작성해주세요
select a.id, b.fish_name, a.length from Fish_info as a join fish_name_info as b 
on a.fish_type = b.fish_type where a.fish_type in (select fish_type from fish_info
                                                  group by fish_type having length = max(length))
                                                  order by a.id