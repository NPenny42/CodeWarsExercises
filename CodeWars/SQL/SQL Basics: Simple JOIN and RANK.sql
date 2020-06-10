SELECT p.*, 
      COUNT(s.sale) as sale_count,
      RANK() OVER (ORDER BY (COUNT(s.sale)) DESC) as sale_rank
FROM people p
    LEFT JOIN sales s
    ON p.id = s.people_id
GROUP BY p.id
ORDER By sale_rank ASC