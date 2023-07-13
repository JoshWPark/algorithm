-- 코드를 입력하세요
select a.user_id, a.product_id from(
    SELECT user_id, product_id, count(*) as cnt from online_sale
    group by user_id, product_id
) a
where a.cnt > 1
order by a.user_id, a.product_id desc