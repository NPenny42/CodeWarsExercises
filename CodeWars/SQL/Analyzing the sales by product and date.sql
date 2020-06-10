SELECT name as product_name,
        EXTRACT(YEAR FROM date)::INT as year,
        EXTRACT(MONTH FROM date)::INT as month,
        EXTRACT(DAY FROM date)::INT as day,
        sum(p.price * sd.count) as total
FROM sales_details as sd
    JOIN products as p ON sd.product_id = p.id
    JOIN sales as s ON s.id = sd.sale_id
GROUP BY name, ROLLUP(year , month , day)
ORDER BY  p.name, year, month, day