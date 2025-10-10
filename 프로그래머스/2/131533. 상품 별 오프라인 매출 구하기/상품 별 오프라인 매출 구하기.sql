SELECT a.product_code, SUM(sales_amount) * a.price AS SALES
FROM product a, offline_sale b
WHERE a.product_id = b.product_id
group by a.product_code
order by sales desc, product_code;
