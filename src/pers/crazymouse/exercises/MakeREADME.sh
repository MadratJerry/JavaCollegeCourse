#!/usr/bin/env bash
(echo "# [Java Exercises(Github)](https://github.com/crazymousethief/JavaCollegeCourse)"
echo ""
echo "## myclass"
ls myclass/*.java| cut -d . -f 1 | while read i
do
        echo "1. * [x] ""["${i##*/}"](http://crazy-mouse.cn/Codes/Java/UniversityCourse/src/pers/crazymouse/exercises/"$i".java)"
done
echo ""
echo "## myinterface"
ls myinterface/*.java| cut -d . -f 1 | while read i
do
        echo "1. * [x] ""["${i##*/}"](http://crazy-mouse.cn/Codes/Java/UniversityCourse/src/pers/crazymouse/exercises/"$i".java)"
done
echo ""
echo "## myjavafx"
ls myjavafx/*.java| cut -d . -f 1 | while read i
do
        echo "1. * [x] ""["${i##*/}"](http://crazy-mouse.cn/Codes/Java/UniversityCourse/src/pers/crazymouse/exercises/"$i".java)"
done
echo ""
echo "## exercises"
ls *.java| cut -d . -f 1 | sort -n -t "_" -k 1.3 -k 2 | while read i
do
        echo "1. * [x] ""["$i"](http://crazy-mouse.cn/Codes/Java/UniversityCourse/src/pers/crazymouse/exercises/"$i".java)"
done
) > README.md

(
echo "<body><article class="markdown-body"><h1 id="java-exercises"><a href="https://github.com/crazymousethief/java-college-course">Java Exercises(Github)</a></h1>"
echo "<h2 id="myclass"><a name="user-content-myclass" href="#myclass" class="headeranchor-link" aria-hidden="true"><span class="headeranchor"></span></a>myclass</h2>"
echo "<ol>"
ls myclass/*.java| cut -d . -f 1 | while read i
do
    echo "<li>"
    echo "<ul class="task-list">"
    echo "<li class=\"task-list-item\"><input type=\"checkbox\" disabled checked> <a href=\"http://crazy-mouse.cn/Codes/Java/UniversityCourse/src/pers/crazymouse/exercises/"$i".java\">"${i##*/}"</a>"
    echo "<span style=\"font-size:9px;color:gray;\">"
    stat $i".java"|grep Modify|cut -d . -f 1 | while read j
    do
        echo "Last "$j
    done
    echo "</span>"
    echo "</li>"
    echo "</ul>"
    echo "</li>"
done

echo "</ol>"
echo "<h2 id="myinterface"><a name="user-content-myinterface" href="#myinterface" class="headeranchor-link" aria-hidden="true"><span class="headeranchor"></span></a>myinterface</h2>"
echo "<ol>"
ls myinterface/*.java| cut -d . -f 1 | while read i
do
    echo "<li>"
    echo "<ul class="task-list">"
    echo "<li class=\"task-list-item\"><input type=\"checkbox\" disabled checked> <a href=\"http://crazy-mouse.cn/Codes/Java/UniversityCourse/src/pers/crazymouse/exercises/"$i".java\">"${i##*/}"</a>"
    echo "<span style=\"font-size:9px;color:gray;\">"
    stat $i".java"|grep Modify|cut -d . -f 1 | while read j
    do
        echo "Last "$j
    done
    echo "</span>"
    echo "</li>"
    echo "</ul>"
    echo "</li>"
done

echo "</ol>"
echo "<h2 id="myjavafx"><a name="user-content-myjavafx" href="#myjavafx" class="headeranchor-link" aria-hidden="true"><span class="headeranchor"></span></a>myjavafx</h2>"
echo "<ol>"
ls myjavafx/*.java| cut -d . -f 1 | while read i
do
    echo "<li>"
    echo "<ul class="task-list">"
    echo "<li class=\"task-list-item\"><input type=\"checkbox\" disabled checked> <a href=\"http://crazy-mouse.cn/Codes/Java/UniversityCourse/src/pers/crazymouse/exercises/"$i".java\">"${i##*/}"</a>"
    echo "<span style=\"font-size:9px;color:gray;\">"
    stat $i".java"|grep Modify|cut -d . -f 1 | while read j
    do
        echo "Last "$j
    done
    echo "</span>"
    echo "</li>"
    echo "</ul>"
    echo "</li>"
done

echo "</ol>"
echo "<h2 id="exercises"><a name="user-content-exercises" href="#exercises" class="headeranchor-link" aria-hidden="true"><span class="headeranchor"></span></a>exercises</h2>"
echo "<ol>"
ls *.java| cut -d . -f 1 | sort -n -t "_" -k 1.3 -k 2 | while read i
do
    echo "<li>"
    echo "<ul class="task-list">"
    echo "<li class=\"task-list-item\"><input type=\"checkbox\" disabled checked> <a href=\"http://crazy-mouse.cn/Codes/Java/UniversityCourse/src/pers/crazymouse/exercises/"$i".java\">"${i##*/}"</a>"
    echo "<span style=\"font-size:9px;color:gray;\">"
    stat $i".java"|grep Modify|cut -d . -f 1 | while read j
    do
        echo "Last "$j
    done
    echo "</span>"
    echo "</li>"
    echo "</ul>"
    echo "</li>"
done
echo "</ol>"
echo "</article></body></html>"
) > tempREADME.html
cat HEAD.html tempREADME.html > README.html
rm tempREADME.html
