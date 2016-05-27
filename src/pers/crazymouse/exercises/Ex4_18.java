package pers.crazymouse.exercises;

import java.util.HashMap;
import java.util.Scanner;

public class Ex4_18 {
    public static void main(String[] args) {
        System.out.print("Enter two characters: ");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        HashMap<Character, String> hashmap = new HashMap<Character, String>();
        hashmap.put('M', "Mathematics");
        hashmap.put('C', "Computer Science");
        hashmap.put('I', "Information Technology");
        hashmap.put('1', "Freshman");
        hashmap.put('2', "Primary");
        hashmap.put('3', "Junior");
        hashmap.put('4', "Senior");
        System.out.printf("%s %s", hashmap.get(str.charAt(0)), hashmap.get(str.charAt(1)));
    }
}
