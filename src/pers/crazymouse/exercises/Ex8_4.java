package pers.crazymouse.exercises;

import pers.crazymouse.exercises.myclass.Employee;

import java.util.Arrays;

public class Ex8_4 {
    public static void main(String[] args) {
        int hours[][] = {{2, 4, 3, 4, 5, 8, 8}, {7, 3, 4, 3, 3, 4, 4}, {3, 3, 4, 3, 3, 2, 2},
                {9, 3, 4, 7, 3, 4, 1}, {3, 5, 4, 3, 6, 3, 8}, {3, 4, 4, 6, 3, 4, 4}, {3, 7, 4, 8, 3, 8, 4},
                {6, 3, 5, 9, 2, 7, 9}};
        Employee emp[] = new Employee[hours.length];
        for (int i = 0; i < hours.length; i++)
            for (int j = 0; j < hours[i].length; j++)
                emp[i] = new Employee(i + "", hours[i]);
        Arrays.sort(emp, (o1, o2) -> o1.getHours() < o2.getHours() ? 1 : -1);
        for (int i = 0; i < emp.length; i++)
            System.out.print(emp[i].getName() + " " + emp[i].getHours() + "\n");
    }
}
