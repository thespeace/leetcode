# Write your MySQL query statement below
SELECT 
    e.name,
    IFNULL(b.bonus, null) AS bonus
FROM 
    Employee e
LEFT JOIN 
    Bonus b ON e.empId = b.empId
WHERE 
    b.bonus IS NULL OR b.bonus < 1000;