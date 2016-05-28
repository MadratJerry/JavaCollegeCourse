package pers.crazymouse.exercises;

import pers.crazymouse.exercises.myclass.BinaryFormatException;

/**
 * Created by crazymouse on 5/28/16.
 */
public class Ex12_9 {
    public static void main(String[] args) throws BinaryFormatException {
        try {
            System.out.println(Ex12_7.binaryToDecimal("103"));
        } catch (NumberFormatException ex) {
            throw new BinaryFormatException();
        }
    }
}
