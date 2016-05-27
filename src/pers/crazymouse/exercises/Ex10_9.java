package pers.crazymouse.exercises;

import pers.crazymouse.exercises.myclass.Course;
import pers.crazymouse.exercises.myclass.Student;

/**
 * Created by crazymouse on 5/26/16.
 */
public class Ex10_9 {
    public static void main(String[] args) {
        Course course = new Course("Java");
        Student stu1 = new Student("Jason");
        Student stu2 = new Student("Mike");
        Student stu3 = new Student("Andy");
        course.addStudent(stu1);
        course.addStudent(stu2);
        course.addStudent(stu3);
        course.dropStudent(stu1);
        course.printInformation();
    }
}
