package pers.crazymouse.exercises;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by crazymouse on 5/25/16.
 */
public class Ex11_13 {
    public static void main(String[] args) {
        System.out.print("Enter ten integers: ");
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(input.nextInt());
        }
        removeDuplicate(list);
    }

    public static void removeDuplicate(ArrayList<Integer> list) {
        System.out.print("The distinct integers are ");
        for (int i = 0; i < list.size(); i++) {
            if (list.indexOf(list.get(i)) == i) {
                System.out.print(list.get(i) + " ");
            }
        }
    }
}
