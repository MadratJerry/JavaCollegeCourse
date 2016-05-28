package pers.crazymouse.exercises;

/**
 * Created by crazymouse on 5/28/16.
 */
public class Ex12_6 {
    public static void main(String[] args) {
        System.out.println(hexToDecimal("ABCG"));
    }

    public static int hexToDecimal(String hex) throws NumberFormatException {
        int decimalValue = 0;
        for (int i = 0; i < hex.length(); i++) {
            char hexChar = hex.charAt(i);
            decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
        }
        return decimalValue;
    }

    public static int hexCharToDecimal(char ch) throws NumberFormatException {
        ch = Character.toUpperCase(ch);
        if (!(ch >= 'A' && ch <= 'F' || Character.isDigit(ch))) {
            throw new NumberFormatException();
        }

        if (ch >= 'A' && ch <= 'F') {
            return 10 + ch - 'A';
        } else if (ch >= 'a' && ch <= 'f') {
            return 10 + ch - 'a';
        } else {
            return ch - '0';
        }
    }
}
