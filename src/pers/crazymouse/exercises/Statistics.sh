find .| grep ".*\.\(java\)"|xargs grep -v "^$"|wc -l -m
ls -l | grep "Ex_*.*\.\(java\)"|wc -l
