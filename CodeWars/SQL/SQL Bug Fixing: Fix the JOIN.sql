SELECT 
  j.job_title,
  ROUND(AVG(j.salary),2)::FLOAT as average_salary,
  COUNT(p.id) as total_people,
  ROUND(SUM(j.salary),2)::FLOAT as total_salary
FROM people p
  JOIN job j
  ON j.people_id = p.id
GROUP BY j.job_title
ORDER BY average_salary DESC