package pers.crazymouse.exercises;

/**
 * Created by crazymouse on 5/28/16.
 */
public class Ex12_7 {
    public static void main(String[] args) {
        System.out.println(binaryToDecimal("110112"));
    }

    public static int binaryToDecimal(String binaryString) throws NumberFormatException {
        int decimalValue = 0;
        for (int i = 0; i < binaryString.length(); i++) {
            int binaryNum = binaryString.charAt(i) - '0';
            if (binaryNum == 1 || binaryNum == 0) {
                decimalValue = decimalValue * 2 + binaryNum;
            } else {
                throw new NumberFormatException();
            }
        }
        return decimalValue;
    }
}
