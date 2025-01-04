select hd.dept_id DEPT_ID,
    hd.dept_name_en DEPT_NAME_EN,
    ROUND(AVG(he.sal), 0) AVG_SAL
from hr_department hd
    inner join hr_employees he
    on hd.dept_id = he.dept_id
group by 1
order by 3 desc