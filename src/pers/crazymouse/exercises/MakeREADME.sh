#!/usr/bin/env bash
head="1. [x]"
(echo "# [Java Exercises](http://crazy-mouse.cn/Codes/Java/UniversityCourse/src/pers/crazymouse/exercises/README.html)"
echo ""
echo "## myclass"
ls myclass/*.java| cut -d . -f 1 | while read i
do
        echo $head "["${i##*/}"](http://crazy-mouse.cn/Codes/Java/UniversityCourse/src/pers/crazymouse/exercises/"$i".java)"
done
echo ""
echo "## myinterface"
ls myinterface/*.java| cut -d . -f 1 | while read i
do
        echo $head "["${i##*/}"](http://crazy-mouse.cn/Codes/Java/UniversityCourse/src/pers/crazymouse/exercises/"$i".java)"
done
echo ""
echo "## exercises"
ls *.java| cut -d . -f 1 | sort -n -t "_" -k 1.3 -k 2 | while read i
do
        echo $head "["$i"](http://crazy-mouse.cn/Codes/Java/UniversityCourse/src/pers/crazymouse/exercises/"$i".java)"
done
) > README.md
