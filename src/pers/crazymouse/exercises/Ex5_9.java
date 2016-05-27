package pers.crazymouse.exercises;

import pers.crazymouse.exercises.myclass.Student;

import java.util.Scanner;

public class Ex5_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of studetns: ");
        int n = input.nextInt();
        Student stu[] = new Student[n];
        for (int i = 0; i < n; i++) {
            stu[i] = new Student();
            System.out.print("Enter the name and the score of the student: ");
            stu[i].inputInformation();
        }
        java.util.Arrays.sort(stu, new java.util.Comparator<Student>() {
            public int compare(Student o1, Student o2) {
                return o1.getScore() < o2.getScore() ? 1 : -1;
            }
        });
        System.out.println(stu[0].toString());
        System.out.println(stu[1].toString());
    }
}
