-- 코드를 입력하세요
SELECT member_id, member_name, gender, substring(date_of_birth,1,10) as date_of_birth from member_profile
where TLNO is not null and substring(date_of_birth,6,7) = 03 and gender in ('w')
order by member_id