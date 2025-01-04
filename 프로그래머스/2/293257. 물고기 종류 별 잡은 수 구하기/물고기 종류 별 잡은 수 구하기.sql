select COUNT(fi.fish_type) FISH_COUNT,
    fni.fish_name FISH_NAME
from fish_info fi
    left join fish_name_info fni
    on fi.fish_type = fni.fish_type
group by 2
order by 1 desc

