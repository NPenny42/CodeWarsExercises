SELECT c.customer_id,
      c.email,
      COUNT(p.payment_id) as payments_count,
      ROUND(SUM(p.amount),2)::FLOAT as total_amount
FROM customer c
    JOIN payment p
    ON c.customer_id = p.customer_id
GROUP BY c.customer_id
ORDER BY total_amount DESC
LIMIT 10