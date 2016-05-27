package pers.crazymouse.exercises;

import pers.crazymouse.exercises.myclass.Student;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Ex7_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = input.nextInt();
        Student stu[] = new Student[n];
        for (int i = 0; i < n; i++) {
            stu[i] = new Student();
            stu[i].inputInformation();
        }
        Arrays.sort(stu, new Comparator<Student>() {
            public int compare(Student o1, Student o2) {
                return o1.getScore() < o2.getScore() ? 1 : -1;
            }
        });
        for (int i = 0; i < n; i++)
            System.out.println(stu[i].toString());
    }
}
