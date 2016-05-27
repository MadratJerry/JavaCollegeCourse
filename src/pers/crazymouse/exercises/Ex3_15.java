package pers.crazymouse.exercises;

import java.util.Scanner;

public class Ex3_15 {
    public static void main(String[] args) {
        int luck = 0;
        for (int i = 0; i < 3; i++) {
            luck *= 10;
            luck += GetRandomNumber(9);
        }
        int num = PrintAndGetInt("Enter your number: ");
        int luckHash[];
        int numHash[];
        luckHash = TurnToHash(luck);
        numHash = TurnToHash(num);
        if (num == luck)
            System.out.println("$10000");
        else {
            int price = 0;
            for (int i = 0; i < 9; i++)
                if (luckHash[i] > 0 && numHash[i] > 0)
                    price += luckHash[i] > numHash[i] ? numHash[i] : luckHash[i];
            price *= 1000;
            System.out.printf("$%d", price);
        }
    }

    public static int GetRandomNumber(int x) {
        return (int) (Math.random() * (x + 1));
    }

    public static int PrintAndGetInt(String msg) {
        System.out.print(msg);
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    public static int[] TurnToHash(int x) {
        int hash[] = new int[10];
        while (x != 0) {
            hash[x % 10]++;
            x /= 10;
        }
        return hash;
    }
}
