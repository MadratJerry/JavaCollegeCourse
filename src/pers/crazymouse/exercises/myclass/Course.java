package pers.crazymouse.exercises.myclass;

import java.util.ArrayList;

/**
 * Created by crazymouse on 5/26/16.
 */
public class Course implements Cloneable {
    private String courseName;
    ArrayList<Student> students = new ArrayList<Student>();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(Student e) {
        students.add(e);
    }

    public String getCourseName() {
        return courseName;
    }

    public int getNumberOfStudents() {
        return students.size();
    }

    public boolean dropStudent(Student e) {
        if (students.indexOf(e) >= 0) {
            students.remove(students.indexOf(e));
            return true;
        } else {
            return false;
        }
    }

    public void clear() {
        students.clear();
    }

    public void printInformation() {
        System.out.println("CourseName: " + courseName);
        for (Student e : students) {
            System.out.println("Name " + e.getName());
        }
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Course obj = (Course) super.clone();
        obj.students = (ArrayList<Student>) students.clone();
        return obj;
    }
}
