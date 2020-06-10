SELECT p.pokemon_name,
      (p.str*m.multiplier) as modifiedStrength,
      m.element
FROM pokemon p
    JOIN multipliers m
    ON p.element_id = m.id
WHERE p.str*m.multiplier >= 40
ORDER BY modifiedStrength DESC