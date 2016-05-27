package pers.crazymouse.exercises;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by crazymouse on 5/27/16.
 */
public class Ex11_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        int num = m;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 2; i <= num; i++) {
            if (num % i == 0) {
                if (hashMap.get(i) != null) {
                    hashMap.put(i, hashMap.get(i) + 1);
                } else {
                    hashMap.put(i, 1);
                }
                num /= i;
                i = 1;
            }
        }
        int result = 1;
        Set<Integer> key = hashMap.keySet();
        for (int i : key) {
            if (hashMap.get(i) % 2 != 0) {
                result *= i;
            }
        }
        System.out.println(result);
    }
}
