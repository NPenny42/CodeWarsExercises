SELECT player_name, 
      games, 
      ROUND(hits/at_bats::decimal, 3)::text as batting_average
FROM yankees y
WHERE at_bats > 99
ORDER BY batting_average DESC