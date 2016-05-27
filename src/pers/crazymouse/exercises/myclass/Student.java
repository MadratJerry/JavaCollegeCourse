package pers.crazymouse.exercises.myclass;

import java.util.Scanner;

public class Student {
    private String name;
    private double score;

    public Student() {

    }

    public Student(String name) {
        this(name, 0);
    }

    public Student(String name, double score) {
        this.name = name;
        this.score = score;
    }

    public void inputInformation() {
        Scanner input = new Scanner(System.in);
        name = input.nextLine();
        score = input.nextDouble();
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Score: %.2f", name, score);
    }

    public double getScore() {
        return score;
    }

    public String getName() {
        return name;
    }
}
