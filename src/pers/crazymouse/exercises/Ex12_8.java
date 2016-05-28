package pers.crazymouse.exercises;

import pers.crazymouse.exercises.myclass.HexFormatException;

/**
 * Created by crazymouse on 5/28/16.
 */
public class Ex12_8 {
    public static void main(String[] args) throws HexFormatException {
        try {
            System.out.println(Ex12_6.hexToDecimal("ABCG"));
        } catch (NumberFormatException ex) {
            throw new HexFormatException();
        }
    }
}
