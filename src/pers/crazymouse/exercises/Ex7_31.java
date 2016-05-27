package pers.crazymouse.exercises;

import java.util.Scanner;

public class Ex7_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter list1: ");
        int n1 = input.nextInt();
        int list1[] = new int[n1];
        for (int i = 0; i < n1; i++)
            list1[i] = input.nextInt();
        System.out.print("Enter list2: ");
        int n2 = input.nextInt();
        int list2[] = new int[n2];
        for (int i = 0; i < n2; i++)
            list2[i] = input.nextInt();
        System.out.print("The merged list is ");
        int newlist[] = merge(list1, list2);
        for (int i = 0; i < newlist.length; i++)
            System.out.print(newlist[i] + " ");
    }

    public static int[] merge(int[] list1, int[] list2) {
        int newlist[] = new int[list1.length + list2.length - 1];
        for (int i = 0, j = 0; i + j < list1.length + list2.length - 1; ) {
            if (j == list2.length - 1 || list1[i] <= list2[j]) {
                newlist[i + j] = list1[i];
                i++;
            } else if (i == list1.length - 1 || list1[i] > list2[j]) {
                newlist[i + j] = list2[j];
                j++;
            }
            System.out.print(i + " " + j + "\n");
        }
        return newlist;
    }
}
