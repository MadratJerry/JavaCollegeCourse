package pers.crazymouse.exercises;

import pers.crazymouse.exercises.myclass.Course;
import pers.crazymouse.exercises.myclass.Student;

/**
 * Created by crazymouse on 6/8/16.
 */
public class Ex13_13 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Course c1 = new Course("Programming");
        c1.addStudent(new Student("Jack"));
        c1.addStudent(new Student("Rose"));
        Course c2 = (Course) c1.clone();
        c1.addStudent(new Student("crazymouse"));
        c2.printInformation();
    }
}
