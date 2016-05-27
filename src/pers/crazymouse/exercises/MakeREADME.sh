(echo "# [Java Exercises](http://crazy-mouse.cn/Codes/Java/UniversityCourse/src/pers/crazymouse/exercises/README.html)"
echo ""
echo "## Public Class"
ls myclass/*.java| cut -d . -f 1 | while read i
do
        echo "1. * [x] ["${i##*/}"](http://crazy-mouse.cn/Codes/Java/UniversityCourse/src/pers/crazymouse/exercises/"$i".java)"
done
echo ""
echo "## Exercises"
ls *.java| cut -d . -f 1 | sort -n -t "_" -k 1.3 -k 2 | while read i
do
        echo "1. * [x] ["$i"](http://crazy-mouse.cn/Codes/Java/UniversityCourse/src/pers/crazymouse/exercises/"$i".java)"
done
) > README.md
